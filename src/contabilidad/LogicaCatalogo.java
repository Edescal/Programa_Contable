package contabilidad;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

public final class LogicaCatalogo {
    private final ArrayList<Cuenta> catalogo;
    
    
    public LogicaCatalogo(){
        this.catalogo = new ArrayList<Cuenta>();
        cargarCuentas();
    }
    
    private void cargarPlantilla() {
        catalogo.add(new Cuenta("Activo", "1"));
        catalogo.add(new Cuenta("Pasivo", "2"));
        catalogo.add(new Cuenta("Capital", "3"));
        catalogo.add(new Cuenta("Ingresos por servicios", "4"));
        catalogo.add(new Cuenta("Costo de ventas", "5"));
        catalogo.add(new Cuenta("Utilidad (pérdida) bruta", "6"));
        catalogo.add(new Cuenta("Gastos operativos", "7"));
        catalogo.add(new Cuenta("Total de gastos generales", "8"));
        catalogo.add(new Cuenta("Utilidad antes de intereses", "9"));
        catalogo.add(new Cuenta("Utilidad neta", "0"));
    }
    
    public void cargarCuentas() {
        catalogo.clear();
        cargarPlantilla();
        
        //Se lee el archivo con las cuentas y se separa cada fila
        var g = new GenerarReporte();
        String archivo = g.readCSV();
        String[] filas = archivo.split("\n");
        
        //Cada fila es una cuenta y se procesa individualmente
        for(int i = 0; i < filas.length; i++) {
            //Quitar los caracteres especiales
            filas[i] = filas[i].replace("\n", "");
            filas[i] = filas[i].replace("\t", "");
            
            //Hacer otro arreglo con cada columna
            var col = filas[i].split(",", -1);
            //Si la fila no tiene nada, se pasa a la siguiente
            if(col[0].isEmpty()) continue;
            
            //for(var s: filas) System.out.println("QUE "+s);
            
            //Quitar espacios en blanco
            var id = col[0].trim();
            var nombre = col[1].trim();
            var saldo = 125000d;
            try {
                saldo = Double.parseDouble(col[2].trim());
            } catch(InputMismatchException e) {
                System.err.println("Error al parsear: "+e.getMessage());
            } catch (Exception e) {
                System.err.println("Error genérico: "+e.getMessage());
            }

            //Encontrar la cuenta padre para ligarla
            if (id.length() > 1){
                //Esto obtiene codigo de la cuenta padre
                //Se necesita para poder buscarla en el catálogo
                var idPadre = id.substring(0, id.length()-1);
                
                //Por cada cuenta principal, se busca en todos sus hijos
                Cuenta padre = null;
                for(var c: catalogo) {
                    padre = c.buscarSubcuenta(idPadre);
                    //Si ya se encontró, dejar de buscar
                    if (padre != null) break;
                }
                
                //Si se encontró la cuenta padre, añadirla como hija
                if (padre != null) {
                    padre.addCuenta(new Cuenta(nombre, saldo, padre));
                }
            }
        }
        
    }
    
    public void guardarCuentas(){
        String path = System.getProperty("user.dir") + "/Data";
        try {
            String info = "";
            for(int i = 0; i < catalogo.size(); i++) {
                if (i > 0)
                    info += "\n";
                info += catalogo.get(i).toString().replace("\t", "  ");
            }

            
            Writer writer = new FileWriter(path+"//catalogo.csv");
            
            writer.write(info);
            writer.close();
            
        } catch(IOException e) {
            System.out.println("IOException");
        } catch(Exception e) {
            System.out.println("Exception");
        }
    }
    
    public void exportarCuentas() {
        String info = "";
        for(int i = 0; i < catalogo.size(); i++) {
            if (i > 0)
                info += "\n";
            info += catalogo.get(i).toString();
        }
        
        var filas = info.split("\n");

        //Para escribir sobre el archivo sin errores, hay que quitar los \n  \t y las comas
        for(int i = 0; i < filas.length; i++) {
            filas[i] = filas[i].replace("\n", "");
            filas[i] = filas[i].replace("\t", "  ");
            //filas[i] = filas[i].replace(",", "");
        }
        
        //Se escribe en la plantilla pdf
        var g = new GenerarReporte();
        g.generarReporte(filas);
    }
    
    public void abrirReporte() throws IOException {
        var r = new GenerarReporte();
        r.abrirReporte();
    }
    
    public Cuenta buscar(String nombre) {
        Cuenta cuenta = null;
        //Buscar en todas las cuentas principales
        for(Cuenta c: catalogo) {
            //buscarSubcuenta() también busca en todos los hijos
            cuenta = c.buscarSubcuenta(nombre);
            if (cuenta != null)
                break;
        }
        //Regresar el resultado, si regresa null, no se encontró nada
        return cuenta;
    }
    
    //Esta sobrecarga busca una cuenta, pero puede omitir ciertos ids
    public Cuenta buscar(String nombre, String[] omitirCodigos) {
        Cuenta cuenta = null;
        //Buscar en todas las cuentas principales
        for(Cuenta c: catalogo) {
            //buscarSubcuenta() también busca en todos los hijos
            cuenta = c.buscarSubcuenta(nombre, omitirCodigos);
            if (cuenta != null) {
                break;
            }
                
        }
        //Regresar el resultado
        return cuenta;
    }
    
    @Override
    public String toString() {
        var builder = new StringBuilder();
        
        for(Cuenta c: catalogo) {
            builder.append(c.toString());
            builder.append("\n");
        }
        
        return builder.toString();
    }
    
    
}

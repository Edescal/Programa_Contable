package contabilidad;
import java.util.*;

public class Categoria {/*
    private Categoria padre;
    private String id;
    private String nombre;
    private ArrayList<Categoria> cuentas;
    
    public Categoria(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.padre = null;
        this.cuentas = new ArrayList<Categoria>();
    }
    
    public Categoria(String nombre, Categoria padre) {
        this.nombre = nombre;
        this.padre = padre;
        this.id = padre.getId()+(padre.getCantidadSubcuentas()+1);
        this.cuentas = new ArrayList<Categoria>();
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getId(){
        return this.id;
    }
    
    public int getCantidadSubcuentas() {
        return cuentas.size();
    }
    
    public Categoria[] subcuentas(){
        Categoria[] sc = new Categoria[cuentas.size()];
        for(int i = 0; i < cuentas.size(); i++){
            sc[i] = cuentas.get(i);
        }
        return sc;
    }
    
    public void addCuenta(Categoria c){
        cuentas.add(c);
    }
    
    public String toString() {
        
        String separador = "";
        for(int i = 1; i < id.length(); i++)
            separador += "\t";
        
        String msg = separador+nombre + " ("+id+")";
        for(var c : cuentas){
            msg += "\n"+c.toString();
        }
        return msg;
    }
    
    public Categoria buscarSubcuenta(String id){
        Categoria c = null;
        for(Categoria sc: cuentas) {
            if (sc.getId().equals(id)) {
                c = sc;
                break;
            }
        }
        return c;
    }*/
}

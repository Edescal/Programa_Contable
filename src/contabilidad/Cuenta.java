package contabilidad;

import java.util.*;

public class Cuenta {

    private Cuenta padre;
    private String id;
    private String nombre;
    private ArrayList<Cuenta> cuentas;

    public Cuenta(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.padre = null;
        this.cuentas = new ArrayList<Cuenta>();
    }

    public Cuenta(String nombre, Cuenta padre) {
        this.nombre = nombre;
        this.padre = padre;
        this.id = padre.getId() + (padre.getCantidadSubcuentas() + 1);
        this.cuentas = new ArrayList<Cuenta>();
    }

    public Cuenta() {
        this.nombre = "CUENTA";
        this.id = "####";
    }

    
    public String getNombre() {
        return this.nombre;
    }

    public String getId() {
        return this.id;
    }

    public int getCantidadSubcuentas() {
        if (cuentas == null) return 0;
        return cuentas.size();
    }
    
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public Cuenta[] subcuentas() {
        Cuenta[] sc = new Cuenta[cuentas.size()];
        for (int i = 0; i < cuentas.size(); i++) {
            sc[i] = cuentas.get(i);
        }
        return sc;
    }

    public void addCuenta(Cuenta c) {
        cuentas.add(c);
    }

    @Override
    public String toString() {
        
        String separador = "";
        for(int i = 0; i < id.length(); i++)
            separador += "\t";
        
        String msg = id+","+separador+nombre;
        for(var c: cuentas)
            msg += "\n"+c.toString();
        
        return msg;
    }

    public Cuenta buscarSubcuenta(String id) {
        if (this.id.equals(id)) return this;
        
        Cuenta c = null;
        for (Cuenta sc : cuentas) {
            c = sc.buscarSubcuenta(id);
            if (c != null) break;
        }
        return c;
    }
    
    public void eliminar() {
        if (padre == null) {
            System.out.println("No se puede eliminar");
            return;
        }
        
        padre.cuentas.remove(this);
        System.out.println("Se eliminó del padre");
    }

}

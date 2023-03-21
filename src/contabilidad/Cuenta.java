package contabilidad;

import java.util.*;

public final class Cuenta {
    private String id;
    private String nombre;
    private double saldo;
    private Cuenta padre;
    private final ArrayList<Cuenta> cuentas;

    public Cuenta(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.saldo = 0;
        this.padre = null;
        this.cuentas = new ArrayList<Cuenta>();
    }

    public Cuenta(String nombre, Cuenta padre) {
        this.nombre = nombre;
        this.padre = padre;
        this.saldo = 0;
        this.id = padre.getId() + (padre.getCantidadSubcuentas() + 1);
        this.cuentas = new ArrayList<Cuenta>();
    }
    
    public Cuenta(String nombre, double saldo, Cuenta padre) {
        this.nombre = nombre;
        this.padre = padre;
        this.saldo = saldo;
        this.id = padre.getId() + (padre.getCantidadSubcuentas() + 1);
        this.cuentas = new ArrayList<Cuenta>();
    }
    
    public Cuenta(String nombre, String id, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.saldo = 0;
        this.padre = null;
        this.cuentas = new ArrayList<Cuenta>();
    }
    
    public Cuenta() {
        this.nombre = "";
        this.id = "";
        this.saldo = 0;
        this.padre = null;
        this.cuentas = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getId() {
        return this.id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        if (this.saldo < 0)
            this.saldo = 0;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public Cuenta getPadre() {
        return this.padre;
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
        
        String msg = id+","+separador+nombre+", "+saldo;
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
    
    public Cuenta buscarSubcuenta(String id, String[] omitirIds) {
        
        if (this.id.equals(id)) {
            boolean omitir = false;
            for (String omitirId : omitirIds) {
                if (this.id.equals(omitirId))
                    omitir = true;
            }
            
            if (!omitir) 
                return this;
        }
        
        Cuenta c = null;
        for (Cuenta sc : cuentas) {
            c = sc.buscarSubcuenta(id, omitirIds);
            if (c != null) break;
        }
        return c;
    }
    
    public void eliminar() {
        if (padre == null) {
            System.out.println(nombre+" no es una subcuenta de otra cuenta.");
            return;
        }
        
        System.out.println("Se eliminó la subcuenta "+nombre+" de la cuenta "+padre.getNombre());
        padre.cuentas.remove(this);
    }
    
    public int subniveles() {
        int contador = 1;
        while(padre != null){
            contador++;
            padre = padre.getPadre();
        }
        return contador;
    }

}

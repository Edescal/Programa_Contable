package contabilidad;
import java.util.*;

public class Cuenta {
    private String nombre;
    private String id;
    private ArrayList<Cuenta> subcuentas;
    
    public Cuenta(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.subcuentas = new ArrayList<Cuenta>();
    }
    
    public void addSubcuenta(Cuenta sc){
        for(var sc_: subcuentas){
            if (sc.getId().equals(sc.getId())){
                //repetido
                return;
            }
        }
        subcuentas.add(sc);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String codigo) {
        this.id = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
    
    public Cuenta buscarSubcuenta(String id){
        Cuenta c = null;
        for(Cuenta sc: subcuentas) {
            if (sc.getId().equals(id)) {
                c = sc;
                break;
            }
        }
        return c;
    }
}

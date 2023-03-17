package contabilidad;

public class Tests {
    
    public static void main(String[] args) {
        testActs();
        
        
    }
    
    static void testActs() {
        var activos = new Cuenta("Activo", "1");
        activos.addCuenta(new Cuenta("Circulante", activos));
        activos.addCuenta(new Cuenta("No Circulante", activos));
        
        var circulante = activos.buscarSubcuenta("11");
        if (circulante != null) {
            circulante.addCuenta(new Cuenta("Caja", circulante));
            circulante.addCuenta(new Cuenta("Bancos", circulante));
        }

        var noCirculante = activos.buscarSubcuenta("12");
        noCirculante.addCuenta(new Cuenta("Equipo de Computo", noCirculante));
        
        
        System.out.println(activos.toString());
        
        
        var pasivos = new Cuenta("Pasivo", "2");
        pasivos.addCuenta(new Cuenta("Corto plazo", pasivos));
        pasivos.addCuenta(new Cuenta("Largo plazo", pasivos));
        
        var cortoPlazo = pasivos.buscarSubcuenta("21");
        cortoPlazo.addCuenta(new Cuenta("Documentos por pagar", cortoPlazo));
        
        System.out.println(pasivos.toString());
    }
}

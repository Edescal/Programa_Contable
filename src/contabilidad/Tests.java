package contabilidad;

public class Tests {
    
    public static void main(String[] args) {
        
        var activos = new Categoria("Activo", "1");
        activos.addCuenta(new Categoria("Circulante", activos));
        activos.addCuenta(new Categoria("No Circulante", activos));
        
        var circulante = activos.buscarSubcuenta("11");
        circulante.addCuenta(new Categoria("Caja", circulante));
        circulante.addCuenta(new Categoria("Bancos", circulante));

        var noCirculante = activos.buscarSubcuenta("12");
        noCirculante.addCuenta(new Categoria("Equipo de Computo", noCirculante));
        
        
        System.out.println(activos.toString());
        
        
        var pasivos = new Categoria("Pasivo", "2");
        pasivos.addCuenta(new Categoria("Corto plazo", pasivos));
        pasivos.addCuenta(new Categoria("Largo plazo", pasivos));
        
        var cortoPlazo = pasivos.buscarSubcuenta("21");
        cortoPlazo.addCuenta(new Categoria("Documentos por pagar", cortoPlazo));
        
        System.out.println(pasivos.toString());
    }
    
    
}

public class PuntoVenta {
    LectorOptico lector;
    public PuntoVenta(LectorOptico lector) {
        this.lector = lector;
    }

    public void procesarProducto(){

        String codigo = lector.escanearCodigo();

        System.out.println("Codigo del producto: "+codigo);
        System.out.println("Producto procesado.");
    }
}

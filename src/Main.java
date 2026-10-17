public class Main {
    public static void main(String[] args) {

        LectorOptico laser = new EscanerLaser();

        PuntoVenta caja = new PuntoVenta(laser);
        caja.procesarProducto();

        System.out.println("--------------------");

        LectorOptico qr = new CamaraQR();

        caja = new PuntoVenta(qr);
        caja.procesarProducto();
    }
}
package cl.kibernumacademy.service;

public class servicioDescuento {
    public double aplicarDescuento(double precio) {
        if (precio > 100_000) {
            return precio * 0.85;
        } else if (precio >= 50_000) {
            return precio * 0.90;
        } else {
            return precio;
        }
    }
}

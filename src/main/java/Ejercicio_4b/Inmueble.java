package Ejercicio_4b;

public class Inmueble {
    
    protected int identificadorInmobiliario;
    protected int area; // Atributo que identifica el área de un inmueble
    protected String direccion; /* Atributo que identifica la dirección de
    un inmueble */
    protected double precioVenta; /* Atributo que identifica el precio de
    venta de un inmueble */
    
    
    Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    
    double calcularPrecioVenta(double valorArea) {
        precioVenta = area * valorArea;
        return precioVenta;
    }
   
    void imprimir() {
        System.out.println("Identificador inmobiliario = " +
        identificadorInmobiliario);
        System.out.println("Area =" + area);
        System.out.println("Dirección = " + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}

package Ejercicio_4b;

public class InmuebleVivienda extends Inmueble{
    protected int numeroHabitaciones;
    protected int numeroBaños;
    
    public InmuebleVivienda(int identificadorInmobiliario, int area, String
        direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion); /* Invoca al
        constructor de la clase padre */
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
 
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones = " +
        numeroHabitaciones);
        System.out.println("Número de baños = " + numeroBaños);
    }
}

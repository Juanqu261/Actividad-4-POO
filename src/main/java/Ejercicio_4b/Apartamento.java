package Ejercicio_4b;

public class Apartamento extends InmuebleVivienda {
    public Apartamento(int identificadorInmobiliario, int area, String
        direccion, int numeroHabitaciones, int numeroBaños) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBaños);
        }
        
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}

package Ejercicio_4b;

public class ApartaEstudio extends Apartamento {
    protected static double valorArea = 1500000;
    
    public ApartaEstudio(int identificadorInmobiliario, int area, String
        direccion, int númeroHabitaciones, int númeroBaños) {
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitación y un solo baño
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}

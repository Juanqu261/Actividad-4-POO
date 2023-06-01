package Ejercicio_4b;

public class CasaRural extends Casa{
    protected static double valorArea = 1500000;
    /* Atributo que identifica la distancia a la que se encuentra la casa
    rural de la cabecera municipal */
    protected int distanciaCabera;
    // Atributo que identifica la altitud a la que se encuentra una casa rural
    protected int altitud;
    
  
    public CasaRural(int identificadorInmobiliario, int area, String
        direccion, int numeroHabitaciones, int numeroBaños, int
        numeroPisos, int distanciaCabera, int altitud) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Distancia la cabecera municipal = " +
        numeroHabitaciones + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud +
        " metros.");
        System.out.println();
    }
}

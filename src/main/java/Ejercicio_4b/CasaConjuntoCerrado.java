package Ejercicio_4b;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;
   
    public CasaConjuntoCerrado(int identificadorInmobiliario, int área,
        String dirección, int númeroHabitaciones, int númeroBaños,
        int númeroPisos, int valorAdministración, boolean tienePiscina,
        boolean tieneCamposDeportivos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños, númeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = " +
        valorAdministracion);
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " +
        tieneCamposDeportivos);
        System.out.println();
    }
}

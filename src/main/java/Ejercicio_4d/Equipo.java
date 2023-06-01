package Ejercicio_4d;
import java.util.*;

public class Equipo {
    private String nombre; /* Del equipo */
    private static double totalTiempo; /*   Tiempo del equipo */
    private String país; 
    Vector listaCiclistas; // Atributo que define un vector de objetos ciclista
    
    public Equipo(String nombre, String país) {
        this.nombre = nombre;
        this.país = país;
        totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
        listaCiclistas = new Vector(); /* Se crea el vector de ciclistas que
        conforma el equipo */
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String getPaís() {
        return país;
    }
    
    private void setPaís(String país) {
        this.país = país;
    }
    
    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
    }
    
    void listarEquipo() {
        /* Se recorre el vector de ciclistas y para cada elemento se
        imprime el nombre del ciclista */
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i); 
            System.out.println(c.getNombre());
        }
    }
    /**
    * Método que busca un ciclista ingresado por teclado
    */
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in); 
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclistas.size(); i++) { /* Se recorre el vector
            de ciclistas */
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se obtiene
            un elemento del vector */
            if (c.getNombre().equals(nombreCiclista)) { /* Si el nombre
                ingresado se encuentra */
                System.out.println(c.getNombre());
            }
        }
    }

    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el vector
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se obtiene
            un elemento del vector */
            // Se acumula el tiempo del ciclista en el tiempo del equipo
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }
    
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + país);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}

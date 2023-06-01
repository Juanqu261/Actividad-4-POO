package Ejercicio_4c;
import java.util.Scanner;

public class main_4c {
    public static void main(String[] args) {
        
        int ani;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De que animal desea informacion?");
        System.out.println("Perro[1]--Lobo[2]--Leon[3]--Gato[4] : ");
        ani = sc.nextInt();
        
        if (ani == 1) {
            Perro p = new Perro();
            System.out.println("\n"+p.getAlimentos());
            System.out.println(p.getNombreCientifico());
            System.out.println(p.getHabitat());
            System.out.println(p.getSonido());
        }
        else if (ani == 2) {
            Lobo l = new Lobo();
            System.out.println("\n"+l.getAlimentos()+"\n"+l.getHabitat()+"\n"+
            l.getNombreCientifico()+"\n"+l.getSonido());
        }
        else if (ani == 3) {
            Leon l1 = new Leon();
            System.out.println("\n"+l1.getAlimentos()+"\n"+l1.getHabitat()+"\n"+
            l1.getNombreCientifico()+"\n"+l1.getSonido());
        }
        else if (ani == 4) {
            Gato g = new Gato();
            System.out.println("\n"+g.getAlimentos()+"\n"+g.getHabitat()+"\n"+
            g.getNombreCientifico()+"\n"+g.getSonido());
        }
    }
}

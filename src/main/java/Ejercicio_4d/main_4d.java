package Ejercicio_4d;
import java.util.Scanner;

public class main_4d {
    public static void main(String[] args) {
        
        String country;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo: ");
        String gname = sc.nextLine();
        gname += sc.nextLine();
        System.out.println("Ingrese el pais del equipo: ");
        country = sc.next();
        Equipo e1 = new Equipo(gname,country);
        
        int seguir = 1;
        while (seguir == 1) {
            int espe;
            System.out.println("\nSeleccione el tipo de Ciclista a añadir:");
            System.out.println("Velocista[1]--Escalador[2]--ContraRelojista[3]:");
            espe = sc.nextInt();
            switch (espe) {
                case 1 ->                 {
                        int id, pp, vp;
                        System.out.println("\nIdentificador del ciclista: ");
                        id = sc.nextInt();
                        System.out.println("Nombre del ciclista: ");
                        String nm = sc.nextLine();
                        nm += sc.nextLine();
                        System.out.println("Potencia promedio: ");
                        pp = sc.nextInt();
                        System.out.println("Velocidad promedio: ");
                        vp = sc.nextInt();
                        Velocista v1 = new Velocista(id,nm,pp,vp);
                        v1.setIdentificador();
                        v1.setNombre(nm);
                        System.out.println("Posicion general del ciclista: ");
                        v1.setPosiciónGeneral(sc.nextInt());
                        System.out.println("Tiempo acumulado del ciclista: ");
                        v1.setTiempoAcumulado(sc.nextInt());
                        e1.añadirCiclista(v1);
                        e1.imprimir();
                        
                        System.out.println("\n¿Desea ingresar otro ciclista?");
                        System.out.println("Ingrese  ---> SI[1]---NO[2]: ");
                        seguir = sc.nextInt();
                    }
                case 2 ->                 {
                        int id,ap, gr;
                        System.out.println("\nIdentificador del ciclista: ");
                        id = sc.nextInt();
                        System.out.println("Nombre del ciclista: ");
                        String nm = sc.nextLine();
                        nm += sc.nextLine();
                        System.out.println("Aceleracion promedio: ");
                        ap = sc.nextInt();
                        System.out.println("Grado inclinacion de la rampa: ");
                        gr = sc.nextInt();
                        Escalador e2 = new Escalador(id,nm,ap,gr);
                        e2.setIdentificador();
                        e2.setNombre(nm);
                        System.out.println("Posicion general del ciclista: ");
                        e2.setPosiciónGeneral(sc.nextInt());
                        System.out.println("Tiempo acumulado del ciclista: ");
                        e2.setTiempoAcumulado(sc.nextInt());
                        e1.añadirCiclista(e2);
                        e1.imprimir();
                        System.out.println("\n¿Desea ingresar otro ciclista?");
                        System.out.println("Ingrese  ---> SI[1]---NO[2]: ");
                        seguir = sc.nextInt();
                    }
                case 3 ->                 {
                        int id, vm;
                        System.out.println("\nIdentificador del ciclista: ");
                        id = sc.nextInt();
                        System.out.println("Nombre del ciclista: ");
                        String nm = sc.nextLine();
                        nm += sc.nextLine();
                        System.out.println("Velocidad Maxima: ");
                        vm = sc.nextInt();
                        Contrarrelojista c1 = new Contrarrelojista(id,nm,vm);
                        c1.setIdentificador();
                        c1.setNombre(nm);
                        System.out.println("Posicion general del ciclista: ");
                        c1.setPosiciónGeneral(sc.nextInt());
                        System.out.println("Tiempo acumulado del ciclista: ");
                        c1.setTiempoAcumulado(sc.nextInt());
                        e1.añadirCiclista(c1);
                        e1.imprimir();
                        System.out.println("\n¿Desea ingresar otro ciclista?");
                        System.out.println("Ingrese  ---> SI[1]---NO[2]: ");
                        seguir = sc.nextInt();
                    }
                default -> {
                    System.out.println("\nInvalido");
                    System.out.println("¿Desea ingresar otro ciclista?");
                    System.out.println("Ingrese  ---> SI[1]---NO[2]: ");
                    seguir = sc.nextInt();
                }
            }
        }
        e1.calcularTotalTiempo();
        e1.imprimir();
    }
}

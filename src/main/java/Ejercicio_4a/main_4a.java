package Ejercicio_4a;
import java.util.Scanner;

public class main_4a {
    public static void main(String[] args) {
        float sal, tasa;
        int c;
        
        String acc = "S"; //Ciclo para volver a ingresar a alguna cuenta
        while ("S".equals(acc)) {
            System.out.println("Seleccione la cuenta a abrir--> Cuenta(1), Cuenta "
            + "de ahorros(2), Cuenta Corriente(3): ");
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();
            
            switch (c) {
                case 1 -> { //CUENTA
                    System.out.println("Ingrese el saldo actual en Cuenta(1) : ");
                    sal = sc.nextFloat();
                    System.out.println("Ingrese la tasa anual referida a la Cuenta(1) : ");
                    tasa = sc.nextFloat();
                    
                    String agg = "S"; //Ciclo para realizar otra accion
                    while("S".equals(agg)) {

                        int accion;
                        Cuenta account = new Cuenta(sal, tasa);
                        System.out.println("\n Consignar(4) \n Retirar(5) \n Calcular Interes(6)"
                        + " \n Extracto Mensual(7) \n");
                        System.out.println("Seleccione la accion: ");
                        accion = sc.nextInt();

                        switch (accion) {
                            case 4 -> {
                                System.out.println("Ingrese el valor a consignar: ");
                                account.consignar(sc.nextFloat());
                            }
                            case 5 -> {
                                System.out.println("Ingrese el valor a retirar: ");
                                account.retirar(sc.nextFloat());
                            }
                            case 6 -> {
                                account.calcularInteres();
                            }
                            case 7 -> {
                                account.extractoMensual();
                            }
                            default -> {
                                System.out.println("La accion no esta disponible");
                            }
                        }
                        System.out.println("¿Desea realizar otra accion?");
                        System.out.println("SI[S]   NO[N]  --->: ");
                        agg = sc.next();      
                    }
                }
                case 2 -> { //CUENTA AHORROS
                    System.out.println("Ingrese el saldo actual en Cuenta de ahorros(2) : ");
                    sal = sc.nextFloat();
                    System.out.println("Ingrese la tasa anual referida a la Cuenta de ahorros(1) : ");
                    tasa = sc.nextFloat();
                    
                    String agg = "S"; //Ciclo para realizar otra accion
                    while ("S".equals(agg)) {
                        
                        int accion;
                        CuentaAhorros accountA = new CuentaAhorros(sal, tasa);
                        System.out.println("\n Consignar(4) \n Retirar(5) \n Imprimir(6)"
                        + " \n Extracto Mensual(7) \n");
                        System.out.println("Seleccione la accion: ");
                        accion = sc.nextInt();
                        
                        switch (accion) {
                            case 4 -> {
                                System.out.println("Ingrese el valor a consignar: ");
                                accountA.consignar(sc.nextFloat());
                            }
                            case 5 -> {
                                System.out.println("Ingrese el valor a retirar: ");
                                accountA.retirar(sc.nextFloat());
                            }
                            case 6 -> {
                                accountA.imprimir();
                            }
                            case 7 -> {
                                accountA.extractoMensual();
                            }
                            default -> {
                                System.out.println("La accion no esta disponible");
                            }
                        }
                        System.out.println("¿Desea realizar otra accion?");
                        System.out.println("SI[S]   NO[N]  --->: ");
                        agg = sc.next();
                    }
                }
                default -> { //CUENTA CORRIENTES
                    System.out.println("Ingrese el saldo actual en Cuenta Corriente(3) : ");
                    sal = sc.nextFloat();
                    System.out.println("Ingrese la tasa anual referida a la Cuenta(3) : ");
                    tasa = sc.nextFloat();
                    
                    String agg = "S"; //Ciclo para realizar otra accion
                    while ("S".equals(agg)) {
                        
                        int accion;
                        CuentaCorriente accountC = new CuentaCorriente(sal, tasa);
                        System.out.println("\n Consignar(4) \n Retirar(5) \n Imprimir(6)"
                        + " \n Extracto Mensual(7) \n");
                        System.out.println("Seleccione la accion: ");
                        accion = sc.nextInt();
                        
                        switch (accion) {
                            case 4 -> {
                                System.out.println("Ingrese el valor a consignar: ");
                                accountC.consignar(sc.nextFloat());
                            }
                            case 5 -> {
                                System.out.println("Ingrese el valor a retirar: ");
                                accountC.retirar(sc.nextFloat());
                            }
                            case 6 -> {
                                accountC.imprimir();
                            }
                            case 7 -> {
                                accountC.extractoMensual();
                            }
                            default -> {
                                System.out.println("La accion no esta disponible");
                            }
                        }
                        System.out.println("¿Desea realizar otra accion?");
                        System.out.println("SI[S]   NO[N]  --->: ");
                        agg = sc.next();
                    }
                }
            }
            System.out.println("¿Desea entrar a otra cuenta?");
            System.out.println("SI[S]   NO[N]  --->: ");
            acc = sc.next();
        }
    }
}

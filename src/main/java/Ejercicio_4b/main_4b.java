package Ejercicio_4b;
import java.util.Scanner;

public class main_4b {
    public static void main(String args[]) {
        
        int id;
        int area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el identificador: ");
        System.out.println("Rural[1]--Indp.[2]--Conjunto[3]" +
                           "Apt.Familiar[4]--Aparta Estudio[5]" +
                           "Comercial[6]--Oficica[7] = ");
        id = sc.nextInt();
        System.out.println("Ingrese el area: ");
        area = sc.nextInt();
        System.out.println("Ingrese la direccion: ");
        String direcc = sc.nextLine();
        direcc+=sc.nextLine();

        Inmueble inm = new Inmueble(id, area, direcc);
        int valor = 0;
        
        if (id == 1){
            int numH;
            int numB;
            int numP;
            int dCabecera;
            int alt;
            
            System.out.println("Ingrese el numero de habitaciones: ");
            numH = sc.nextInt();
            System.out.println("Ingrese el numero de baños: ");
            numB = sc.nextInt();
            System.out.println("Ingrese el numero de pisos: ");
            numP = sc.nextInt();
            System.out.println("Ingrese la distancia a la cabecera: ");
            dCabecera = sc.nextInt();
            System.out.println("Ingrese la altitud: /n");
            alt = sc.nextInt();
            
            CasaRural cr = new CasaRural(id, area, direcc, 
            numH, numB, numP, dCabecera, alt);
            cr.calcularPrecioVenta(valor);
            cr.imprimir();
        }
        else if (id == 2) {
            int numH;
            int numB;
            int numP;
            
            System.out.println("Ingrese el numero de habitaciones: ");
            numH = sc.nextInt();
            System.out.println("Ingrese el numero de baños: ");
            numB = sc.nextInt();
            System.out.println("Ingrese el numero de pisos: ");
            numP = sc.nextInt();
            
            CasaIndependiente ci = new CasaIndependiente(id, 
            area, direcc, numH, numB, numP);
            ci.calcularPrecioVenta(valor);
            ci.imprimir();
        }
        else if (id == 3) {
            int numH;
            int numB;
            int numP;
            int vAdm;
            String rtp, rtcd;
            boolean tp;
            boolean tcd;
            
            System.out.println("Ingrese el numero de habitaciones: ");
            numH = sc.nextInt();
            System.out.println("Ingrese el numero de baños: ");
            numB = sc.nextInt();
            System.out.println("Ingrese el numero de pisos: ");
            numP = sc.nextInt();
            System.out.println("Ingrese el de la administracion: ");
            vAdm = sc.nextInt();
            System.out.println("Cuenta con piscina?: ");
            rtp = sc.next();
            if (rtp == "S") {
                tp = true;
            }
            else {
                tp = false;
            }
            System.out.println("Cuenta con campos deportivos?: ");
            rtcd = sc.next();
            if (rtcd == "S") {
                tcd = true;
            }
            else {
                tcd = false;
            }
            CasaConjuntoCerrado ccc = new CasaConjuntoCerrado(id,area,direcc,
            numH,numB,numP,vAdm,tp,tcd);
            ccc.calcularPrecioVenta(valor);
            ccc.imprimir();
        }
        else if (id == 4) {
            int numH;
            int numB;
            int vAdm;
            
            System.out.println("Ingrese el numero de habitaciones: ");
            numH = sc.nextInt();
            System.out.println("Ingrese el numero de baños: ");
            numB = sc.nextInt();
            System.out.println("Ingrese el de la administracion: ");
            vAdm = sc.nextInt();
            
            ApartamentoFamiliar af = new ApartamentoFamiliar(
            id,area,direcc,numH,numB,vAdm);
            af.calcularPrecioVenta(valor);
            af.imprimir();
        }
        else if (id == 5) {
            int numH;
            int numB;
            
            System.out.println("Ingrese el numero de habitaciones: ");
            numH = sc.nextInt();
            System.out.println("Ingrese el numero de baños: ");
            numB = sc.nextInt();
            
            ApartaEstudio ae = new ApartaEstudio(
            id,area,direcc,numH,numB);
            ae.calcularPrecioVenta(valor);
            ae.imprimir();
        }
        else if (id == 6) {
        }
        else if (id == 7) {  
        }
    }
}

package Ejercicio_4a;

public class Cuenta {
    
    //Atributos de la clase Cuenta
    protected float saldo; 
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    //Constructor de la clase
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }  
    //Metodo para consignar en el atributo saldo
    public void consignar(float cantidad) {
        saldo = saldo + cantidad; 
        numeroConsignaciones += 1;
    }
    //Metodo para retirar de el atributo saldo
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        /* Si la cantidad a retirar supera el saldo, el retiro no se puede
        realizar */
        if (nuevoSaldo >= 0) {
            saldo -= cantidad;
            numeroRetiros += 1;
        } else {
            System.out.println("La cantida a retirar excede el saldo actual.");
        }
    }
    //Aumenta el saldo segun el interes asociado al atributo saldo
    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12; /* Convierte la tasa anual en
        mensual */
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual; /* Actualiza el saldo aplicando el interés
        mensual */
    }
    //Cobro por uso de la cuenta
    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }
    
}

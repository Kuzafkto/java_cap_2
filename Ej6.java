import java.util.Scanner;
import java.lang.Math;
public class Ej6{
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el total a cobrar de la factura");
        double fact = sc.nextFloat();
        System.out.println("La base imponible de " + fact + " es " + Math.round(fact/1.06));
        sc.close();
    }
}
import java.util.Scanner;
import java.lang.Math;

public class Ej4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
         double euros = sc.nextFloat();
         System.out.println(euros + " euros a pesetas son " + Math.round(euros*166.38) + " pesetas");

         sc.close();
}
}
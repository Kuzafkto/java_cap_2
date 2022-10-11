/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.
 * 
 * @author KuzaFkto
 */

import java.util.Scanner;
import java.lang.Math;

public class Ej4{
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("Ingrese la cantidad de euros a convertir");
             double euros = sc.nextDouble();
             System.out.println(euros + " euros a pesetas son " + Math.round(euros*166.38) + " pesetas");
    
             sc.close();
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");        }

}
}
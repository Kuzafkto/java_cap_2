import java.util.Scanner;
import java.lang.Math;

public class Ej5{
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de pesetas a convertir en euros");
        Scanner sc = new Scanner (System.in);
        double pesetas = sc.nextFloat();
        System.out.println(pesetas + " pesetas a euros son" + Math.round(pesetas/166.38) + " pesetas");

        sc.close();
    }
}
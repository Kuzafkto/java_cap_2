/*
 *Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 *los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 *el valor de cada variable, la suma, la resta, la división y la multiplicación.

 *@author KuzaFkto
*/ 
public class Ej1 {
    public static void main(String[] args) {
        try {
            int x;
        int y;

        x=144;
        y=999;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");
        }
        
    }
}
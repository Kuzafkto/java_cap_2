/*

 *  Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) ¿es posible?
 *  
 * @author KuzaFkto
 */

public class Ej7{
    public static void main(String[] args) {
        try {
            char l= 'l';
            char e='e';
            char t='t';
            char r='r';
            char a='a';
            char s='s';
            String letras ="letras";
    
            System.out.println(l+ "" + e+ "" + t+ "" + r+ "" + a+ "" + s +" "+letras);
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");  
                }

    }
}
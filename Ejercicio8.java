/*
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?

@author KuzaFkto
 */
public class Ejercicio8{
    public static void main(String[] args) {
        
            char l= 'l';
            char e='e';
            char t='t';
            char r='r';
            char a='a';
            String word ="";
    
            word+=l;
            word+=e;
            word+=t;
            word+=r;
            word+=a;
        System.out.println(word);
       
       
    }
}
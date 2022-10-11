/*
 * Crea las variables nombre, direccion y telefono y asígnales los valores correspondientes. Muestra los valores de esas variables por pantalla de tal forma que el
resultado del programa sea el mismo que en el ejercicio 2.
 *
 * @author KuzaFkto
 */

public class Ej3{
    public static void main(String[] args) {
        try {
            String name = "Marco";
            String adress = "Street FakeStreet";
            String phone = "22222222132";
            
            System.out.printf(name + "\n" + adress + "\n" + phone);
        } catch (Exception e) {
            
             System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");
        }
       
    }
}
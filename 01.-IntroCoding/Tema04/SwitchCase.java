import javax.swing.*;

public class SwitchCase {

   public static void main(String[] args) {

      String estacion = JOptionPane.showInputDialog("Indique estación:");
      String estacion1 = estacion.toLowerCase();

      switch (estacion1) {

         case "primavera":
            System.out.println("Primavera");
            break;

         case "verano":
            System.out.println("Verano");
            break;

         case "otoño":
            System.out.println("Otoño");
            break;

         case "invierno":
            System.out.println("Invierno");
            break;

         default:
            System.out.println(
                  "La palabra introducida no corresponde con una estación del año.");
      }

   }

}

import javax.swing.*;

public class Condicional {

   public static void main(String[] args) {

      int numerolf;

      numerolf = Integer.parseInt(JOptionPane.showInputDialog("Indique el número a valorar:"));

      if (numerolf == 0) {
         System.out.println("Valor 0, neutro.");
      } else if (numerolf < 0) {
         System.out.println("El número es negativo.");
      } else {
         System.out.println("Número positivo.");
      }
   }

}
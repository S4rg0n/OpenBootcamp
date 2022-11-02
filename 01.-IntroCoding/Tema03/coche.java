import javax.swing.*;

//Segunda parte:
// Crear clase coche
public class coche {
    //Variable numérica que almacene número de puertas, es decir, atributo:
    int numPuertas;

    //Método:
    //Función que incremente el número de puertas que tiene el coche
    public void addPuertas(int incremento) {
        numPuertas += incremento;
    }

    //Objeto miCoche en el main
    public static void main(String[] args) {
        coche miCoche = new coche();
        System.out.println("Este coche tiene " + miCoche.numPuertas + " puertas.");


        miCoche.addPuertas(Integer.parseInt(JOptionPane.showInputDialog("Cuantas puertas quieres añadir??")));
        System.out.println("Ahora tiene " + miCoche.numPuertas + " puertas.");
    }


}

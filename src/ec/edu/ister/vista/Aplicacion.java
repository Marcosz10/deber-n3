package ec.edu.ister.vista;

import ec.edu.ister.modelo.Punto;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author Ariel
 */
public class Aplicacion {

    public static void main(String[] args) {
        Punto en1 = new Punto();
        
        Scanner input = new Scanner(System.in);
        String n=JOptionPane.showInputDialog("ingresa el valor de x:");
      
        en1.setPuntox1(n);
      
        en1.setPuntox2(JOptionPane.showInputDialog("ingresa el valor de y:"));
        

        JOptionPane.showMessageDialog(null,en1.toString());
        //System.out.println(en1.toString());

    }

}

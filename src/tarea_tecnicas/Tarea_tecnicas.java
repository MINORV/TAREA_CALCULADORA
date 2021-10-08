
package tarea_tecnicas;
import javax.swing.JOptionPane;

public class Tarea_tecnicas {

    
    public static void main(String[] args) {
       
 
      String a = JOptionPane.showInputDialog(null,"Ingrese el primer numero:");
       String b = JOptionPane.showInputDialog(null,"Ingrese el segundo numero:");
       double n1 = Double.parseDouble(a);
       double n2 = Double.parseDouble(b);
       double suma = n1 + n2;
       double resta = n1-n2;
       double mult= n1*n2;
       double div= n1/n2;

    
       JOptionPane.showMessageDialog(null, "Los resultados son: \n"
               + "La suma fue: " + suma + "\n"
               + "La resta fue:" + resta + "\n"
               + "La multiplicacion fue:" + mult + "\n"
               + "La division fue:" + div + "\n");
       

}}

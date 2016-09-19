package colas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class UsoCola {

    public static void main(String args[]) {
        Cola usoCola = new Cola();
         int respuesta;
        do {
            

            try {
                 respuesta = (Integer.parseInt((String) JOptionPane.showInputDialog(null, "Elige una opción: \n1: Encolar \n2: Descolar \n3: Mostrar \n4: Buscar dato \n 5: Salir ", "Opciones", 1)));
                switch (respuesta) {
                    case 1:
                        usoCola.formar();
                        break;

                    case 2:
                        usoCola.desformar();
                        break;

                    case 3:
                        usoCola.mostrarCola();
                        break;

                    case 4:
                        usoCola.mostrarCola();
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Saliendo... ");
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"opción no valida");
                        break;
                }
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println(e.toString());
                respuesta = 0;
            }
           
        } while (respuesta != 6);
    }

}

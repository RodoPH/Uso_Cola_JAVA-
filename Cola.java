package colas;
//Realizado por RodoPH
import javax.swing.JOptionPane;

public class Cola {

    int[] arreglo = new int[10];
    int dato, contador;
    int i, o;
    int pocision = 0;

    public Cola() {
        i = 0;
    }

    public void formar() {
        pocision = i + 1;
        if (comprobarColaLlena()) {
            try {
                dato = (Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un dato para " + pocision)));
                arreglo[i] = dato;
                i++;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha sucedido un error, escribe sólo datos numéricos de tipo entero");
                System.out.println(e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cola llena,imposible ingresar un dato más");
        }
    }

    private boolean comprobarColaLlena() {
        if (i <= 9) {
            return true;
        } else {
            return false;
        }
    }

    public void desformar() {
        if (comprobarColaVacia()) {
            i--;
            for (int j = 0; j <= i - 1; j++) {
                arreglo[j] = arreglo[j + 1];
            }
            arreglo[i] = 0;
        } else {
            JOptionPane.showMessageDialog(null, "Imposible descolar, la cola está vacía");
        }
    }

    private boolean comprobarColaVacia() {
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarCola() {
        o = i - 1;
        if (o >= 0) {
            o = 0;
            while (o != i) {
                System.out.print( arreglo[o] + " ");
                o++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "la cola se encuentra vacía");
        }
    }

    public void buscarElemento() {
        contador = 0;
        try {
            dato = (Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el dato a buscar")));
            for (int j = 0; j <= i - 1; j++) {
                if (arreglo[j] == dato) {
                    contador++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Dato no encotrado");
        } else if (contador == 1) {
            JOptionPane.showMessageDialog(null, "El dato ingresado está 1 vez");
        } else {
            System.out.println("Ese elemento esta " + contador + " veces");
        }
    }
}

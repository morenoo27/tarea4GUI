/* 
 *      
 *      |7| |8| |9|
 *      |4| |5| |6|
 *      |1| |2| |3|
 *      |  0  | |.|
 *
 *      this.numeros[0][2] = new JButton("9");
 *      int ancho = this.numeros[0][2].getWidth();
 *      this.numeros[0][1] = new JButton("8");
 *      this.numeros[0][0] = new JButton("7");
 *      this.numeros[1][2] = new JButton("6");
 *      this.numeros[1][1] = new JButton("5");
 *      this.numeros[1][0] = new JButton("4");
 *      this.numeros[2][3] = new JButton("3");
 *      this.numeros[2][3] = new JButton("2");
 *      this.numeros[2][3] = new JButton("1");
 *      this.numeros[3][0] = new JButton("0");
 *      this.numeros[3][0].setSize(ancho * 2, HEIGHT);
 *      this.numeros[3][1] = new JButton(".");
 */
package calculadora;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aleja
 */
public class Numeros extends JPanel {

    private JButton[][] numeros;

    public Numeros() {

        initComponents();
    }

    private void initComponents() {

        numeros = new JButton[4][3];

        /**
         * En este for lo que ahcemos es rellenar de la forma mas eficiente
         * todos los numeros del 1 al 9 como en una calculadora real
         */
        int numero = 9;
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j >= 0; j--) {
                numeros[i][j] = new JButton(String.valueOf(numero));
                numero--;
            }
        }

        /**
         * Como queremos posicionar los botones como en el prototipo de arriba
         * del todo de la pagina, necesitaremos, primero crear los botones que
         * queremos y luego redimensionar el boton que tenra el 0
         */
        this.numeros[3][0] = new JButton("0");
        this.numeros[3][1] = new JButton(".");

        this.setLayout(new GridLayout(4, 3));

        //vamos a añadir cada boton
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                //como el [3][2] no existe, tenemos que controlar eso
                if (numeros[i][j] != null) {
                    this.add(numeros[i][j]);
                }
            }
        }
        
        int ancho = this.numeros[3][0].getWidth() * 2;
        int alto = this.numeros[3][0].getHeight();
        this.numeros[3][0].setSize(new Dimension(alto, ancho));
    }

    public JButton[][] getNumeros() {
        return numeros;
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(new Numeros());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

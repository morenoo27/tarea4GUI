/*

        grupoBotones[10] = new JButton("+");
        grupoBotones[11] = new JButton("-");
        grupoBotones[12] = new JButton("*");
        grupoBotones[13] = new JButton("/");
        grupoBotones[14] = new JButton("=");
        grupoBotones[15] = new JButton("C");
 */
package calculadora;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro Moreno Martín 1ºDAW
 */
public class PanelBotones extends JPanel {

    private Numeros numeros;
    private Botonera simbolos;

    public PanelBotones() {
        initComponents();
    }

    private void initComponents() {

        this.add(new Numeros());
        this.add(new Botonera());
    }

    public Numeros getNumeros() {
        return numeros;
    }

    public Botonera getSimbolos() {
        return simbolos;
    }
    
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(new PanelBotones());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

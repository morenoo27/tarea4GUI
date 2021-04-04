/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aleja
 */
public class Botonera extends JPanel {

    private ArrayList<JButton> simbolos;

    public Botonera() {
        initComponetss();
    }

    private void initComponetss() {

        simbolos = new ArrayList<>();

        simbolos.add(new JButton("/"));
        simbolos.add(new JButton("*"));
        simbolos.add(new JButton("-"));
        simbolos.add(new JButton("+"));
        simbolos.add(new JButton("="));

        this.setLayout(new GridLayout(5, 1));
        
        for (JButton simbolo : simbolos) {
            this.add(simbolo);
        }
    }

    public ArrayList<JButton> getSimbolos() {
        return simbolos;
    }
    
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(new Botonera());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.TextArea;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;

/**
 *
 * @author Alejandro Moreno Martín 1ºDAW
 */
public class Pantalla extends JPanel { //extends JPanel

    private TextArea operacion;
    private TextArea resultado;

    private final int CARACTERES_MAXIMOS = 19;

    public Pantalla() {

        initComponents();
    }

    private void initComponents() {

        this.operacion = new TextArea(1, CARACTERES_MAXIMOS);
        this.resultado = new TextArea(1, CARACTERES_MAXIMOS);
        
        //establecemos que ambas areas no se pueden editar
        this.operacion.setEditable(false);
        this.resultado.setEditable(false);

        this.setLayout(new BorderLayout());
        this.add(operacion, BorderLayout.NORTH);
        this.add(resultado, BorderLayout.SOUTH);
    }
}

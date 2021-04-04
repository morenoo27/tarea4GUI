/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author aleja
 */
public class Pantalla extends JTextArea {

    private TextArea operacion;
    private TextArea resultado;

    private final int CARACTERES_MAXIMOS = 19;

    public Pantalla() {

        initComponents();
    }

    private void initComponents() {

        //establecemos que ambas areas no se pueden editar
        this.operacion.setEditable(false);
        this.resultado.setEditable(false);

        this.operacion.setRows(1);
        this.operacion.setColumns(CARACTERES_MAXIMOS);

        this.resultado.setRows(1);
        this.resultado.setColumns(CARACTERES_MAXIMOS);

        this.setLayout(new BorderLayout());
        this.add(operacion, BorderLayout.NORTH);
        this.add(resultado, BorderLayout.SOUTH);
    }
}

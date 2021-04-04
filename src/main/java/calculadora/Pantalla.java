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
public class Pantalla extends JTextArea { //extends JPanel

//    private TextArea operacion;
//    private TextArea resultado;
//
//    private final int CARACTERES_MAXIMOS = 19;
//
//    public Pantalla() {
//
//        initComponents();
//    }
//
//    private void initComponents() {
//
//        //establecemos que ambas areas no se pueden editar
//        this.operacion.setEditable(false);
//        this.resultado.setEditable(false);
//
//        this.operacion.setRows(1);
//        this.operacion.setColumns(CARACTERES_MAXIMOS);
//
//        this.resultado.setRows(1);
//        this.resultado.setColumns(CARACTERES_MAXIMOS);
//
//        this.setLayout(new BorderLayout());
//        this.add(operacion, BorderLayout.NORTH);
//        this.add(resultado, BorderLayout.SOUTH);
//    }
    
    private final int FONT_SIZE = 18;
    private final int LIMITE_ESCRITURA = 10;
    
    public final int CARACTERES_MAXIMOS = 19;

    public Pantalla() {
        this.setEditable(false);
        this.setFont(new Font("monospaced", Font.PLAIN, FONT_SIZE));
        this.setRows(1);
        this.setColumns(CARACTERES_MAXIMOS);
    }
}

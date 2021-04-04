/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author aleja
 */
public class PanelPrincipal extends JPanel implements ActionListener {

    private PanelBotones botonera;
    private Pantalla pantalla;
    private int tipoOperacio;

    public PanelPrincipal() {

        initComponents();
        this.tipoOperacio = -1;
    }

    private void initComponents() {
        
        // Creamos el panel de botones
        botonera = new PanelBotones();
        
        pantalla = new Pantalla();

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());
        // Colocamos la botonera y el área texto
        this.add(pantalla, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
    }
    
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(new PanelPrincipal());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

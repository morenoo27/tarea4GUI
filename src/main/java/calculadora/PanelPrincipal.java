/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro Moreno Martín 1ºDAW
 */
public class PanelPrincipal extends JPanel {

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

        //comenzamos a inicializar los actionlisteners
        /**
         * De momento, lo que haremos seran los botones de los unmeros, para asi
         * realixzar una nueva operacion en la pantalla, que sera
         * "escribir"/"write"
         */
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i != 4 && j != 1) || (i != 4 && j != 2)) {
                    botonera.getNumeros().getNumeros()[i][j].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {

                            JButton boton = (JButton) ae.getSource();
                            pantalla.write(boton.getText());
                        }
                    });
                }

                if (i == 4 && j == 1) {
                    botonera.getNumeros().getNumeros()[i][j].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            
                            JButton boton = (JButton) ae.getSource();
                            pantalla.write(boton.getText());
                        }
                    });

                    //una vez pongamos el punto, no vamosp a poder pulsarlo
                    botonera.getNumeros().getNumeros()[4][1].setEnabled(false);
                }
            }
        }
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

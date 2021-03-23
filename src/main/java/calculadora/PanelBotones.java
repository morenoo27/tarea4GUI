/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JButton;

/**
 *
 * @author alejandro
 */
public class PanelBotones {
    
    private JButton boton;
    private TipoBoton tipo;

    
    public PanelBotones() {
        initComponents();
    }
    
    private void initComponents() {

        
    }

    public JButton getPanelBotones() {
        return boton;
    }

    public void setPanelBotones(JButton boton) {
        this.boton = boton;
    }
}

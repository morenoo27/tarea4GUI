/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author alejandro
 */
public class PanelBotones extends JPanel{

    private ArrayList<TipoBoton> botonesNumeros;
    private ArrayList<TipoBoton> botonesOperandos;
    private TipoBoton tipo;
    
    //toda calculadora realmente tendra los botones igual y limpiar, asi que
    //los podemos declaras como atributos static para que los tengas todas las
    //calculadoras
    private static TipoBoton botonIgual = TipoBoton.IGUAL;
    private static TipoBoton botonLimpiar = TipoBoton.LIMPIAR;

    public PanelBotones() {
        
        botonesNumeros = new ArrayList<>();
        botonesOperandos = new ArrayList<>();
        initComponents();
    }

    private void initComponents() {

        this.botonesNumeros = crearNumeros();
        this.botonesOperandos = crearOperaciones();

    }

    public ArrayList<TipoBoton> getBotonesNumeros() {
        return botonesNumeros;
    }

    public ArrayList<TipoBoton> getBotonesOperandos() {
        return botonesOperandos;
    }

    private ArrayList<TipoBoton> crearNumeros() {

        ArrayList<TipoBoton> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            switch (i) {
                case 0:
                    tipo = TipoBoton.CERO;
                    break;
                case 1:
                    tipo = TipoBoton.UNO;
                    break;
                case 2:
                    tipo = TipoBoton.DOS;
                    break;
                case 3:
                    tipo = TipoBoton.TRES;
                    break;
                case 4:
                    tipo = TipoBoton.CUATRO;
                    break;
                case 5:
                    tipo = TipoBoton.CINCO;
                    break;
                case 6:
                    tipo = TipoBoton.SEIS;
                    break;
                case 7:
                    tipo = TipoBoton.SIETE;
                    break;
                case 8:
                    tipo = TipoBoton.OCHO;
                    break;
                case 9:
                    tipo = TipoBoton.NUEVE;
                    break;
            }
           numeros.add(tipo);
        }
        
        return numeros;
    }

    private ArrayList<TipoBoton> crearOperaciones() {
        
        ArrayList<TipoBoton> operaciones = new ArrayList<>();
        
        //COMO AHORA SOLAMENTE REALIZAMOS LA OPERACIONES BASICAS(+ - * /) 
        //PODREMOS EN ALGUN FUTURO SI QUEREMOS REALIZAR OPERACIONES MAS AVANZADAS
        final int TOTALOPERACIONES = 4;

        for (int i = 0; i < TOTALOPERACIONES; i++) {

            
            switch (i) {
                case 0:
                    tipo = TipoBoton.SUMA;
                    break;
                case 1:
                    tipo = TipoBoton.RESTA;
                    break;
                case 2:
                    tipo = TipoBoton.MULTIPLICACION;
                    break;
                case 3:
                    tipo = TipoBoton.DIVISION;
                    break;
                
            }
           operaciones.add(tipo);
        }
        
        return operaciones;
    }
}

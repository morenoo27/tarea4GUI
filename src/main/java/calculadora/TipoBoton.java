package calculadora;

import javax.swing.JButton;

/**
 * NOTAS: CON EL STRING DE LAS OPERACIONES lo que tenemos que hacer para
 * interpretarlas es hacer un swict que depenga del getValor() para asi
 * interpretar que tipo de operacion es
 * 
 * 
 * @author alejandro
 */
public enum TipoBoton {
    CERO("0"),
    UNO("1"),
    DOS("2"),
    TRES("3"),
    CUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SIETE("7"),
    OCHO("8"),
    NUEVE("9"),
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("x"),
    DIVISION("/"),
    IGUAL("="),
    LIMPIAR("C");

    private JButton boton;

    private TipoBoton(String valor) {
        this.boton = new JButton(valor);
    }

    public JButton getBoton() {
        return boton;
    }
}

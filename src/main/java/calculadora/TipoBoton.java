/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
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
    IGUAL("=");
    
    private String valor;

    private TipoBoton(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

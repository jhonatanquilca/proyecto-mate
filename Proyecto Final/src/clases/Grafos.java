/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Flor-PC
 */
public class Grafos {

    public String [][] matriz;
    public String entrada;
    public String salida;
    public String [] lenguaje;
    public String [] nodo;

    public Grafos(String[][] matriz, String entrada, String salida, String lenguaje, String nodos) {
        this.matriz = matriz;
        this.entrada = entrada;
        this.salida = salida;
        this.lenguaje = lenguaje.split(",");
        this.nodo = nodos.split(",");
    }
    
    public void tirasValidas(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                
                
            }
            
        }
    }

}

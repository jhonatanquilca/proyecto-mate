/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import sun.print.resources.serviceui;

/**
 *
 * @author Flor-PC
 */
public class Automata {

    public String[][] matriz;
    public String entrada;
    public String salida;
    public String[] lenguaje;
    public String[] estados;

    public Automata(String[][] matriz, String entrada, String salida, String[] lenguaje, String[] estados) {
        this.matriz = matriz;
        this.entrada = entrada;
        this.salida = salida;
        this.lenguaje = lenguaje;
        this.estados = estados;
    }

    public String validarTira2(String estado, String x) {
        if(x.length()<1){
//            System.out.print("("+estado+",null)->");
            
           return "("+estado+","+x+")->"; 
        }else {            
           
//            System.out.print("("+estado+","+x+")->");
            String estadoSig = getNextEstado(estado, x.charAt(0));  
            int ini=x.length()-(x.length()-1);
          return validarTira2(estadoSig,x.substring(ini,x.length()));
          
        }
        
    }
    public void validarTira(String estado, String x) {
        char[] tira = x.toCharArray();
        for (int i = 0; i < tira.length; i++) {
            String estadoSig = getNextEstado(estado, tira[i]);
            if (estadoSig != "") {
//                System.out.println(x.substring(i, x.length()).length());
//                if (x.substring(i, x.length()).length() == 0) {
                    System.out.print("(" + estado + "," + x.substring(i, x.length()) + ")->");
//                    validarTira(estadoSig, x.substring(i+1, x.length()));
//                } else {
//                    System.out.print("(" + estado + ", )->");
//                }


            }
//            else {
//                System.out.print("(" + estado + "," + x.substring(i, x.length()) + ")->");
//            }
        }
    }

    public String getNextEstado(String estadoAnt, char caracter) {
        return matriz[getPoscicionEstados(estadoAnt)][getPoscicionLenguage(caracter)];
    }

    public int getPoscicionEstados(String caracter) {
        int pos = 0;
        for (int i = 0; i < estados.length; i++) {
            if (caracter.equals(estados[i])) {
                pos = i;
            }

        }
        return pos;
    }

    public int getPoscicionLenguage(char caracter) {
        int pos = 0;
        for (int i = 0; i < lenguaje.length; i++) {
            if (lenguaje[i].equals(String.valueOf(caracter))) {
                pos = i;
            }

        }
        return pos;
    }

//    public int getPoscicionEntradas(String caracter) {
//        int pos = 0;
//        for (int i = 0; i < entrada.length; i++) {
//            if (caracter.equals(entrada[i])) {
//                pos = i;
//            }
//
//        }
//        return pos;
//    }
//
//    public int getPoscicionSalidas(String caracter) {
//        int pos = 0;
//        for (int i = 0; i < salida.length; i++) {
//            if (caracter.equals(salida[i])) {
//                pos = i;
//            }
//
//        }
//        return pos;
//    }
    public void verVector(String[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]);
            System.out.println("\t");

        }

    }

    public static void main(String[] args) {
        String[] lenguje = new String[]{"0", "1", "/"};
        String[] estados = new String[]{"A", "B", "C", "D", "E"};
        String[] entrada = new String[]{"A"};
        String[] salida = new String[]{"D", "E"};
        String[][] matriz = new String[][]{{"B", "C", ""}, {"B", "D", ""}, {"C", "", "B"}, {"", "E", ""}, {"", "", ""}};

        Automata g = new Automata(matriz, "A", "D", lenguje, estados);
        System.out.println(g.validarTira2("A", "0"));
    }
}

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
public class Grafos {

    public String[][] matriz;
    public String[] entrada;
    public String[] salida;
    public String[] lenguaje;
    public String[] estados;

    public Grafos(String[][] matriz, String[] entrada, String[] salida, String[] lenguaje, String[] estados) {
        this.matriz = matriz;
        this.entrada = entrada;
        this.salida = salida;
        this.lenguaje = lenguaje;
        this.estados = estados;
    }

    public void tirasValidas(String tira) {
        if (entradasValidas(String.valueOf(tira.charAt(0))) == null) {
            System.out.println("tira no valida");
        } else {
            for (int iTira = 0; iTira < tira.length(); iTira++) {
                for (int iEnt = 0; iEnt < entrada.length; iEnt++) {
                                        
                }
            }
        }


    }

    public boolean caminoExiste(String estado, String puntero) {
        return (matriz[getPoscicionEstados(estado)][getPoscicionLenguage(puntero)] != "");


    }

    public String[] entradasValidas(String caracterInicial) {
        String entradas = "";
        for (int i = 0; i < entrada.length; i++) {
            if (matriz[i][getPoscicionLenguage(caracterInicial)] != "") {
                String[] tmp = matriz[i][getPoscicionLenguage(caracterInicial)].split(",");
                for (int j = 0; j < tmp.length; j++) {
//                    System.out.println(tmp[j]);
//                    System.out.println(entrada[j]);
                    if (i == entrada.length) {
                        entradas += entrada[i];
                    } else {
                        entradas += entrada[i] + ",";
                    }
                }
            }
        }
//        System.out.println(entradas);
        return entradas.equals("") ? null : entradas.split(",");
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

    public int getPoscicionLenguage(String caracter) {
        int pos = 0;
        for (int i = 0; i < lenguaje.length; i++) {
            if (caracter.equals(lenguaje[i])) {
                pos = i;
            }

        }
        return pos;
    }

    public int getPoscicionEntradas(String caracter) {
        int pos = 0;
        for (int i = 0; i < entrada.length; i++) {
            if (caracter.equals(entrada[i])) {
                pos = i;
            }

        }
        return pos;
    }

    public int getPoscicionSalidas(String caracter) {
        int pos = 0;
        for (int i = 0; i < salida.length; i++) {
            if (caracter.equals(salida[i])) {
                pos = i;
            }

        }
        return pos;
    }

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
        String[][] matriz = new String[][]{{"B", "C", ""}, {"B,E", "D", ""}, {"C,D", "", "B"}, {"", "E", ""}, {"", "", ""}};

        Grafos g = new Grafos(matriz, entrada, salida, lenguje, estados);


//        g.verVector(g.entradasValidas("/"));
        g.tirasValidas("1");
    }
}

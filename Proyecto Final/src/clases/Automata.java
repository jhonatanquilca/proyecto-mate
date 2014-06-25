package clases;

import javax.swing.JOptionPane;
import sun.print.resources.serviceui;

public class Automata {

    public String[][] matriz;
    public String[] entrada;
    public String[] salida;
    public String[] lenguaje;
    public String[] estados;

    public Automata(String[][] matriz, String[] entrada, String[] salida, String[] lenguaje, String[] estados) {
        this.matriz = matriz;
        this.entrada = entrada;
        this.salida = salida;
        this.lenguaje = lenguaje;
        this.estados = estados;
    }

//    public String validarTira2(String estado, String x) {
//        if (x.length() < 1) {
////            System.out.print("("+estado+",null)->");            
//            return "(" + estado + "," + x + ")->";
//        } else {
////            System.out.print("("+estado+","+x+")->");
//            String estadoSig = getNextEstado(estado, x.charAt(0));
//            int ini = x.length() - (x.length() - 1);
//            return validarTira2(estadoSig, x.substring(ini, x.length()));
//
//        }
//
//    }
    public String validarTira2(String estado, String x) {

        if (x.length() < 1) {
//            System.out.print("(" + estado + "," + x + ")->");
            return "(" + estado + "," + x + ")->";

        } else {
//            System.out.print("(" + estado + "," + x + ")->");
            String estadoSig = getNextEstado(estado, x.charAt(0));
            int ini = x.length() - (x.length() - 1);
            if (estadoSig != "") {
                return validarTira2(estadoSig, x.substring(ini, x.length()));
            } else {
                return "(" + estado + "," + x + ")->";
            }

        }

    }

    public String validarTira1(String estado, String x) {
        String resp = "";
        if (x.length() < 1) {
            System.out.print("(" + estado + "," + x + ")->");
            resp += "(" + estado + "," + x + ")->";

        } else {

            String estadoSig = getNextEstado(estado, x.charAt(0));
            int ini = x.length() - (x.length() - 1);
            if (estadoSig != "") {
                System.out.print("(" + estado + "," + x + ")->");
                resp += validarTira1(estadoSig, x.substring(ini, x.length()));
            } else {
                System.out.print("(" + estado + "," + x + ")->");
                resp += "(" + estado + "," + x + ")->";
            }

        }
        return resp;
    }

    public void iniciarTira(String x) {
        String ent = "";

        String[] entValidas = entradasValidas(x.charAt(0));
        boolean[] entB = new boolean[entValidas.length];

//        System.out.println(entB.length);
//        verVector(entValidas);
        for (int i = 0; i < entValidas.length; i++) {

//            if (entValidas.length - 1 > i) {
//                ent = validarTira2(entValidas[i], x)+ "-";
//            } else {
            ent = validarTira2(entValidas[i], x).replace("->", "");
//            }
            String val = ent.replace("(", "").replace(")", "");
//            System.out.println(val);
//            System.out.println(val.substring(0, 1));
            if (val.length() <= 2 && validarSalida(val.substring(0, 1))) {

//                System.out.print(entValidas[i] + " valida ");
//                System.out.println(ent);
                entB[i] = true;
                break;
            } else {
                entB[i] = false;
//                System.out.print(entValidas[i] + " no valida ");
//                System.out.println(ent);
            }


//            System.out.println(ent + " " + entValidas[i] + " " + x);
        }
        try {
            validarTira2(entValidas[ver(entB)], x);
            System.out.println("Tira valida");
            validarTira1(entValidas[ver(entB)], x);
//            System.out.println(validarTira1(entValidas[ver(entB)], x));
        } catch (Exception e) {
            System.out.println("Tira invalida");
            validarTira1(entValidas[0], x);
//            System.out.println(validarTira1(entValidas[0], x));
        }

//        System.out.println(entB);
//        verVector(entB);
//        return ent.equals("") ? null : ent.split("-");
    }

    public int ver(boolean[] x) {
        int pos = -1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == true) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    public boolean validarSalida(String e) {
        boolean r = false;
        for (int i = 0; i < salida.length; i++) {
            if (salida[i].equals(e)) {
                r = true;
                break;
            }
        }
        return r;
    }

    public String[] entradasValidas(char caracterInicial) {
        String ent = "";
        for (int i = 0; i < entrada.length; i++) {
            if (matriz[getPoscicionEstados(entrada[i])][ getPoscicionLenguage(caracterInicial)] != "") {
                if (entrada.length - 1 > i) {
                    ent += entrada[i] + ",";
                } else {
                    ent += entrada[i];
                }
            }
        }
        return ent.equals("") ? null : ent.split(",");
    }

    public String getNextEstado(String estadoAnt, char caracter) {
//        JOptionPane.showMessageDialog(null, getPoscicionEstados(estadoAnt) + " " + getPoscicionLenguage(caracter));
        return matriz[getPoscicionEstados(estadoAnt)][getPoscicionLenguage(caracter)];
    }

    public int getPoscicionEstados(String caracter) {
        int pos = 0;

        for (int i = 0; i < estados.length; i++) {

            if (caracter.equals(estados[i])) {
//                JOptionPane.showMessageDialog(null, caracter + " " + estados[i]);
                pos = i;
            }

        }
//        JOptionPane.showMessageDialog(null, pos + " " + caracter);
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
        String[] entrada = new String[]{"A", "C"};
        String[] salida = new String[]{"D", "E"};
        String[][] matriz = new String[][]{{"B", "C", ""}, {"B", "D", ""}, {"C", "", "B"}, {"", "E", ""}, {"", "", ""}};

        Automata g = new Automata(matriz, entrada, salida, lenguje, estados);
//        g.verVector(g.entradasValidas('0'));
        g.iniciarTira("000001110");
//        g.validarTira(ini);
//        System.out.println(g.validarTira2("A", "00011").replace("->", "").replace("(", "").replace(")", ""));
//        System.out.println(g.entradasValidas('/'));
//        System.out.println(g.getNextEstado("C",'/'));
//        System.out.println(g.getPoscicionLenguage('/'));
//        System.out.println(matriz[2][2]);
    }
}

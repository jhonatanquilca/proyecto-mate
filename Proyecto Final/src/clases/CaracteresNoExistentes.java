/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.KeyEvent;

public class CaracteresNoExistentes {

    public boolean presionTecla(KeyEvent evento, String[] x) {
        for (int i = 0; i < x.length; i++) {
            
            if (evento.getKeyText(evento.getKeyCode()).equals(x[i].toUpperCase())) {
                return true;

            }
        }
        return false;
    }

    // manejar evento de liberación de cualquier tecla
    public boolean sotoTecla(KeyEvent evento, String[] x) {

        for (int i = 0; i < x.length; i++) {

            if (evento.getKeyText(evento.getKeyCode()).equals(x[i])) {
                return true;
            }
        }
        return false;
    }
    
     public boolean tecla( KeyEvent evento, String[] x )
   {
          for (int i = 0; i < x.length; i++) {

            if (( evento.getKeyChar()+"").equals(x[i])) {
                return true;
            }
        }
        return false;
      
    }
}
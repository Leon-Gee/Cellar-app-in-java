
package mainapp;

import Menus.vntnMenu;
import javax.swing.JFrame;

/**
 *
 * @author  Leon
 */
public class BodegaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vntnMenu marcoMenu = new vntnMenu(); 
        marcoMenu.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoMenu.ventana.setSize(850, 500); // establece el tamaño del marco
        marcoMenu.ventana.setVisible(true); // muestra el marco
    }
    
}

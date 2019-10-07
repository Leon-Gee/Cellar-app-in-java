package mainapp;

import Menus.vntnMenu;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Leon
 */
public class BodegaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        vntnMenu marcoMenu = new vntnMenu();
        marcoMenu.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UIManager.setLookAndFeel(new WindowsLookAndFeel());
        marcoMenu.ventana.setSize(850, 500); // establece el tamaño del marco
        marcoMenu.ventana.setVisible(true); // muestra el marco
    }

}

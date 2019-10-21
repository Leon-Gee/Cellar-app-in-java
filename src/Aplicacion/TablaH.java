/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;


import clasesBase.Hortaliza;
import Colecciones.hashHortaliza;
import java.awt.BorderLayout;
import java.util.Enumeration;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author  Leon
 */
public class TablaH extends JDialog {

    private JTable muestraTab;
    private hashHortaliza coleH;

    private JScrollPane span;

    public TablaH(JFrame jf, hashHortaliza cole) {
         setTitle("HORTALIZAS");
        coleH = cole;
        int con=0;
        String[] Columnas = {"TIPO HORTALIZA", "DESCRIPCION", "NOMBRE", "CLAVE"};
        Object[][] datos = new Object[coleH.RegresaSize()][4];
         Enumeration<String> e = coleH.ordenadorids();
        
        while (e.hasMoreElements()) {
            String f = e.nextElement();
            Hortaliza m = coleH.mostrar(f);
            datos[con][0] = f;
            datos[con][1] = m.getDescripcion();
            datos[con][2] = m.getNombre();
            datos[con][3] = m.getClave();
           
             con++;
        }
       

        muestraTab = new JTable(datos, Columnas);

        add(muestraTab.getTableHeader(), BorderLayout.PAGE_START);
        add(muestraTab, BorderLayout.CENTER);
        span = new JScrollPane(muestraTab);
        span.setVisible(true);
        add(span);

        setBounds(1000, 300, 300, 300);
        setVisible(false);

    }
}

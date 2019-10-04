/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

/**
 *
 * @author  Leon
 * 
 */
import java.awt.*;
import javax.swing.*;
import Bodega.*;
import java.util.*;

public class TablaB extends JDialog {

    private JTable muestraTab;
    private hashBodega coleB;

    private JScrollPane span;

    public TablaB(JFrame jf, hashBodega cole) {
        
        setTitle("BODEGAS REGISTRADAS");

        coleB = cole;
        int con = 0;
        String[] Columnas = {"CLAVE BODEGA", "RESPONSABLE", "ESPACIO TOTAL", "ESPACIO OCUPADO", "TIPO DE HORTALIZA", "ESPACIO LIBRE"};
        Object[][] datos = new Object[coleB.RegresaSize()][6];
        Enumeration<String> e = coleB.ordenadorids();
        while (e.hasMoreElements()) {
            String f = e.nextElement();
            Bodega m = coleB.mostrar(f);
            datos[con][0] = f;
            datos[con][1] = m.getResponsable();
            datos[con][2] = m.getEspacioTotal();
            datos[con][3] = m.getEspacioOcupado();
            datos[con][4] = m.getTipoHortaliza();
            datos[con][5] = m.getEspacioLibre();

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Movimientos.HashMov;
import Movimientos.Movto_Almacen;
import Bodega.*;
import hortaliza.hashHortaliza;
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Leon
 */
public class TablaM extends JDialog {

    private JTable muestraTab;
    private HashMov coleM;
    private hashHortaliza coleH;

    private JScrollPane span;

    public TablaM(JFrame jf, HashMov cole, hashHortaliza coleHz, int tipoMov) {

        setTitle("MOVIMIENTOS");
        coleH = coleHz;
        coleM = cole;

        String[] Columnas = {"CLAVE", "TIPO DE HORTALIZA", "CANTIDAD", "TIPO DE MOVIMIENTO", "FECHA", "RESPONSABLE", "CLAVE DE LA BODEGA"};
        Object[][] datos = new Object[coleM.RegresaSize()][7];
        int con = 0;
        if (tipoMov == 0) {
            Enumeration<String> e = coleM.ordenadorids();
            while (e.hasMoreElements()) {
                String f = e.nextElement();
                Movto_Almacen m = coleM.mostrar(f);
                datos[con][0] = f;
                datos[con][1] = m.getClvHortaliza();
                datos[con][2] = m.getCantidad();
                datos[con][3] = m.getTipoMvto();
                datos[con][4] = m.getFecha();
                datos[con][5] = m.getResponsable();
                datos[con][6] = m.getClvBodega();

                con++;
            }
        }
        if (tipoMov == 1) {

            Enumeration<String> e = coleM.ordenadorids();
            while (e.hasMoreElements()) {
                String f = e.nextElement();
                Movto_Almacen m = coleM.mostrar(f);
                if (m.getTipoMvto().equals("ALTA")) {
                    datos[con][0] = f;
                    datos[con][1] = m.getClvHortaliza();
                    datos[con][2] = m.getCantidad();
                    datos[con][3] = m.getTipoMvto();
                    datos[con][4] = m.getFecha();
                    datos[con][5] = m.getResponsable();
                    datos[con][6] = m.getClvBodega();

                    con++;
                }
            }
        }
        if (tipoMov == 2) {
            Enumeration<String> e = coleM.ordenadorids();
            while (e.hasMoreElements()) {
                String f = e.nextElement();
                Movto_Almacen m = coleM.mostrar(f);
                if (m.getTipoMvto().equals("BAJA")) {
                    datos[con][0] = f;
                    datos[con][1] = m.getClvHortaliza();
                    datos[con][2] = m.getCantidad();
                    datos[con][3] = m.getTipoMvto();
                    datos[con][4] = m.getFecha();
                    datos[con][5] = m.getResponsable();
                    datos[con][6] = m.getClvBodega();

                    con++;
                }

            }
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

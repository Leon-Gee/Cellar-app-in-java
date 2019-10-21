/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventsMngrs;

import Colecciones.hashBodega;
import Aplicacion.panelBod;
import Colecciones.hashHortaliza;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Leon
 */
public class eventManagerBodega implements ActionListener {

    hashHortaliza coleHorta;
    hashBodega cole;
    panelBod f;

    public eventManagerBodega(panelBod panel, hashBodega hashB, hashHortaliza hashH) {
        f = panel;
        cole = hashB;
        coleHorta = hashH;
    }

    public void actionPerformed(ActionEvent ae) {

        String clv, Responsable, tipoHorta;
        float espacioOcupado, espacioTotal;

        Responsable = f.getTxtResponsable().getText().toUpperCase();
        espacioOcupado = (float) Float.parseFloat(f.getTxtEspacioOcupado().getText());
        espacioTotal = (float) Float.parseFloat(f.getTxtEspacioTotal().getText());
        tipoHorta = f.getListaHortaliza().getSelectedItem().toString();
        Random r = new Random();
        clv = r.nextInt(70) + "BODEGA";

  
            if (cole.insertar(clv, Responsable, espacioTotal, espacioOcupado, tipoHorta)) {

                JOptionPane.showMessageDialog(null, "Datos insertados de forma exitosa");
                limpiar();
                f.setHashBod(cole);
                f.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "No se pudieron insertar los datos, ese tipo de BODEGA ya esta registrada");
              
            }
   
    }

    private void limpiar() {
        f.getTxtTipoHorta().setText("");
        f.getTxtResponsable().setText("");
        f.getTxtEspacioTotal().setText("");
        f.getTxtEspacioOcupado().setText("");
    }

}

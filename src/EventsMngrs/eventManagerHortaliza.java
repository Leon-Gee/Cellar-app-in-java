/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventsMngrs;

import Colecciones.hashHortaliza;
import Aplicacion.panelHorta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Leon
 */
public class eventManagerHortaliza implements ActionListener {

    hashHortaliza cole;
    panelHorta f;

    public eventManagerHortaliza(panelHorta ventana, hashHortaliza coleHorta) {
        cole = coleHorta;
        f = ventana;

    }

    public void actionPerformed(ActionEvent ae) {
        String nom, des, tipo;
        int clave;
        nom = f.getTxtNombre().getText().toUpperCase();
        des = f.getTxtDescrip().getText().toUpperCase();
        clave = (int) Integer.parseInt(f.getTxtClave().getText().toUpperCase());
        tipo = f.getTxtTipoHorta().getText().toUpperCase();
        if (!cole.buscaClv(clave)) {
            if (cole.insertar(clave, nom, des, tipo)) {
                JOptionPane.showMessageDialog(null, "Datos insertados de forma exitosa");
                limpiar();
                f.setHashHorta(cole);
                f.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "No se pudieron insertar los datos, ese tipo de hortaliza ya esta registrada");
                f.getTxtTipoHorta().setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudieron insertar los datos, esa clave de hortaliza ya esta registrada");
                f.getTxtClave().setText("");
        }

    }

    private void limpiar() {
        f.getTxtClave().setText("");
        f.getTxtDescrip().setText("");
        f.getTxtNombre().setText("");
        f.getTxtTipoHorta().setText("");

    }

    public hashHortaliza getCole() {
        return cole;
    }

    public void setCole(hashHortaliza cole) {
        this.cole = cole;
    }

}

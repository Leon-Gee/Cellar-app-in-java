/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventsMngrs;

import Colecciones.HashMov;
import Colecciones.hashBodega;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import Aplicacion.panelHorta;
import Aplicacion.panelBod;
import Aplicacion.AcercaDe;
import Aplicacion.TablaB;
import Aplicacion.TablaH;
import Aplicacion.TablaM;
import Aplicacion.vntnMenu;
import Aplicacion.panelMov;
import Colecciones.hashHortaliza;
import EventsMngrs.eventManagerHortaliza;
import javax.swing.JOptionPane;

/**
 *
 * @author Leon
 *
 *
 */
public class eventmngrMenu implements ActionListener {

    private hashHortaliza hashHorta;
    private hashBodega hashBod;
    private HashMov hashM;
    private vntnMenu marco;
    private panelHorta h;
    private panelBod b;
    private panelMov mov;
    private TablaH tabH;
    private TablaM tabM;
    private TablaB tabB;
    private AcercaDe ad;
    private JFrame f;

    public eventmngrMenu(vntnMenu m, JFrame fg, hashHortaliza hashH, hashBodega hashB, HashMov hashMov) {
        f = fg;
        marco = m;
        hashHorta = hashH;
        hashBod = hashB;
        hashM = hashMov;
        ad = new AcercaDe(f);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == marco.getMeniHortalizas()) {
            h = new panelHorta(f, hashHorta);
            h.setSize(750, 300);
            h.setResizable(false);
            h.setLocationRelativeTo(null);
            h.setVisible(true);
            hashHorta = h.getHashHorta();
        }

        if (ae.getSource() == marco.getMeniBodegas()) {
            if (hashHorta.RegresaSize() > 0) {
                b = new panelBod(f, hashBod, hashHorta);
                b.setSize(750, 300);
                b.setResizable(false);
                b.setLocationRelativeTo(null);
                b.setVisible(true);
                hashBod = b.getHashBod();
            } else {
                JOptionPane.showMessageDialog(null, "Aun no se registran hortalizas");
            }
        }
        if (ae.getSource() == marco.getAlta()) {
            if (hashHorta.RegresaSize() > 0) {
                if (hashBod.RegresaSize() > 0) {
                    mov = new panelMov(f, hashHorta, hashBod, hashM);
                    mov.setSize(750, 300);
                    mov.setResizable(false);
                    mov.setLocationRelativeTo(null);
                    mov.setVisible(true);

                    hashM = mov.getMov();
                } else {
                    JOptionPane.showMessageDialog(null, "Aun no se registran bodegas");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Aun no se registran hortalizas");
            }
        }
        if (ae.getSource() == marco.getConsultaH()) {
            tabH = new TablaH(f, hashHorta);
            tabH.setSize(800, 500);
            tabH.setLocationRelativeTo(null);
            tabH.setVisible(true);

        }
        if (ae.getSource() == marco.getConsultaM()) {
            tabB = new TablaB(f, hashBod);
            tabB.setSize(1200, 500);
            tabB.setLocationRelativeTo(null);
            tabB.setVisible(true);
        }
        if (ae.getSource() == marco.getConsultaT()) {
            tabM = new TablaM(f, hashM, hashHorta, 0);
            tabM.setSize(1300, 500);
            tabM.setLocationRelativeTo(null);
            tabM.setVisible(true);
        }
        if (ae.getSource() == marco.getConsultaTMA()) {
            tabM = new TablaM(f, hashM, hashHorta, 1);
            tabM.setSize(1300, 500);
            tabM.setLocationRelativeTo(null);
            tabM.setVisible(true);
        }
        if (ae.getSource() == marco.getConsultaTMB()) {
            tabM = new TablaM(f, hashM, hashHorta, 2);
            tabM.setSize(1300, 500);
            tabM.setLocationRelativeTo(null);
            tabM.setVisible(true);
        }
        if (ae.getSource() == marco.getAcercaD()) {
            ad.setSize(500, 200);
            ad.setLocationRelativeTo(null);
            ad.setResizable(false);
            ad.setVisible(true);
        }
    }

}

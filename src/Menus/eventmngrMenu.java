/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Movimientos.HashMov;
import Bodega.hashBodega;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import hortaliza.panelHorta;
import Bodega.panelBod;
import Movimientos.panelMov;
import hortaliza.hashHortaliza;
import hortaliza.eventManagerPanel;

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

        mov = new panelMov(f, hashHorta, hashBod, hashM);

        h = new panelHorta(f, hashHorta);

        b = new panelBod(f, hashBod, hashHorta);

        ad = new AcercaDe(f);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == marco.getMeniHortalizas()) {
            h.setSize(450, 450);
            h.setVisible(true);
            hashHorta = h.getHashHorta();
        }

        if (ae.getSource() == marco.getMeniBodegas()) {
            b.setSize(450, 450);
            b.setVisible(true);
            hashBod = b.getHashBod();
        }
        if (ae.getSource() == marco.getAlta()) {
            mov.setSize(550, 550);
            mov.setVisible(true);
            hashM = mov.getMov();
        }
        if (ae.getSource() == marco.getConsultaH()) {
            tabH = new TablaH(f, hashHorta);
            tabH.setVisible(true);

        }
        if (ae.getSource() == marco.getConsultaM()) {
            tabB = new TablaB(f, hashBod);
            tabB.setVisible(true);
        }
        if (ae.getSource() == marco.getConsultaT()) {
            tabM = new TablaM(f, hashM, hashHorta, 0);
            tabM.setVisible(true);
        }
        if (ae.getSource() == marco.getConsultaTMA()) {
            tabM = new TablaM(f, hashM, hashHorta, 1);
            tabM.setVisible(true);
        }
        if (ae.getSource() == marco.getConsultaTMB()) {
            tabM = new TablaM(f, hashM, hashHorta, 2);
            tabM.setVisible(true);
        }
        if (ae.getSource() == marco.getAcercaD()) {
            System.out.print("1");
            ad.setSize(450, 450);
            ad.setVisible(true);
        }
    }

}

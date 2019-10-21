/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import EventsMngrs.eventmngrMenu;
import Colecciones.hashBodega;
import Colecciones.hashHortaliza;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import Colecciones.HashMov;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import material.componentes.*;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialOceanicTheme;

/**
 *
 * @author Leon
 */
public class vntnMenu {

    hashHortaliza hashH = new hashHortaliza();
    hashBodega hashBod = new hashBodega();
    HashMov hashMov = new HashMov();

    private JMenu altaBaja;
    /*items de consulta*/
    private JMenu reporte;
    private JMenuItem consultaM;
    private JMenuItem consultaH;
    private JMenuItem consultaT;
    private JMenuItem consultaTMA;
    private JMenuItem consultaTMB;
    private JMenuItem AcercaD;
    private JMenuItem Alta;
    private JMenuItem Baja;
    /**/
    private JMenu pagos;
    /*items de registro*/
    private JMenu registro;
    private JMenuItem meniHortalizas;
    private JMenuItem meniBodegas;
    private JMenuItem meniEntrada;
    private JMenuItem meniSalida;

    public JLabel mostrarJLabel;
    public JFrame ventana;

    public vntnMenu() {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel(new MaterialOceanicTheme()));
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(vntnMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventana = new JFrame("CONTROL DE BODEGAS");
        Font fgh = new Font("ARIAL", 1, 25);
        Icon regis = new ImageIcon("./src/images/en.png");
        Icon horta = new ImageIcon("./src/images/horta.png");
        Icon bod = new ImageIcon("./src/images/bod.png");
        Icon mov = new ImageIcon("./src/images/mov.png");
        Icon repo = new ImageIcon("./src/images/repo.png");
        Icon aggMov = new ImageIcon("./src/images/aggMov.png");
        Icon mostrarMov = new ImageIcon("./src/images/mostrar.png");
        Icon acercaD = new ImageIcon("./src/images/acerca.png");
        Icon patron = new ImageIcon("./src/images/patron.jpg");
        Icon fon = new ImageIcon("./src/images/fond.jpg");

        JMenuBar barra = new JMenuBar(); // crea la barra de menu
        /*REGISTROS DE BODEGAS Y HORTALIZAS*/
        registro = new JMenu("ALTAS");
        registro.setMnemonic('A');
        registro.setFont(fgh);
        registro.setIcon(regis);
        registro.setBorderPainted(true);

        registro.setForeground(Color.YELLOW);

        meniHortalizas = new JMenuItem("HORTALIZAS");
        meniHortalizas.setMnemonic('H');
        meniHortalizas.setFont(fgh);
        meniHortalizas.setForeground(Color.YELLOW);
        meniHortalizas.setIcon(horta);
        meniHortalizas.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));
        registro.add(meniHortalizas);

        meniBodegas = new JMenuItem("BODEGAS");
        meniBodegas.setMnemonic('B');
        meniBodegas.setFont(fgh);
        meniBodegas.setIcon(bod);
        meniBodegas.setForeground(Color.YELLOW);
        meniBodegas.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));
        registro.add(meniBodegas);

        ventana.setJMenuBar(barra); // agrega la barra de mens a la aplicacin
        barra.add(registro);

        mostrarJLabel = new JLabel("BODEGAS LEON OSWALDO");
        mostrarJLabel.setSize(840, 550);
        mostrarJLabel.setIcon(fon);
        mostrarJLabel.setForeground(Color.YELLOW);
        mostrarJLabel.setFont(fgh);

        //    ventana.getContentPane().setBackground(Color.BLUE);
        ventana.add(mostrarJLabel, BorderLayout.CENTER);

        meniEntrada = new JMenu("MOVIMIENTOS");
        meniEntrada.setMnemonic('M');
        meniEntrada.setIcon(mov);
        meniEntrada.setForeground(Color.YELLOW);
        meniEntrada.setFont(fgh);

        Alta = new JMenuItem("AGREGAR MOVIMIENTO");
        Alta.setMnemonic('p');
        Alta.setFont(fgh);
        Alta.setIcon(aggMov);
        Alta.setForeground(Color.YELLOW);
        Alta.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));
        meniEntrada.add(Alta);

        barra.add(meniEntrada);

        reporte = new JMenu("REPORTES");
        reporte.setMnemonic('R');
        reporte.setFont(fgh);
        reporte.setIcon(repo);
        reporte.setForeground(Color.YELLOW);

        consultaM = new JMenuItem("MOSTRAR BODEGAS");
        consultaM.setMnemonic('b');
        consultaM.setIcon(mostrarMov);
        consultaM.setFont(fgh);
        consultaM.setForeground(Color.YELLOW);
        consultaM.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        consultaH = new JMenuItem("MOSTRAR HORTALIZAS");
        consultaH.setMnemonic('h');
        consultaH.setIcon(mostrarMov);
        consultaH.setFont(fgh);
        consultaH.setForeground(Color.YELLOW);
        consultaH.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        consultaT = new JMenuItem("MOSTRAR MOVIMIENTOS");
        consultaT.setMnemonic('t');
        consultaT.setFont(fgh);
        consultaT.setIcon(mostrarMov);
        consultaT.setForeground(Color.YELLOW);
        consultaT.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        consultaTMA = new JMenuItem("MOSTRAR MOVIMIENTOS DE TIPO ALTA");
        consultaTMA.setMnemonic('L');
        consultaTMA.setIcon(mostrarMov);
        consultaTMA.setFont(fgh);
        consultaTMA.setForeground(Color.YELLOW);
        consultaTMA.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        consultaTMB = new JMenuItem("MOSTRAR MOVIMIENTOS DE TIPO BAJA");
        consultaTMB.setMnemonic('N');
        consultaTMB.setIcon(mostrarMov);
        consultaTMB.setFont(fgh);
        consultaTMB.setForeground(Color.YELLOW);
        consultaTMB.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        reporte.add(consultaM);
        reporte.add(consultaH);
        reporte.add(consultaT);
        reporte.add(consultaTMA);
        reporte.add(consultaTMB);
        barra.add(reporte);

        meniSalida = new JMenu("AYUDA");
        meniSalida.setMnemonic('A');
        meniSalida.setFont(fgh);
        meniSalida.setIcon(acercaD);
        meniSalida.setForeground(Color.YELLOW);

        AcercaD = new JMenuItem("ACERCA DE");
        AcercaD.setMnemonic('d');
        AcercaD.setFont(fgh);
        AcercaD.setIcon(patron);
        AcercaD.setForeground(Color.YELLOW);
        AcercaD.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));
        meniSalida.add(AcercaD);
        barra.add(meniSalida);

    }

    public JMenuItem getAcercaD() {
        return AcercaD;
    }

    public void setAcercaD(JMenuItem AcercaD) {
        this.AcercaD = AcercaD;
    }

    public JMenuItem getConsultaTMA() {
        return consultaTMA;
    }

    public void setConsultaTMA(JMenuItem consultaTMA) {
        this.consultaTMA = consultaTMA;
    }

    public JMenuItem getConsultaTMB() {
        return consultaTMB;
    }

    public void setConsultaTMB(JMenuItem consultaTMB) {
        this.consultaTMB = consultaTMB;
    }

    public JMenuItem getConsultaH() {
        return consultaH;
    }

    public void setConsultaH(JMenuItem consultaH) {
        this.consultaH = consultaH;
    }

    public JMenuItem getConsultaT() {
        return consultaT;
    }

    public void setConsultaT(JMenuItem consultaT) {
        this.consultaT = consultaT;
    }

    public JFrame getVentana() {
        return ventana;
    }

    public JMenuItem getConsultaM() {
        return consultaM;
    }

    public JMenuItem getAlta() {
        return Alta;
    }

    public JMenuItem getBaja() {
        return Baja;
    }

    public JMenuItem getMeniHortalizas() {
        return meniHortalizas;
    }

    public JMenuItem getMeniBodegas() {
        return meniBodegas;
    }

    public JMenuItem getMeniEntrada() {
        return meniEntrada;
    }

    public JMenuItem getMeniSalida() {
        return meniSalida;
    }

    public hashHortaliza getHashH() {
        return hashH;
    }

    public void setHashH(hashHortaliza hashH) {
        this.hashH = hashH;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Bodega.hashBodega;
import hortaliza.hashHortaliza;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import Movimientos.HashMov;

/**
 *
 * @author  Leon
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
        //aqui va la hash
        /*UI MANAGER DEFINIR QUE VOY A CAMBIAR FONT OCLOR ICONOS*/
        ventana = new JFrame("CONTROL DE BODEGAS");

        JMenuBar barra = new JMenuBar(); // crea la barra de mens

        /*REGISTROS DE BODEGAS Y HORTALIZAS*/
        registro = new JMenu("ALTAS");
        registro.setMnemonic('A');

        meniHortalizas = new JMenuItem("HORTALIZAS");
        meniHortalizas.setMnemonic('H');
        meniHortalizas.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));
        registro.add(meniHortalizas);

        meniBodegas = new JMenuItem("BODEGAS");
        meniBodegas.setMnemonic('B');
        meniBodegas.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));
        registro.add(meniBodegas);

        ventana.setJMenuBar(barra); // agrega la barra de mens a la aplicacin
        barra.add(registro);

        mostrarJLabel = new JLabel("BODEGAS LEON OSWALDO", SwingConstants.CENTER);
        mostrarJLabel.setForeground(Color.BLACK);
        Font fgh = new Font("ARIAL", 1, 25);
        mostrarJLabel.setFont(fgh);

        ventana.getContentPane().setBackground(Color.GRAY);
        ventana.add(mostrarJLabel, BorderLayout.CENTER);

        meniEntrada = new JMenu("MOVIMIENTOS");
        meniEntrada.setMnemonic('M');

        Alta = new JMenuItem("AGREGAR MOVIMIENTO");
        Alta.setMnemonic('p');
        Alta.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));
        meniEntrada.add(Alta);

        barra.add(meniEntrada);

        reporte = new JMenu("REPORTES");
        reporte.setMnemonic('R');

        consultaM = new JMenuItem("MOSTRAR BODEGAS");
        consultaM.setMnemonic('b');
        consultaM.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        consultaH = new JMenuItem("MOSTRAR HORTALIZAS");
        consultaH.setMnemonic('h');
        consultaH.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        consultaT = new JMenuItem("MOSTRAR MOVIMIENTOS");
        consultaT.setMnemonic('t');
        consultaT.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        consultaTMA = new JMenuItem("MOSTRAR MOVIMIENTOS DE TIPO ALTA");
        consultaTMA.setMnemonic('L');
        consultaTMA.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        consultaTMB = new JMenuItem("MOSTRAR MOVIMIENTOS DE TIPO BAJA");
        consultaTMB.setMnemonic('N');
        consultaTMB.addActionListener(new eventmngrMenu(this, ventana, hashH, hashBod, hashMov));

        reporte.add(consultaM);
        reporte.add(consultaH);
        reporte.add(consultaT);
        reporte.add(consultaTMA);
        reporte.add(consultaTMB);
        barra.add(reporte);

        meniSalida = new JMenu("AYUDA");
        meniSalida.setMnemonic('A');
        AcercaD = new JMenuItem("ACERCA DE");
        AcercaD.setMnemonic('d');
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

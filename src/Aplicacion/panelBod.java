/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Colecciones.hashBodega;
import EventsMngrs.eventManagerBodega;
import Colecciones.hashHortaliza;
import lib.*;
import javax.swing.*;
import java.awt.*;
import material.componentes.*;
import mdlaf.utils.*;
import java.util.Enumeration;

/**
 *
 * @author Leon
 */
public class panelBod extends JDialog {

    //Responsable (persona encargada de esa bodega),
    //Espacio total, Espacio ocupado, Tipo de Hortaliza que almacena
    hashBodega hashBod;
    private final JComboBox<String> listaHortaliza;
    private hashHortaliza hashHorta;
    private JLabel lblResponsable, lblEspacioTotal, lblEspacioOcupado, lblTipoHorta;
    private JStringField txtResponsable, txtTipoHorta;
    private JEnteroField txtEspacioTotal, txtEspacioOcupado;
    private JFrame fram;
    private MaterialButton btnRegistrar;

    public panelBod(JFrame fram, hashBodega hashB, hashHortaliza hashH) {

        super(fram, true);
        setTitle("REGISTRO DE BODEGAS");
        setLayout(new FlowLayout());

        hashBod = hashB;
        hashHorta = hashH;
        listaHortaliza = new JComboBox<String>();
        Enumeration<String> e = hashH.ordenadorids();

        while (e.hasMoreElements()) {
            String f = e.nextElement();
            listaHortaliza.addItem(f);
        }

        lblResponsable = new JLabel("RESPONSABLE");
        lblEspacioTotal = new JLabel("ESPACIO TOTAL");
        lblEspacioOcupado = new JLabel("ESPACIO OCUPADO");
        lblTipoHorta = new JLabel("TIPO DE HORTALIZA");

        txtResponsable = new JStringField(10);
        txtEspacioTotal = new JEnteroField(10);
        txtEspacioOcupado = new JEnteroField(10);
        txtTipoHorta = new JStringField(10);

        btnRegistrar = new MaterialButton();
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setRippleColor(MaterialColor.GREEN_800);
        btnRegistrar.setBackground(MaterialColors.GREEN_300);
        btnRegistrar.setForeground(Color.yellow);
        Dimension d = new Dimension(350, 150);
        btnRegistrar.setPreferredSize(d);
        btnRegistrar.setBorderRadius(6);
        btnRegistrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new eventManagerBodega(this, hashBod, hashH));

        add(lblResponsable);
        add(txtResponsable);

        add(lblEspacioTotal);
        add(txtEspacioTotal);

        add(lblEspacioOcupado);
        add(txtEspacioOcupado);

        add(lblTipoHorta);
        add(listaHortaliza);

        add(btnRegistrar);

        setLocationRelativeTo(null);
        fram.setVisible(true);
    }

    public JComboBox<String> getListaHortaliza() {
        return listaHortaliza;
    }

    public JTextField getTxtResponsable() {
        return txtResponsable;
    }

    public void setTxtResponsable(JStringField txtResponsable) {
        this.txtResponsable = txtResponsable;
    }

    public JTextField getTxtEspacioTotal() {
        return txtEspacioTotal;
    }

    public void setTxtEspacioTotal(JEnteroField txtEspacioTotal) {
        this.txtEspacioTotal = txtEspacioTotal;
    }

    public JTextField getTxtEspacioOcupado() {
        return txtEspacioOcupado;
    }

    public void setTxtEspacioOcupado(JEnteroField txtEspacioOcupado) {
        this.txtEspacioOcupado = txtEspacioOcupado;
    }

    public JFrame getFram() {
        return fram;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JTextField getTxtTipoHorta() {
        return txtTipoHorta;
    }

    public void setTxtTipoHorta(JStringField txtTipoHorta) {
        this.txtTipoHorta = txtTipoHorta;
    }

    public hashBodega getHashBod() {
        return hashBod;
    }

    public void setHashBod(hashBodega hashBod) {
        this.hashBod = hashBod;
    }

}

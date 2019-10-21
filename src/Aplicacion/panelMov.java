/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Colecciones.hashHortaliza;
import Colecciones.HashMov;
import clasesBase.Bodega;
import Colecciones.hashBodega;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Random;
import lib.JEnteroField;
import material.componentes.MaterialButton;
import material.componentes.MaterialColor;
import mdlaf.utils.MaterialColors;

/**
 *
 * @author Leon
 */
public class panelMov extends JDialog {

    //Clave de la hortaliza, Cantidad, Tipo (entrada o Salida), Fecha, Responsable, Bodega. 
    private Random r = new Random();
    private JLabel lblClaveHorta, lblCantidad, lblFec, lblclvBod, lblTipoMov, lblResponsable, lblEspacio, lblEspacio2;
    private JEnteroField txtCantidad, txtFec;
    private MaterialButton btnRegistrar;
    private JFrame fram;
    private HashMov mov;
    private final JComboBox<Integer> listaHortaliza;
    private final JComboBox<String> listaBodega;
    private final JComboBox<String> listaResponsable;
    private final JComboBox<String> listaMov;
    private hashHortaliza coleHorta;
    private hashBodega coleBod;

    public panelMov(JFrame fram, hashHortaliza hashH, hashBodega hashBod, HashMov mb) {

        super(fram, true);

        setTitle("REGISTRO DE MOVIMIENTOS");
        setLayout(new FlowLayout());
        mov = mb;

        eventMngr evento = new eventMngr();

        coleHorta = hashH;
        coleBod = hashBod;

        lblEspacio = new JLabel("                                                    ");
        lblEspacio2 = new JLabel("               ");
        lblClaveHorta = new JLabel("CLAVE HORTALIZA");
        lblCantidad = new JLabel("CANTIDAD");
        lblFec = new JLabel("FECHA");
        lblResponsable = new JLabel("RESPONSABLE");

        lblclvBod = new JLabel("CLAVE BODEGA  ");
        lblTipoMov = new JLabel("TIPO DE MOVIMIENTO");

        txtCantidad = new JEnteroField(10);
        txtFec = new JEnteroField(10);

        listaMov = new JComboBox<String>();
        listaMov.addItem("ENTRADA");
        listaMov.addItem("SALIDA");

        listaHortaliza = new JComboBox<Integer>();
        Enumeration<String> e = coleHorta.ordenadorids();

        while (e.hasMoreElements()) {
            String f = e.nextElement();
            listaHortaliza.addItem(coleHorta.mostrar(f).getClave());
        }
        listaBodega = new JComboBox<String>();
        Enumeration<String> b = coleBod.ordenadorids();
        while (b.hasMoreElements()) {
            String f = b.nextElement();
            listaBodega.addItem(f);
        }

        Enumeration<String> r = coleBod.ordenadorids();
        listaResponsable = new JComboBox<String>();
        while (r.hasMoreElements()) {
            String f = r.nextElement();

            listaResponsable.addItem(coleBod.mostrar(f).getResponsable().toUpperCase());
        }

        btnRegistrar = new MaterialButton();
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setRippleColor(MaterialColor.GREEN_800);
        btnRegistrar.setBackground(MaterialColors.GREEN_300);
        btnRegistrar.setForeground(Color.yellow);
        Dimension d = new Dimension(350, 150);
        btnRegistrar.setPreferredSize(d);
        btnRegistrar.setBorderRadius(6);
        btnRegistrar.addActionListener(evento);
        btnRegistrar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        add(lblClaveHorta);
        add(listaHortaliza);

        add(lblCantidad);
        add(txtCantidad);

        add(lblFec);
        add(txtFec);

        add(lblclvBod);
        add(listaBodega);

        add(lblResponsable);
        add(listaResponsable);

        //  add(lblEspacio);
        // add(lblEspacio2);
        add(lblTipoMov);
        add(listaMov);

        add(btnRegistrar);

        setLocationRelativeTo(null);
        fram.setVisible(true);

    }

    private class eventMngr implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == getBtnGuardar()) {
                String clvH, clvB, fec, respon, mvto = "";
                float can;
                clvH = listaHortaliza.getSelectedItem().toString();
                clvB = listaBodega.getSelectedItem().toString();
                fec = txtFec.getText();
                can = (Float) Float.parseFloat(txtCantidad.getText());
                respon = listaResponsable.getSelectedItem().toString();
                mvto = listaMov.getSelectedItem().toString();
                String clvM = r.nextInt(99) + "MOV";

                if (mov.insertar(clvM, clvH, can, mvto, fec, respon, clvB)) {
                    JOptionPane.showMessageDialog(null, "MOVIMIENTO REGISTRADO CON EXITO");
                    dispose();
                }else{
                     JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR EL MOVIMIENTO");
                       dispose();
                }
            }
        }
    }

    public MaterialButton getBtnGuardar() {
        return btnRegistrar;
    }

    public void setBtnGuardar(MaterialButton btnGuardar) {
        this.btnRegistrar = btnGuardar;
    }

    public hashHortaliza getColeHorta() {
        return coleHorta;
    }

    public void setColeHorta(hashHortaliza coleHorta) {
        this.coleHorta = coleHorta;
    }

    public hashBodega getColeBod() {
        return coleBod;
    }

    public void setColeBod(hashBodega coleBod) {
        this.coleBod = coleBod;
    }

    public HashMov getMov() {
        return mov;
    }

    public void setMov(HashMov mov) {
        this.mov = mov;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimientos;

import Bodega.Bodega;
import Bodega.hashBodega;
import hortaliza.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 *
 * @author Leon
 */
public class panelMov extends JDialog {
    //Clave de la hortaliza, Cantidad, Tipo (entrada o Salida), Fecha, Responsable, Bodega. 

    private JLabel lblClaveHorta, lblCantidad, lblFec, lblRes, lblclvBod, lblTipoMov;
    private JTextField txtClaveHorta, txtCantidad, txtFec, txtRes, txtclvBod, txtTipoMov;
    private JButton btnGuardar;
    private JFrame fram;
    private HashMov mov;
    private JRadioButton btnMovA;
    private JRadioButton btnMovB;
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

        lblClaveHorta = new JLabel("CLAVE HORTALIZA");
        lblCantidad = new JLabel("CANTIDAD");
        lblFec = new JLabel("FECHA");

        lblclvBod = new JLabel("CLAVE BODEGA  ");
        lblTipoMov = new JLabel("TIPO DE MOVIMIENTO(ALTA O BAJA)");

        txtClaveHorta = new JTextField(10);
        txtCantidad = new JTextField(10);
        txtFec = new JTextField(10);
        txtclvBod = new JTextField(10);

        txtTipoMov = new JTextField("ESCOGA UN TIPO DE MOVIMIENTO");
        txtTipoMov.setEditable(false);

        btnMovA = new JRadioButton("ALTA");
        btnMovB = new JRadioButton("BAJA");

        btnGuardar = new JButton("GUARDAR");
        btnGuardar.addActionListener(evento);

        add(lblClaveHorta);
        add(txtClaveHorta);

        add(lblCantidad);
        add(txtCantidad);

        add(lblFec);
        add(txtFec);

        add(lblclvBod);
        add(txtclvBod);

        add(lblTipoMov);
        add(btnMovA);
        add(btnMovB);

        add(btnGuardar);

        setLocationRelativeTo(null);
        fram.setVisible(true);
  

    }

    private class eventMngr implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            
            if (ae.getSource() == getBtnGuardar()) {
                
                String clvH, clvB, fec, respon, mvto = "";
                float can;

                can = Float.parseFloat(getTxtCantidad().getText());
                fec = getTxtFec().getText();
                if (getBtnMovA().isSelected()) {
                    mvto = "ALTA";
                }else{
                    mvto = "BAJA";
                }
                clvH = getTxtClaveHorta().getText();
                clvB = getTxtclvBod().getText();

                if (coleHorta.existe(clvH)) {
                    
                    if (coleBod.existe(clvB)) {
                        
                        Bodega obj = coleBod.mostrar(clvB);
                        respon = obj.getResponsable();
                        Random r = new Random();
                        String clvM = r.nextInt(99) + "MOV";

                        if (mov.insertar(clvM, clvH, can, mvto, fec, respon, clvB)) {
                            JOptionPane.showMessageDialog(null, "MOVIMIENTO REGISTRADO");
                            if(getBtnMovA().isSelected()) {

                                obj.setEspacioOcupado(obj.getEspacioOcupado() + can);
                                obj.setEspacioLibre((obj.getEspacioTotal() - obj.getEspacioOcupado()));
                                JOptionPane.showMessageDialog(null, "ALTA REGISTRADA");

                                dispose();
                            }
                            if (getBtnMovB().isSelected()) {
                                obj.setEspacioOcupado(coleBod.mostrar(clvB).getEspacioOcupado() - can);
                                JOptionPane.showMessageDialog(null, "BAJA REGISTRADO");

                                dispose();
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Esa bodega no esta registrada");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ese tipo de hortaliza no esta registrado");

                }

            }
        }

    }

    public JRadioButton getBtnMovA() {
        return btnMovA;
    }

    public void setBtnMovA(JRadioButton btnMovA) {
        this.btnMovA = btnMovA;
    }

    public JRadioButton getBtnMovB() {
        return btnMovB;
    }

    public void setBtnMovB(JRadioButton btnMovB) {
        this.btnMovB = btnMovB;
    }

    public JTextField getTxtClaveHorta() {
        return txtClaveHorta;
    }

    public void setTxtClaveHorta(JTextField txtClaveHorta) {
        this.txtClaveHorta = txtClaveHorta;
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    public JTextField getTxtFec() {
        return txtFec;
    }

    public void setTxtFec(JTextField txtFec) {
        this.txtFec = txtFec;
    }

    public JTextField getTxtRes() {
        return txtRes;
    }

    public void setTxtRes(JTextField txtRes) {
        this.txtRes = txtRes;
    }

    public JTextField getTxtclvBod() {
        return txtclvBod;
    }

    public void setTxtclvBod(JTextField txtclvBod) {
        this.txtclvBod = txtclvBod;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
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

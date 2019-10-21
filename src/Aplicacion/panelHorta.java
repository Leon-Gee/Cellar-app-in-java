package Aplicacion;

import Colecciones.hashHortaliza;
import EventsMngrs.eventManagerHortaliza;
import lib.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import material.componentes.*;
import mdlaf.utils.*;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import lib.*;
import javax.swing.UIManager;
//import images.img;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Leon
 */
public class panelHorta extends JDialog {

    //Clave, Nombre, Descripción. 
    private JLabel lblClave, lblNombre, lblDescrip, lblTipoHorta, lblEspacio;
    private JStringField txtNombre, txtDescrip;
    private JStringNoEspacioField txtTipoHorta;
    private JEnteroField txtClave;
    private JFrame fram;
    //  private img img;
    private MaterialButton btnRegistrar;

    private hashHortaliza hashHorta;

    // private JTextField txt;
    public panelHorta(JFrame fram, hashHortaliza cole) {

        super(fram, true);
        setTitle("REGISTRO DE HORTALIZAS");
        setForeground(Color.yellow);
        setLayout(new FlowLayout());
        hashHorta = cole;

        lblEspacio = new JLabel("                        ");
        lblClave = new JLabel("CLAVE HORTALIZA");
        lblClave.setForeground(Color.yellow);

        lblNombre = new JLabel("NOMBRE HORTALIZA");
        lblNombre.setForeground(Color.yellow);

        lblDescrip = new JLabel("DESCRIPCION HORTALIZA");
        lblDescrip.setForeground(Color.yellow);

        lblTipoHorta = new JLabel("TIPO DE HORTALIZA");
        lblTipoHorta.setForeground(Color.yellow);

        txtClave = new JEnteroField(5);
        txtClave.setForeground(Color.BLACK);
        txtNombre = new JStringField(14);
        txtNombre.setForeground(Color.BLACK);
        txtDescrip = new JStringField(14);
        txtDescrip.setForeground(Color.BLACK);
        txtTipoHorta = new JStringNoEspacioField(14);
        txtTipoHorta.setForeground(Color.BLACK);

        Icon guardar = new ImageIcon("./src/images/save_1.png");

        btnRegistrar = new MaterialButton();
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setRippleColor(MaterialColor.GREEN_800);
        btnRegistrar.setBackground(MaterialColors.GREEN_300);
        btnRegistrar.setForeground(Color.yellow);
        Dimension d = new Dimension(350, 150);
        btnRegistrar.setPreferredSize(d);
        btnRegistrar.setBorderRadius(6);
        btnRegistrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new eventManagerHortaliza(this, hashHorta));

        add(lblEspacio);

        add(lblClave);
        add(txtClave);

        add(lblNombre);
        add(txtNombre);

        add(lblDescrip);
        add(txtDescrip);

        add(lblTipoHorta);
        add(txtTipoHorta);

        add(btnRegistrar);

        setLocationRelativeTo(null);
        fram.setVisible(true);;
    }

    public JFrame getFram() {
        return fram;
    }

    public JEnteroField getTxtClave() {
        return txtClave;
    }

    public void setTxtClave(JEnteroField txtClave) {
        this.txtClave = txtClave;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JStringField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtDescrip() {
        return txtDescrip;
    }

    public void setTxtDescrip(JStringField txtDescrip) {
        this.txtDescrip = txtDescrip;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(MaterialButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JTextField getTxtTipoHorta() {
        return txtTipoHorta;
    }

    public void setTxtTipoHorta(JStringNoEspacioField txtTipoHorta) {
        this.txtTipoHorta = txtTipoHorta;
    }

    public hashHortaliza getHashHorta() {
        return hashHorta;
    }

    public void setHashHorta(hashHortaliza hashHorta) {
        this.hashHorta = hashHorta;
    }

}

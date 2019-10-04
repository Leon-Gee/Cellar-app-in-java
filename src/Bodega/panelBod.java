/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bodega;

import hortaliza.hashHortaliza;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Leon
 */
public class panelBod extends JDialog {

    //Responsable (persona encargada de esa bodega),
    //Espacio total, Espacio ocupado, Tipo de Hortaliza que almacena
    hashBodega hashBod;
    private JLabel lblResponsable, lblEspacioTotal, lblEspacioOcupado, lblTipoHorta;
    private JTextField txtResponsable, txtEspacioTotal, txtEspacioOcupado, txtTipoHorta;
    private JFrame fram;
    private JButton btnRegistrar;

    public panelBod(JFrame fram, hashBodega hashB, hashHortaliza hashH) {

        super(fram, true);
        setTitle("REGISTRO DE BODEGAS");
        setLayout(new FlowLayout());

        hashBod = hashB;

        lblResponsable = new JLabel("RESPONSABLE");
        lblEspacioTotal = new JLabel("ESPACIO TOTAL");
        lblEspacioOcupado = new JLabel("ESPACIO OCUPADO");
        lblTipoHorta = new JLabel("TIPO DE HORTALIZA");

        txtResponsable = new JTextField(10);
        txtEspacioTotal = new JTextField(10);
        txtEspacioOcupado = new JTextField(10);
        txtTipoHorta = new JTextField(10);

        btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setSize(550, 550);
        btnRegistrar.addActionListener(new eventManagerBodega(this, hashBod, hashH));

        add(lblResponsable);
        add(txtResponsable);

        add(lblEspacioTotal);
        add(txtEspacioTotal);

        add(lblEspacioOcupado);
        add(txtEspacioOcupado);

        add(lblTipoHorta);
        add(txtTipoHorta);

        add(btnRegistrar);

        setLocationRelativeTo(null);
        fram.setVisible(true);
    }

    public JTextField getTxtResponsable() {
        return txtResponsable;
    }

    public void setTxtResponsable(JTextField txtResponsable) {
        this.txtResponsable = txtResponsable;
    }

    public JTextField getTxtEspacioTotal() {
        return txtEspacioTotal;
    }

    public void setTxtEspacioTotal(JTextField txtEspacioTotal) {
        this.txtEspacioTotal = txtEspacioTotal;
    }

    public JTextField getTxtEspacioOcupado() {
        return txtEspacioOcupado;
    }

    public void setTxtEspacioOcupado(JTextField txtEspacioOcupado) {
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

    public void setTxtTipoHorta(JTextField txtTipoHorta) {
        this.txtTipoHorta = txtTipoHorta;
    }

    public hashBodega getHashBod() {
        return hashBod;
    }

    public void setHashBod(hashBodega hashBod) {
        this.hashBod = hashBod;
    }

}

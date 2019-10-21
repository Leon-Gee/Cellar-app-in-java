/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import material.componentes.*;
import mdlaf.utils.*;

/**
 *
 * @author Leon
 */
public class AcercaDe extends JDialog {

    private JLabel lblKatKaty, lblPeñururu;
    private MaterialButton btnMuestra;
    private JFrame fram;

    public AcercaDe(JFrame fram) {
        super(fram, true);
        setTitle("OSWALDO LEON");
        setLayout(new FlowLayout());
        setModal(true);

        lblKatKaty = new JLabel("INTEGRANTES DEL EQUIPO: ");
        lblKatKaty.setVisible(false);
        lblPeñururu = new JLabel(" OSCAR OSWALDO MEZA LEON ");
        lblPeñururu.setVisible(false);
        

        add(lblKatKaty);
        add(lblPeñururu);
        
        btnMuestra = new MaterialButton();
        btnMuestra.setText("Muestra integrantes");
        btnMuestra.setRippleColor(MaterialColor.GREEN_800);
        btnMuestra.setBackground(MaterialColors.GREEN_300);
        Dimension d = new Dimension(250,150);
        btnMuestra.setPreferredSize(d);
        btnMuestra.setBorderRadius(6);
   //     btnMuestra.setBounds(30, 300, 200, 60);
        btnMuestra.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnMuestra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnMuestra){
                lblKatKaty.setVisible(true);
                lblPeñururu.setVisible(true);
                
                }
            }
            
        });

        add(btnMuestra);
        setLocationRelativeTo(null);
        setVisible(false);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Leon
 */
public class AcercaDe extends JDialog {

    private JLabel lblKatKaty, lblPeñururu;
    private JButton btnMuestra;
    private JFrame fram;

    public AcercaDe(JFrame fram) {
        super(fram, true);
         setTitle("OSWALDO LEON");
        setLayout(new FlowLayout());

        lblKatKaty = new JLabel("INTEGRANTES DEL EQUIPO:"
                + " "
                + " "
                + " ");
        lblKatKaty.setVisible(false);
        lblPeñururu = new JLabel(" OSCAR OSWALDO MEZA LEON ");
        lblPeñururu.setVisible(false);

        btnMuestra = new JButton("Muestra integrantes");
        btnMuestra.setSize(550, 550);
        btnMuestra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblKatKaty.setVisible(true);
                lblPeñururu.setVisible(true);
            }

        });
        add(lblKatKaty);
        add(lblPeñururu);
        add(btnMuestra);
        setLocationRelativeTo(null);
        fram.setVisible(true);

    }
}

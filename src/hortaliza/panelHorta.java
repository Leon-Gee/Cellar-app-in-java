package hortaliza;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Leon
 */
public class panelHorta extends JDialog {

    //Clave, Nombre, Descripción. 
    private JLabel lblClave, lblNombre, lblDescrip, lblTipoHorta;
    private JTextField txtClave, txtNombre, txtDescrip, txtTipoHorta;
    private JFrame fram;
    private JButton btnRegistrar;

    private hashHortaliza hashHorta;

    // private JTextField txt;
    public panelHorta(JFrame fram, hashHortaliza cole) {

        super(fram, true);
        setTitle("REGISTRO DE HORTALIZAS");
        setLayout(new FlowLayout());
        hashHorta = cole;
        lblClave = new JLabel("CLAVE HORTALIZA");
        lblNombre = new JLabel("NOMBRE HORTALIZA");
        lblDescrip = new JLabel("DESCRIPCION HORTALIZA");
        lblTipoHorta = new JLabel("TIPO DE HORTALIZA");

        txtClave = new JTextField(12);
        txtNombre = new JTextField(12);
        txtDescrip = new JTextField(12);
        txtTipoHorta = new JTextField(12);

        btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setSize(550, 550);
        btnRegistrar.addActionListener(new eventManagerPanel(this, hashHorta));

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

    public JTextField getTxtClave() {
        return txtClave;
    }

    public void setTxtClave(JTextField txtClave) {
        this.txtClave = txtClave;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtDescrip() {
        return txtDescrip;
    }

    public void setTxtDescrip(JTextField txtDescrip) {
        this.txtDescrip = txtDescrip;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JTextField getTxtTipoHorta() {
        return txtTipoHorta;
    }

    public void setTxtTipoHorta(JTextField txtTipoHorta) {
        this.txtTipoHorta = txtTipoHorta;
    }

    public hashHortaliza getHashHorta() {
        return hashHorta;
    }

    public void setHashHorta(hashHortaliza hashHorta) {
        this.hashHorta = hashHorta;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hortaliza;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author  Leon
 */
public class hashHortaliza {

    private Hashtable<String, Hortaliza> Hortalizas = new Hashtable<String, Hortaliza>();

    public boolean insertar(int clv, String nmbr, String desc, String Tipo) {
        if (Hortalizas.containsKey(Tipo)) {
            return false;
        } else {
            Hortaliza horta = new Hortaliza(clv, nmbr, desc);
            Hortalizas.put(Tipo, horta);
            return true;
        }

    }

    public boolean eliminar(String clave) {
        if (Hortalizas.containsKey(clave)) {
            Hortalizas.remove(clave);
            return true;
        } else {
            return false;
        }
    }

    public boolean existe(String clave) {
        if (Hortalizas.containsKey(clave)) {
            return true;
        } else {
            return false;
        }
    }

    public Hortaliza mostrar(String clave) {
        if (Hortalizas.containsKey(clave)) {
            return Hortalizas.get(clave);
        } else {

            return null;
        }
    }

    public Enumeration<String> ordenadorids() {
        return Hortalizas.keys();
    }

    public int RegresaSize() {
        return Hortalizas.size();
    }

    public Object[][] ObtenerDatos() {

        Object datos[][] = new Object[Hortalizas.size()][3];
        int con = 0;
        Enumeration<String> e = Hortalizas.keys();
        while (e.hasMoreElements()) {
            String f = e.nextElement();
            Hortaliza m = Hortalizas.get(f);
            datos[con][0] = f;
            datos[con][1] = m.getDescripcion();
            datos[con][2] = m.getNombre();
            datos[con][3] = m.getClave();
             con++;
        }
        return datos;
    }

}

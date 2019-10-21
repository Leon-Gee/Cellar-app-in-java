/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import clasesBase.Bodega;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author  Leon
 */
public class hashBodega {

    private Hashtable<String, Bodega> Bodegas = new Hashtable<String, Bodega>();

    public boolean insertar(String Clave, String Responsable, float espacioTotal, float espacioOcupado, String tipoHortaliza) {
        if (Bodegas.containsKey(Clave)) {
            return false;
        } else {
            Bodega bod = new Bodega(Responsable, espacioTotal, espacioOcupado, tipoHortaliza);
            Bodegas.put(Clave, bod);
            return true;
        }

    }

    public boolean eliminar(String clave) {
        if (Bodegas.containsKey(clave)) {
            Bodegas.remove(clave);
            return true;
        } else {
            return false;
        }
    }

    public boolean existe(String clave) {
        if (Bodegas.containsKey(clave)) {
            return true;
        } else {
            return false;
        }
    }

    public Bodega mostrar(String clave) {
        if (Bodegas.containsKey(clave)) {
            return Bodegas.get(clave);
        } else {

            return null;
        }
    }

    public Enumeration<String> ordenadorids() {
        return Bodegas.keys();
    }

    public int RegresaSize() {
        return Bodegas.size();
    }

    public Object[][] ObtenerDatos() {

        Object datos[][] = new Object[Bodegas.size()][4];
        int con = 0;
        Enumeration<String> e = Bodegas.keys();
        while (e.hasMoreElements()) {
            String f = e.nextElement();
            Bodega m = Bodegas.get(f);
            datos[con][0] = f;
            datos[con][1] = m.getTipoHortaliza();
            datos[con][2] = m.getResponsable();
            datos[con][3] = m.getEspacioTotal();
            datos[con][4] = m.getEspacioOcupado();
            con++;
        }
        return datos;
    }

}

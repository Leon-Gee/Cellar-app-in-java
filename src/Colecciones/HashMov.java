/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
author:  Leon
*/
package Colecciones;

import clasesBase.Movto_Almacen;
import java.awt.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashMov {

    private Hashtable<String, Movto_Almacen> Movimientos = new Hashtable<String, Movto_Almacen>();

    public boolean insertar(String clvM,String clv, float can, String mvto, String fecha, String respon, String clvBodega) {
      
        if (Movimientos.containsKey(clvM)) {
            return false;
        } else {
            Movto_Almacen m = new Movto_Almacen(clv, can, mvto, fecha, respon, clvBodega);
            Movimientos.put(clvM, m);
            return true;
        }

    }

    public boolean eliminar(String clave) {
        if (Movimientos.containsKey(clave)) {
            Movimientos.remove(clave);
            return true;
        } else {
            return false;
        }
    }

    public boolean existe(String clave) {
        if (Movimientos.containsKey(clave)) {
            return true;
        } else {
            return false;
        }
    }

    public Movto_Almacen mostrar(String clave) {
        if (Movimientos.containsKey(clave)) {
            return Movimientos.get(clave);
        } else {

            return null;
        }
    }

    public Enumeration<String> ordenadorids() {
        return Movimientos.keys();
    }

    public int RegresaSize() {
        return Movimientos.size();
    }

}

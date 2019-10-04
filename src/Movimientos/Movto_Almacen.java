/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimientos;

/**
 *
 * @author Leon
 */
public class Movto_Almacen {

    private String clvHortaliza, clvBodega;
    private float cantidad;
    private String tipoMvto;
    private String Fecha, Responsable;

    public Movto_Almacen(String clv, float can, String mvto, String fecha, String respon, String clvBodega) {
        this.clvHortaliza = clv;
        this.cantidad = can;
        this.tipoMvto = mvto;
        this.Fecha = fecha;
        this.Responsable = respon;
        this.clvBodega = clvBodega;

    }

    public String getClvBodega() {
        return clvBodega;
    }

    public void setClvBodega(String clvBodega) {
        this.clvBodega = clvBodega;
    }

    public String getClvHortaliza() {
        return clvHortaliza;
    }

    public void setClvHortaliza(String clvHortaliza) {
        this.clvHortaliza = clvHortaliza;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoMvto() {
        return tipoMvto;
    }

    public void setTipoMvto(String tipoMvto) {
        this.tipoMvto = tipoMvto;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

}

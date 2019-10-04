/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bodega;



/**
 *
 * @author  Leon
 */
public class Bodega{

   private String Responsable, tipoHortaliza;
   private float espacioTotal, espacioOcupado, espacioLibre;
    

    /*   Hortaliza horta;*/
    
    public Bodega(String Responsable, float espacioTotal, float espacioOcupado, String tipoHortaliza) {
        this.Responsable = Responsable;
        this.espacioTotal = espacioTotal;
        this.espacioOcupado = espacioOcupado;
        this.tipoHortaliza = tipoHortaliza;
        this.espacioLibre = espacioTotal - espacioOcupado;

    }

    public float getEspacioLibre() {
        return espacioLibre;
    }

    public void setEspacioLibre(float espacioLibre) {
        this.espacioLibre = espacioLibre;
    }
    

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public float getEspacioTotal() {
        return espacioTotal;
    }

    public void setEspacioTotal(float espacioTotal) {
        this.espacioTotal = espacioTotal;
    }

    public float getEspacioOcupado() {
        return espacioOcupado;
    }

    public void setEspacioOcupado(float espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }

    public String getTipoHortaliza() {
        return tipoHortaliza;
    }

    public void setTipoHortaliza(String tipoHortaliza) {
        this.tipoHortaliza = tipoHortaliza;
    }
    
    
}

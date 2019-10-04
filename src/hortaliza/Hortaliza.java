/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hortaliza;

/**
 *
 * @author  Leon
 */
public class Hortaliza {
    int clave;
    String Nombre,Descripcion;
    /*tipo*/
    
    public Hortaliza(int clv, String nmbr, String desc){
        this.clave = clv;
        this.Nombre= nmbr;
        this.Descripcion=desc;  
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}

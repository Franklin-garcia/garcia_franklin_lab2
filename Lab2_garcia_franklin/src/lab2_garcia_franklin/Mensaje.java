/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_garcia_franklin;

import java.util.Date;

/**
 *
 * @author Franklin Garcia
 */
public class Mensaje {
    int emisor;
    int receptor; 
    String fecha; 
    String contenido; 

    public Mensaje() {
    }

    public Mensaje(int emisor, int receptor, String fecha, String contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public int getEmisor() {
        return emisor;
    }

    public void setEmisor(int emisor) {
        this.emisor = emisor;
    }

    public int getReceptor() {
        return receptor;
    }

    public void setReceptor(int receptor) {
        this.receptor = receptor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return  contenido;
    }
   
}

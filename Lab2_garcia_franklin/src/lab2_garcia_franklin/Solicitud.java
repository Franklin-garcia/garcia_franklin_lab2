/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_garcia_franklin;

/**
 *
 * @author Franklin Garcia
 */
public class Solicitud {
    private Usuario emisor;
    private Usuario recepetor;

    public Solicitud() {
    }

    public Solicitud(Usuario emisor, Usuario recepetor) {
        this.emisor = emisor;
        this.recepetor = recepetor;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public Usuario getRecepetor() {
        return recepetor;
    }

    public void setRecepetor(Usuario recepetor) {
        this.recepetor = recepetor;
    }

    @Override
    public String toString() {
        return recepetor.getNombre();
    }
   
}

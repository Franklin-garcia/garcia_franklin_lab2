/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_garcia_franklin;

import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String lugar_nacimiento;
    private String username;
    private String password;
    private ArrayList<Usuario> lista_amigos; 
    private ArrayList lista_solicitudes;
    private ArrayList <String>lista_mensajes_enviados;
    private ArrayList<String>buzón_entrada;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String lugar_nacimiento, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.username = username;
        this.password = password;
        this.lista_amigos = lista_amigos;
        this.lista_solicitudes = lista_solicitudes;
        this.lista_mensajes_enviados = lista_mensajes_enviados;
        this.buzón_entrada = buzón_entrada;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Usuario> getLista_amigos() {
        return lista_amigos;
    }

    public void setLista_amigos(ArrayList<Usuario> lista_amigos) {
        this.lista_amigos = lista_amigos;
    }

    public ArrayList getLista_solicitudes() {
        return lista_solicitudes;
    }

    public void setLista_solicitudes(ArrayList lista_solicitudes) {
        this.lista_solicitudes = lista_solicitudes;
    }

    public ArrayList<String> getLista_mensajes_enviados() {
        return lista_mensajes_enviados;
    }

    public void setLista_mensajes_enviados(ArrayList<String> lista_mensajes_enviados) {
        this.lista_mensajes_enviados = lista_mensajes_enviados;
    }

    public ArrayList<String> getBuzón_entrada() {
        return buzón_entrada;
    }

    public void setBuzón_entrada(ArrayList<String> buzón_entrada) {
        this.buzón_entrada = buzón_entrada;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", lugar_nacimiento=" + lugar_nacimiento + ", username=" + username + ", password=" + password + ", lista_amigos=" + lista_amigos + ", lista_solicitudes=" + lista_solicitudes + ", lista_mensajes_enviados=" + lista_mensajes_enviados + ", buz\u00f3n_entrada=" + buzón_entrada + '}';
    }
    
}

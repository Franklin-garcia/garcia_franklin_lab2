/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_garcia_franklin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin Garcia
 */
public class Lab2_garcia_franklin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         crear usuarios, modificar los datos de un usuario, 
        eliminar un usuario y también ingresar a la aplicación por medio de un login
         */
        ArrayList<Usuario> lista_general = new ArrayList();
        String opcion = "";
        while (!opcion.equalsIgnoreCase("5")) {
            opcion = JOptionPane.showInputDialog("Seleccione opcion \n"
                    + "1-Crear usuarios \n"
                    + "2-Modificar Usuarios \n"
                    + "3-Elimiminar usuarios \n"
                    + "4-Login \n"
                    + "5-Salir \n");
            switch (opcion) {
                case "1": {
                    String nombre = JOptionPane.showInputDialog("Nombre");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                    String lugar_nacimiento = JOptionPane.showInputDialog("lugar de nacimiento");
                    String username = JOptionPane.showInputDialog("usuario");
                    String password = JOptionPane.showInputDialog("contraseña");
                    lista_general.add(new Usuario(nombre, edad, lugar_nacimiento, username, password));
                    JOptionPane.showMessageDialog(null, "!Hecho¡");
                }
                break;
                case "2": {
                    String e = "";//
                    for (Usuario t : lista_general) {
                        e += "\n" + lista_general.indexOf(t) + " " + t;
                    }
                    JOptionPane.showMessageDialog(null, e);//

                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));
                    String nombre = JOptionPane.showInputDialog("Nombre");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                    String lugar_nacimiento = JOptionPane.showInputDialog("lugar de nacimiento");
                    String username = JOptionPane.showInputDialog("usuario");
                    String password = JOptionPane.showInputDialog("contraseña");
                    lista_general.get(pos).setNombre(nombre);
                    lista_general.get(pos).setEdad(edad);
                    lista_general.get(pos).setLugar_nacimiento(lugar_nacimiento);
                    lista_general.get(pos).setUsername(username);
                    lista_general.get(pos).setPassword(password);
                    JOptionPane.showMessageDialog(null, "!Hecho¡");
                }
                break;
                case "3": {
                    String e = "";//
                    for (Usuario t : lista_general) {
                        e += "\n" + lista_general.indexOf(t) + " " + t;
                    }
                    JOptionPane.showMessageDialog(null, e);//
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));
                    lista_general.remove(pos);
                    JOptionPane.showMessageDialog(null, "!Hecho¡");
                }
                break;
                case "4": {
                    String e = "";//
                    for (Usuario t : lista_general) {
                        e += "\n" + lista_general.indexOf(t) + " " + t.getNombre();
                    }
                    JOptionPane.showMessageDialog(null, e);//
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));
                    String username = JOptionPane.showInputDialog("usuario");
                    String password = JOptionPane.showInputDialog("contraseña");
                    if (lista_general.get(pos).getPassword().equals(password)
                            && lista_general.get(pos).getUsername().equals(username)) {
///-------------------------------------------------------------------------------------------------------------------------------     
//-------------------------------------------------------------------------------------------------------------------------------
//Todo sobre aplicacion
                        JOptionPane.showMessageDialog(null, "Ingreso");
                        String op = "";
                        while (!op.equalsIgnoreCase("7")) {
                            op = JOptionPane.showInputDialog("Ingrese opcion \n"
                                    + "1-Agregar amigos \n"
                                    + "2-Solicitudes \n"
                                    + "3-Enviar mensajes \n"
                                    + "4-Buzon \n"
                                    + "5-Eliminar mensajes \n"
                                    + "6-Eliminar amigos \n"
                                    + "7-Salir \n");
                            switch (op) {
                                case "1": {//agregar amigo
                                    String per = "";//
                                    for (Usuario t : lista_general) {
                                        per += "\n" + lista_general.indexOf(t) + " " + t.getNombre();
                                    }
                                    JOptionPane.showMessageDialog(null, e);//
                                    int p = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));

                                    lista_general.get(p).getLista_solicitudes().add(new Solicitud(pos, p));

                                    JOptionPane.showMessageDialog(null, "!Se envio¡");
                                }
                                break;
                                case "2": {//solicitudes
                                    String sol = "";
                                    int cont = 0;
                                    for (Object s : lista_general.get(pos).getLista_solicitudes()) {
                                        int n = ((Solicitud) lista_general.get(pos).getLista_solicitudes().get(cont)).getEmisor();
                                        sol += "Posicion de solicitud= " + lista_general.get(pos).getLista_solicitudes().indexOf(s) + "\n" + "Posicion en la lista general= " + n + "--" + lista_general.get(n).getNombre() + "\n";
                                        cont++;
                                    }
                                    JOptionPane.showMessageDialog(null, "Mis amigos \n" + sol);
                                    ///No son nuevos objetos son de la lista general solo estan validados para agregar
                                    //en la lista de solicitudes y amigos asi que pone los numero que aparecen ahi

                                    int solicitud = Integer.parseInt(JOptionPane.showInputDialog("posicion Solicitud"));
                                    int atender = Integer.parseInt(JOptionPane.showInputDialog("Contestar posicion en la lista general"));
                                    String aceptar = JOptionPane.showInputDialog("Que desea hacer? \n"
                                            + "1-Aceptar \n"
                                            + "2-Rechazar \n");
                                    if (aceptar.equals("1")) {
                                        lista_general.get(pos).getLista_amigos().add(atender);
                                        lista_general.get(atender).getLista_amigos().add(pos);
                                        lista_general.get(pos).getLista_solicitudes().remove(solicitud);
                                        JOptionPane.showMessageDialog(null, "!Hecho¡");
                                    } else if (aceptar.equals("2")) {
                                        lista_general.get(pos).getLista_solicitudes().remove(solicitud);
                                        JOptionPane.showMessageDialog(null, "!Hecho¡");
                                    }
                                }
                                break;
                                case "3": {//enviar mensajes
                                    String en = "";
                                    int con = 0;
                                    for (Object s : lista_general.get(pos).getLista_amigos()) {
                                        int n = lista_general.get(pos).getLista_amigos().get(con);
                                        en += n + "--" + lista_general.get(n).getNombre() + "\n";
                                        con++;
                                    }
                                    JOptionPane.showMessageDialog(null, en);
                                    int p = Integer.parseInt(JOptionPane.showInputDialog("Posicion de envio"));

                                    Date fecha = new Date();
                                    DateFormat df = new SimpleDateFormat("DD/MM/YYYY");
                                    String t = df.format(fecha);
                                    String mensaje = JOptionPane.showInputDialog("Mensaje a enviar");
                                    lista_general.get(pos).getLista_mensajes_enviados().add(new Mensaje(pos, p, t, mensaje));
                                    lista_general.get(p).getBuzón_entrada().add(new Mensaje(pos, p, t, mensaje));
                                    JOptionPane.showMessageDialog(null, "Enviado");
                                }
                                break;
                                case "4": {//buzon
                                    String o = JOptionPane.showInputDialog("Menu buzon \n"
                                            + "1-Todos \n"
                                            + "2-Filtrados fecha \n"
                                            + "3-Filtrados año \n");
                                    if (o.equals("1")) {
                                        String mensajes = "";
                                        for (Mensaje u : lista_general.get(pos).getBuzón_entrada()) {
                                            mensajes +=lista_general.get(u.getEmisor()).getNombre()
                                                    +" "+ u;
                                        } 
                                        JOptionPane.showMessageDialog(null, mensajes);
                                    } else if (o.equals("2")) {

                                    } else if (o.equals("3")) {

                                    }
                                }
                                break;
                                case "5": {//eliminar mensajes
                                    String mensajes = "";
                                    for (Mensaje u : lista_general.get(pos).getBuzón_entrada()) {
                                        mensajes += "\n" + lista_general.get(pos).getBuzón_entrada().indexOf(u) + " "
                                                + u;
                                    }
                                    JOptionPane.showMessageDialog(null, mensajes);
                                    int posicionn = Integer.parseInt(JOptionPane.showInputDialog("Mensaje a eliminar"));
                                    lista_general.get(pos).getBuzón_entrada().remove(posicionn);
                                    JOptionPane.showMessageDialog(null, "Eliminado");
                                }
                                break;
                                case "6": {//Eliminar amigos
                                    String en = "";
                                    int con = 0;
                                    for (Object s : lista_general.get(pos).getLista_amigos()) {
                                        int n = lista_general.get(pos).getLista_amigos().get(con);
                                        en += lista_general.get(pos).getLista_amigos().indexOf(s) + "--" + lista_general.get(n).getNombre() + "\n";
                                        con++;
                                    }
                                    JOptionPane.showMessageDialog(null, en);
                                    int eliminar = Integer.parseInt(JOptionPane.showInputDialog("Posicion a eliminar"));
                                    lista_general.get(pos).getLista_amigos().remove(eliminar);
                                    JOptionPane.showMessageDialog(null, "Eliminado");
                                }
                                break;
                            }
                        }
//------------------------------------------------------------------------------------------------------------------------------                        
///------------------------------------------------------------------------------------------------------------------------------     
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecto");
                    }

                }
                break;
            }
        }

    }

}

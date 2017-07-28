/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_garcia_franklin;

import java.util.ArrayList;
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

                                    Usuario emisor = new Usuario(lista_general.get(pos).getNombre(),
                                            lista_general.get(pos).getEdad(),
                                            lista_general.get(pos).getLugar_nacimiento(),
                                            lista_general.get(pos).getUsername(),
                                            lista_general.get(pos).getPassword());
                                    Usuario recepetor = new Usuario(lista_general.get(p).getNombre(),
                                            lista_general.get(p).getEdad(),
                                            lista_general.get(p).getLugar_nacimiento(),
                                            lista_general.get(p).getUsername(),
                                            lista_general.get(p).getPassword());

                                    lista_general.get(p).getLista_solicitudes().add(new Solicitud(emisor,recepetor));
                                   JOptionPane.showMessageDialog(null, "!Se envio¡");
                                }
                                break;
                                case "2": {//solicitudes
                                    String sol="";
                                    for (Object s:lista_general.get(pos).getLista_solicitudes()) {
                                           sol+=lista_general.get(pos).getLista_solicitudes().indexOf(s)+
                                                   " "+sol;
                                    }
                                    JOptionPane.showMessageDialog(null, sol);
                                } 
                                break;
                                case "3": {//enviar mensajes

                                }
                                break;
                                case "4": {//buzon

                                }
                                break;
                                case "5": {//eliminar mensajes

                                }
                                break;
                                case "6": {//Eliminar amigos

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

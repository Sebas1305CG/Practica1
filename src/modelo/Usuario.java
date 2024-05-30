/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lenovo.User
 */
public class Usuario {
private String nombre;
private String apellido;
private char inicial;
private String direccion;
private String correoElectronico;
//UN METODO PUEDE SER VACIO O CON ARGUMENTO

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, char inicial, String direccion, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.inicial = inicial;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

}

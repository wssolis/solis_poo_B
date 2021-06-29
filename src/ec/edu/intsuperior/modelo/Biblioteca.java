/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author SANTIAGO SOLIS
 */
public class Biblioteca {

    private String nombre;
    private String direccion;
    private Libro libro;  //tipo de dato abstracto TDA
    private int aforo;
    private Usuario usuario;

    //Constructores
    public Biblioteca() {
    }

    public Biblioteca(String nombre, String direccion, Libro libro, int aforo, Usuario usuario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libro = libro;
        this.aforo = aforo;
        this.usuario = usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

}

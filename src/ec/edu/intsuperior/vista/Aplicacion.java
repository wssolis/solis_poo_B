/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Autor;
import ec.edu.intsuperior.modelo.Biblioteca;
import ec.edu.intsuperior.modelo.Libro;
import ec.edu.intsuperior.modelo.Usuario;

/**
 *
 * @author SANTIAGO SOLIS
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        Autor au1= new Autor("Juan de Alcazar","123456789", "20/05/1984");
        Libro li1= new Libro("ISBN2021-1","La belleza en la programación","int-superior", au1);
        Usuario user = new Usuario("Jaun Perez","0987654","15/09/2001","USER-098");
        Biblioteca biblio1 = new Biblioteca("Central Cayambe","Remigio Crespo", li1,40,user);
        
        
        
        System.out.println("Cual es el autor del libro 1: "+li1.getAutor().getNombre()+
                "\nEL DNI DEL AUTOR del libro 1 es: "+li1.getAutor().getDni());
        
        System.out.println("La biblioteca 1 es: "+biblio1.getNombre()+
                "\nEL libro de esta biblioteca es: "+biblio1.getLibro().getTitulo());
        
    }
    
}

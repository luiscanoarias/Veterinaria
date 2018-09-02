/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

import beans.Dueno;

/**
 *
 * @author GCA
 */
public abstract class AAnimal{
    private int id;
    private String nombre;
    private int edad;
    private Dueno dueno;
    private String raza;
    private boolean genero;
    private String color;
    
    public AAnimal(){}
    public AAnimal (int id, String nombre, int edad, Dueno dueno, String raza, boolean genero, String color) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
        this.raza = raza;
        this.genero = genero;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}

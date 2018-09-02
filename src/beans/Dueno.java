/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import abstracto.AAnimal;
import java.util.ArrayList;

/**
 *
 * @author GCA
 */
public class Dueno {
    private int id;
    private String nombre;
    private int edad;
    private String telefono;
    private String domicilio;
    private ArrayList<AAnimal> aAnimals;

    public Dueno() {
    }

    public Dueno(int id, String nombre, int edad, String telefono, String domicilio, ArrayList<AAnimal> aAnimals) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.aAnimals = aAnimals;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<AAnimal> getaAnimals() {
        return aAnimals;
    }

    public void setaAnimals(ArrayList<AAnimal> aAnimals) {
        this.aAnimals = aAnimals;
    }
     
}

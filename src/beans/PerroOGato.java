/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author GCA
 */
public class PerroOGato extends abstracto.AAnimal{
    
    private boolean vacunado;
    private boolean typ;
    public static ArrayList<PerroOGato> listaPerroOGato;
    
    public PerroOGato(){}

    /**
     * en el segundo parametro de tipo boolean se pasa como true si es un perro y como false si es gato
     * @param vacunado 
     */
    public PerroOGato(boolean vacunado, boolean typ) {
        this.vacunado = vacunado;
        this.typ = typ;
    }

    public boolean isPerro() {
        return typ;
    }
    
    public boolean isGato() {
        return !typ;
    }
    
    public void setGato(boolean typ){
        this.typ = !typ;
    }
    
    public void setPerro (boolean typ){
        this.typ = typ;
    }
    
    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public static ArrayList<PerroOGato> getListaPerroOGato() {
        return listaPerroOGato;
    }

    public static void setListaPerroOGato(ArrayList<PerroOGato> listaPerroOGato) {
        PerroOGato.listaPerroOGato = listaPerroOGato;
    }
    
}

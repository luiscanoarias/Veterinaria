/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;
import beans.Dueno;
import interfaces.ICRUD;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author GCA
 */
public class Gestor implements ICRUD {
    
    ArrayList<Dueno> duenos;
    
    public Gestor(){
        duenos = new ArrayList<>();
        //recuperar();    
    }
    
    public void persistir(){
        
    }
    
    public void recuperar(){
        
    }

    @Override
    public void crear(Object dueno) {
        duenos.add((Dueno)dueno);   
    }

    @Override
    public void modificar(Object dueno) {
        int cont = 0;
        Dueno aux = (Dueno) dueno;
        
        for (Dueno obj : duenos){
            if(obj.getId() == aux.getId()){
                duenos.set(cont, aux);
                break;
            }
            cont++;
        }
        
    }

    @Override
    public boolean eliminar(String nombreAEliminar) {
        int cont = 0;
        for (Dueno obj : duenos){
            if(obj.getNombre().equals(nombreAEliminar)){
                duenos.remove(cont);
                return true;
            }
            cont++;
        }
        return false;
    }

    @Override
    public ArrayList mostrar() {
        return duenos;
    }

    @Override
    public Object buscar(String nombreABuscar) {
        for (Dueno obj : duenos){
            if(obj.getNombre().equals(nombreABuscar)){
                return obj;
            }
        }
        return null;
    }
    
    
}

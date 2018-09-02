/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author GCA
 */
public interface ICRUD {
   
    public void crear(Object object);
    public void modificar(Object object);
    public boolean eliminar(String nombreAEliminar);
    public ArrayList mostrar();
    public Object buscar(String nombreABuscar);
    
}

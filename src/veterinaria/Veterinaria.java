/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import beans.Dueno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GCA
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gestor gestor = new Gestor();
        
        Scanner scann = new Scanner(System.in);
        boolean cond = true;
        
        while(cond){
            System.out.println("1) Crear  \n"
                            + "2) Modificar \n"
                            + "3) Eliminar \n"
                            + "4) Mostrar \n"
                            + "5) Buscar \n"
                            + "6) Salir \n");
            Scanner scanner=new Scanner(System.in);
            int entrada=scanner.nextInt();
            
            switch(entrada){
                case 1:
                    Dueno unDueno = new Dueno();
                    unDueno.setNombre("X");
                    gestor.crear(unDueno);
                    System.out.println("Se creo un dueño");
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ingresa el nombre del dueño a eliminar");
                    String nombreAEliminar;
                    nombreAEliminar = scann.nextLine();
                    
                    if(gestor.eliminar(nombreAEliminar) == true){
                        System.out.println("Se elimino al dueño.");
                    }else{
                        System.out.println("No existe ese dueño.");
                    }
                    break;
                case 4:
                    ArrayList<Dueno> listaDuenos;
                    listaDuenos = gestor.mostrar();
                    
                    System.out.println("Nombres de los dueños:");
                    for(Dueno obj: listaDuenos){
                        System.out.println("Dueño: "+obj.getNombre());
                    }
                    break;
                case 5:
                    String nombreABuscar;
                    System.out.println("Ingresa el nombre del dueño a buscar");
                    nombreABuscar = scann.nextLine();
                    Dueno duenoEncontrado;
                    
                    if (gestor.buscar(nombreABuscar) == null){
                        System.out.println("No se encontró el dueño.");
                    }else{
                        duenoEncontrado = (Dueno) gestor.buscar(nombreABuscar);
                        System.out.println("Nombre dueño encontrado: "+duenoEncontrado.getNombre());
                    }
                    
                    break;
                case 6:
                    cond = false;
                    break;
                default:
                    
                    break;
            }
              
        }
    }
    
}

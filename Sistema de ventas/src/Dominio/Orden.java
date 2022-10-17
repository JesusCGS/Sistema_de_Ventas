/*
 * RESPONSABILIDADES: CREAR OBJETO ORDEN / ADMINISTRAR LOS PRODUCTOS
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public abstract class Orden {
   private int idorden;
   private Producto[] Producto; ;
   ArrayList<Producto> productos = new ArrayList<>();
   private int contadorprodu;//maximo de productos a pedir son 10
   //contructor
    public Orden(){
       
    }
    
    //metodo
    public void agregarProducto(Producto Producto){
        int cont=0;
        idorden = cont++;
        if(contadorprodu!=0){
            if(contadorprodu == 10){
                System.out.println("LAS LISTA ESTA LLENA");
                System.out.println("DEBE TENER UN MAXIMO DE 10 PRODUCTOS");
            }
            System.out.println("LA LISTA A SIDO AÑADIDA A LA CESTA");
            contadorprodu++;
            
            
        }
        
    }
    //metodo
    public double calcular_total(){

        return 0;
    }
    //metodo
    public void mostrarOrden(){


    }
    

    
  
    
    
}

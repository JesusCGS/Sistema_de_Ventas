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
   private static int contadorprodu ;//maximo de productos a pedir son 10
   
   //contructor
    public Orden(){
         this.idorden = ++Orden.contadorprodu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idorden;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Orden other = (Orden) obj;
        if (this.idorden != other.idorden) {
            return false;
        }
        return true;
    }
    
    
    
    //metodo
    public void agregarProducto(Producto Productos){
          if(contadorprodu!=0){
            if(productos.contains(Productos)){
                System.out.println("El vehiculo que se ha introducido ya estaba registrado");
                System.out.println("Plazas disponibles: "+ contadorprodu);
            }else{
                productos.add(Productos);
                contadorprodu--;
                System.out.println("El vehiculo a añdir es: "+Productos);
                System.out.println("Se ha añadido el vehiculo correctamente");
                System.out.println("Plazas disponibles: "+ contadorprodu);
            }
        }else{
            System.out.println("No hay espacio suficiente en el Parking, vuelva mas tarde");
            System.out.println("Plazas disponibles: "+ contadorprodu);
            productos.remove(Productos);
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

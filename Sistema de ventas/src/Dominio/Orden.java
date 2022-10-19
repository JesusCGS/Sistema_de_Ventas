/*
 * RESPONSABILIDADES: CREAR OBJETO ORDEN / ADMINISTRAR LOS PRODUCTOS
 */
package Dominio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alumno Mañana
 */
public abstract class Orden {
   private int idorden=1;
  // private Producto[] orden; ;
  // ArrayList<Orden> Ordenes = new ArrayList<>();
   ArrayList<Producto> productos = new ArrayList<>();
   private static int contadorid;
   private static int contadorprodu = 5 ;//maximo de productos a pedir son 10
   
 
   //contructor
    public Orden(){
      // this.idorden = ++Orden.contadorid;
    }
     public Orden(int idorden ,ArrayList productos){
        //this.idorden = ++Orden.contadorid;
        //this.idorden =idorden;
        //this();
        this.productos =productos;
       
     }
     //getter

    public ArrayList<Producto> getProductos() {
        return productos;
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
    @Override
    public String toString() {
        return "Orden{" + "idorden=" + idorden + ", productos=" + productos + '}';
    }
    
    
    
    //metodo
    public void agregarProducto(Orden ord ,Producto Productos){
        
       if(contadorprodu!=0){
         ord.getProductos().add(Productos);
          contadorprodu--;
           System.out.println("EL PRODUCTO: "+Productos.getNombre()+" A SIDO AÑADIDO A SU LISTA DE COMPRA");
           System.out.println("ESPACIOS DISPONIBLES EN SU LISTA : "+contadorprodu);
       }else{
           System.out.println("EL PRODUCTO NO HA SIDO AÑADIDO A LA LISTA ");
           System.out.println("ESPACIO DISPONIBLE DE LA LISTA: " +contadorprodu);
       }
  
    }
    //metodo
    public double calcular_total(Orden ord){
        double dinero_total=0;
        for(Producto i :ord.getProductos()){
            dinero_total=dinero_total+i.getPrecio();
        }
        //productos.clear();
        System.out.println("EL TOTAL A PAGAR DEL USUARIO ES : "+ dinero_total+"€");
        System.out.println("EL ID DE TU COMPRA ES : "+idorden++);
       // ord.getProductos().clear();
        return dinero_total;
    }
    //metodo
    public void mostrarOrden(Orden ord){
         System.out.println("VISUALIZANDO TU LISTA DE LA COMPRA");
        
        Iterator<Producto> itr = ord.getProductos().iterator();
        while (itr.hasNext()){
            Producto var = itr.next();
            System.out.println("\t"+var.toString());
        }
        //ord.getProductos().clear();

    }
    public void visualizar_ordenes(Orden ord){
        System.out.println("VISUALIZANDO COMPRA");
        System.out.println("ID : "+idorden);
        System.out.println("PRODUCTOS: "+ord.getProductos());
           /* System.out.println("");
            System.out.println("PROFESORES");
            for(Orden i:idorden){
                System.out.println("\t"+i);
            }
            System.out.println("");
        */
    
    }

    

    
    
    

    
  
    
    
}

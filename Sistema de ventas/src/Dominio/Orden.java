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
   private int idorden;
   private Producto[] orden; ;
  // ArrayList<Orden> Ordenes = new ArrayList<>();
   ArrayList<Producto> productos = new ArrayList<>();
   private static int contadorid;
   private static int contadorprodu = 5 ;//maximo de productos a pedir son 10
   
 
   //contructor
    public Orden(){
        this.idorden = ++Orden.contadorid;
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
          productos.add(Productos);
          contadorprodu--;
           System.out.println("EL PRODUCTO: "+Productos.getNombre()+" A SIDO AÑADIDO A SU LISTA DE COMPRA");
           System.out.println("ESPACIOS DISPONIBLES EN SU LISTA : "+contadorprodu);
       }else{
           System.out.println("EL PRODUCTO NO HA SIDO AÑADIDO A LA LISTA ");
           System.out.println("ESPACIO DISPONIBLE DE LA LISTA: " +contadorprodu);
       }
  
    }
    //metodo
    public double calcular_total(){
        double dinero_total=0;
        for(Producto i :productos){
            dinero_total=dinero_total+i.getPrecio();
        }
        //productos.clear();
        System.out.println("EL TOTAL A PAGAR DEL USUARIO ES : "+ dinero_total+"€");
        System.out.println("EL ID DE TU COMPRA ES : "+idorden++);

        return dinero_total;
    }
    //metodo
    public void mostrarOrden(){
         System.out.println("VISUALIZANDO TU LISTA DE LA COMPRA");
        Iterator<Producto> itr = productos.iterator();
        while (itr.hasNext()){
            Producto var = itr.next();
            System.out.println("\t"+var);
        }

    }
    public void visualizar_ordenes(){
        System.out.println("VISUALIZANDO COMPRA");
        System.out.println("ID : "+idorden);
        System.out.println("PRODUCTOS: "+productos);
           /* System.out.println("");
            System.out.println("PROFESORES");
            for(Orden i:idorden){
                System.out.println("\t"+i);
            }
            System.out.println("");
        */
    
    }
    

    
  
    
    
}

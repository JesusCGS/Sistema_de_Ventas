/*
 * CREAROBJETOS DE TIPO PRODUCTO
 */
package Dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Producto extends Orden{
   private int id_prpoducto;
   private String nombre;
   private double precio;
   static private  int contadorproductos;
    
    //getter
     public int getId_prpoducto() {
        return id_prpoducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    //seter
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //contructores

    private Producto() {
         this.id_prpoducto = ++Producto.contadorproductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

   

    @Override
    public String toString() {
        return "Producto{" + "id_prpoducto=" + id_prpoducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

  
    
    
    
    
        
    
    
    
    

   

   
    



   
   
}

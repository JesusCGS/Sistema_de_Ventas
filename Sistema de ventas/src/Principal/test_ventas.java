/*
 * CREAR UNA ORDEN Y LOS PRODUTOS QUE LA COMPONEN , SABER EL TOTAL DE DINERO , LOS PRODUCTOS QUE TIENE CADA ORDEN Y TENER UN LIMITES DE PRODUCTOS POR ORDEN
 */
package Principal;

import Dominio.Orden;
import Dominio.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class test_ventas {
      static Scanner ent = new Scanner(System.in);
      static Producto lista[]= new Producto [10];
      static ArrayList<Producto> productos = new ArrayList<>();
      static ArrayList<Producto> listado_productos = new ArrayList<>();
      static Orden o = new Orden() {};
       static Producto p1 = new  Producto("TEKKEN_8"  ,60);
       static Producto p2 = new  Producto("PS4"       ,300);
       static Producto p3 = new  Producto("TECLADO"   ,100);
       static Producto p4 = new  Producto("LECHE"     ,4);
       static Producto p5 = new  Producto("DETERGEMTE",7);
       static Producto p6 = new  Producto("DESTINY_2" ,30);
       static Producto p7 = new  Producto("CAMARA"    ,70);
       static Producto p8 = new  Producto("GOD_OF_WAR",60);
       static Producto p9 = new  Producto("PC"        ,745); 
       static Producto p10 = new Producto("PLAYERAS"  ,45);
       
    
       
    
    public static void main(String[] args) {
        System.out.println(" TERMINAL DE VENTAS");
        System.out.println(" ------------------");
        System.out.println("\n\n\t\t\t\t\t\t\t\tBIENVENIDO AL SITEMA DE VENTAS");
        System.out.println("\t\t\t\t\t\t\t\t==============================");
        ent.nextLine(); 
        menu_orden();
       
       
       
    }
     public static void menu_orden(){
        int opcion=-1;
        while(opcion!=0){
        System.out.println("CLASE 2ªDERECHA");
        System.out.println("===================\n");
        System.out.println("MENU\n");
        System.out.println("(1) [REALIZAR COMPRA] ");
        System.out.println("(2) [VISUALIZAR LAS COMPRAS] ");
        System.out.println("(3) [] ");
        System.out.println("(4) [] ");
        System.out.println("\t\t\t\t\t\t\t(0) [SALIR]");
        System.out.print("Seleccione la opcion a elegir: ");
        opcion=ent.nextInt();
        switch(opcion){
            case 1:
              menu_productos();
                break;
            case 2:
               o.visualizar_ordenes();
                break;
            case 3:
               
              
                break;
            case 4:
              
                
                break;
            case 0:
                break;
            default:
                System.out.println("Elija entre las opcines 1 y 5");
                break;
        }
        for(int i=0;i<2;i++){
            System.out.println("");
        }
        }
    }
    
    
    

    public static void menu_productos(){
        int opcion=-1;
        boolean sw1=false;
        boolean sw2=false;
        boolean sw3=false;
        while(opcion!=0){
        System.out.println("CLASE 2ªDERECHA");
        System.out.println("===================\n");
        System.out.println("MENU\n");
        System.out.println("(1) [VISUALIZAR LA LISTA DE PRODUCTOS] ");
        System.out.println("(2) [AÑADIR PRODUCTOS A LA LISTA ] ");
        System.out.println("(3) [VISUALIZAR LA LISTA DE LA COMPRA] ");
        System.out.println("(4) [SABER CUANTO DINERO TIENES QUE PAGAR] ");
        System.out.println("\t\t\t\t\t\t\t(0) [SALIR]");
        System.out.print("Seleccione la opcion a elegir: ");
        opcion=ent.nextInt();
        switch(opcion){
            case 1:
                sw1=true;
                visualizar_listado_productos();
                break;
            case 2:
                sw2=true;
                if(sw1==false){
                    System.out.println("\n\n\nDEBES VISUALIZAR ANTES LA LISTA DE PRODUCTOS");
                }else{
                    agregar_productos_alista();
                }
               
                break;
            case 3:
                 if(sw2==true){
                    o.mostrarOrden();
                }else{
                     System.out.println("NECESITAS TENER PTRODUCTOS EN TU LISTA");
                }
               
                break;
            case 4:
                 if(sw2==true){
                     o.calcular_total();
                }else{
                   System.out.println("\n\n\nANTES DEBES AÑADIR PRODUCTOS A TU LISTA");
                }
               
              
                break;
            case 0:
                break;
            default:
                System.out.println("Elija entre las opcines 1 y 5");
                break;
        }
        for(int i=0;i<2;i++){
            System.out.println("");
        }
        }
    }
    
   
    public static void visualizar_listado_productos(){
         //productos de la lista 3
       listado_productos.add(p1);
       listado_productos.add(p2);
       listado_productos.add(p3);
       listado_productos.add(p4);
       listado_productos.add(p5);
       listado_productos.add(p6);
       listado_productos.add(p7);
       listado_productos.add(p8);
       listado_productos.add(p9);
       listado_productos.add(p10);
       
         System.out.println("VISUALIZANDO LA LISTA DE PRODUCTOS");
        Iterator<Producto> itr = listado_productos.iterator();
        while (itr.hasNext()){
            Producto var = itr.next();
            System.out.println("\t"+var);
        }
    }
    
    public static void agregar_productos_alista(){
    int num=0;
        System.out.println("INTRODUZCA EL ID DEL PRODUCTO QUE QUIERA AÑADIR A LA LISTA");
        num= ent.nextInt();
        if(num==1){
            o.agregarProducto(p1);
        }else if(num==2){
            o.agregarProducto(p2);
        }else if(num ==3){
            o.agregarProducto(p3);
        }else if(num ==4){
            o.agregarProducto(p4);
        }else if(num ==5){
            o.agregarProducto(p5);
        }else if(num ==6){
            o.agregarProducto(p6);
        }else if(num ==7){
            o.agregarProducto(p7);
        }else if(num ==8){
            o.agregarProducto(p8);
        }else if(num ==9){
            o.agregarProducto(p9);
        }else if(num ==10){
            o.agregarProducto(p10);
            
        }
    
    
    }
    
}

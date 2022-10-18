/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
       static Producto p1 = new Producto("TEKKEN_8",60);
       static Producto p2 = new Producto("PS4",300);
       static Producto p3 = new Producto("TECLADO",100);
       static Producto p4 = new Producto("LECHE",4);
       static Producto p5 = new Producto("DETERGEMTE",7);
       static Producto p6 = new Producto("DESTINY_2",30);
       static Producto p7 = new Producto("CAMARA",70);
       static Producto p8 = new Producto("GOD_OF_WAR",60);
       static Producto p9 = new Producto("PC",745);
       static Producto p10 = new Producto("PLAYERAS",45);
       
    
       
    
    public static void main(String[] args) {
        System.out.println(" TERMINAL DE VENTAS");
        System.out.println(" ------------------");
        System.out.println("\n\n\t\t\t\t\t\t\t\tBIENVENIDO AL SITEMA DE VENTAS");
        System.out.println("\t\t\t\t\t\t\t\t==============================");
        ent.nextLine(); 
       menu();
       
       
       
    }
    public static void menu(){
        int opcion=-1;
        boolean sw1=false;
        boolean sw2=false;
        boolean sw3=false;
        while(opcion!=0){
        System.out.println("CLASE 2ªDERECHA");
        System.out.println("===================\n");
        System.out.println("MENU\n");
        System.out.println("(1) [VISUALIZAR LA LISTA DE PRODUCTOS] ");
        System.out.println("(2) [AÑADIR LISTA 1] ");
        System.out.println("(3) [AÑADIR LISTA 2] ");
        System.out.println("(4) [AÑADIR LISTA 3] ");
        System.out.println("(5) [CUESTION 5] ");
        System.out.println("(6) [CUESTION 6] ");
        System.out.println("(7) [CUESTION 7] ");
        System.out.println("(8) [CUESTION 8] ");
        System.out.println("(9) [CUESTION 9] ");
        System.out.println("\t\t\t\t\t\t\t(0) [SALIR]");
        System.out.print("Seleccione la opcion a elegir: ");
        opcion=ent.nextInt();
        switch(opcion){
            case 1:
                visualizar_listado_productos();
                break;
            case 2:
               // o.agregarProducto(colList1);
               
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
              
                break;
            case 6:
               
                break;
            case 7:
               
                break;
            case 8:
               
                break;
            case 9:
                
                break;
            case 0:
                break;
            default:
                System.out.println("Elija entre las opcines 1 y 10");
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
        System.out.println("INTRODUZCA EL ID DEL PRODUCTO QUE QIERA AÑADIR A LA LISTA");
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

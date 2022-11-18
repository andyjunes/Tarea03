/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.PedidoControl;
import Service.PedidoServicelmpl;
import Modelo.Pedido;


/**
 *
 * @author andyj
 */
public class Vista {
     public static void main(String[] args) {
         
         var pedidoControl = new PedidoControl();
       var data= new String[5];
       data[0]="0";
       data[1]="8.78";
       data[2]="Juan";
       data[3]="Av 12 de abril";
       data[4]="Paucarbamab";
       
       
       
        var provedorControl = new PedidoControl();
       var data1= new String[5];
       data[0]="0";
       data[1]="8.78";
       data[2]="Juan";
       data[3]="Av 12 de abril";
       data[4]="Paucarbamab";

       
       System.out.println(pedidoControl.crear(data));
       System.out.println(pedidoControl.listar());


         
         
         
         
     }
}

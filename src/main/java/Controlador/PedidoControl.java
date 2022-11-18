/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Pedido;
import Modelo.Provedor;
import java.util.List;
import Service.PedidoServicelmpl;
/**
 *
 * @author andyj
 */
public class PedidoControl {

    
    private PedidoServicelmpl pedidoServicelmpl;

    public PedidoControl() {
        this.pedidoServicelmpl = new PedidoServicelmpl();
    }
    
    
    public String crear(String [] data){
        var retorno="No se pudo crear el Provedor";
        var codigoPedido=Integer.valueOf(data[0]);
        var peso = Double.valueOf(data[1]);
        var propietario=data[2];
        var informacionPropieatrio=data[3];
        var direccion=data[4];
        int id = 0;

       
        if(id<0){
            retorno+=" ID  incorrecto";
        }else{
             var pedido = new Pedido(codigoPedido,peso,propietario,informacionPropieatrio,direccion);
            this.pedidoServicelmpl.crear(pedido);
            retorno= "Pedido "+pedido.getPropietario()+"Creado";
        }
        return retorno;
    }
    
      public List<Pedido> listar() {
        return this.pedidoServicelmpl.listar();
    }
}
    
    
    
    
    


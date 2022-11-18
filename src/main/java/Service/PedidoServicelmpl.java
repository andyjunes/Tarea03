/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andyj
 */
public class PedidoServicelmpl implements PedidoService {
    
    private final List<Pedido> pedidoList;

    public PedidoServicelmpl() {
        this.pedidoList= new ArrayList<>();
    }

    @Override
    public void crear(Pedido pedido) {
        this.pedidoList.add(pedido);
    }

    @Override
    public void modificar(int codigo, Pedido pedidoModificado) {
        var indice=0;
        
        this.pedidoList.set(indice, pedidoModificado);
    
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var pedido:this.pedidoList){
            if(pedido.getCodigo()==codigo){
                this.pedidoList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public List<Pedido> listar() {
        return this.pedidoList;
    }
    
  
}

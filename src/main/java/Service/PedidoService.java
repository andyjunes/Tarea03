/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.Pedido;
import java.util.List;

/**
 *
 * @author andyj
 */
public interface PedidoService {
    
    
     public abstract void crear(Pedido pedido);

    public abstract void modificar(int codigo, Pedido jugadorModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Pedido> listar();
}

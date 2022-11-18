/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.Provedor;
import java.util.List;

/**
 *
 * @author andyj
 */
public interface ProvedorService {
    
    public abstract void crear(Provedor provedor);

    public abstract void modificar(int codigo, Provedor provedorModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Provedor> listar();
    
}

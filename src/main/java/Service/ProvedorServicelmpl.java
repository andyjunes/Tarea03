/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Modelo.Provedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andyj
 */
public class ProvedorServicelmpl implements ProvedorService {
    
    private List<Provedor> provedorList;

    public ProvedorServicelmpl() {
        this.provedorList= new ArrayList<>();
    }

    @Override
    public void crear(Provedor provedor) {
        this.provedorList.add(provedor);
    }

    @Override
    public void modificar(int codigo, Provedor provedorModificado) {
        var indice=0;
        
        this.provedorList.set(indice, provedorModificado);
    
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var provedor:this.provedorList){
            if(provedor.getCodigo()==codigo){
                this.provedorList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public List<Provedor> listar() {
        return this.provedorList;
    }
    
    
}

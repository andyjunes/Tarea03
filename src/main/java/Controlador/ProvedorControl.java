/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Service.ProvedorServicelmpl;
import Modelo.Provedor;

/**
 *
 * @author andyj
 */
public class ProvedorControl {
    private ProvedorServicelmpl provedorServicelmpl;

    public ProvedorControl() {
        this.provedorServicelmpl = new ProvedorServicelmpl();
    }
    
    
    public String crear(String [] data){
        var retorno="No se pudo crear el jugador";
        var ubicacionLocal=data[1];
        var nombre=data[0];
        var ubicacionEntrega=data[2];
        var id=data[3];
        var productosStock=Integer.valueOf(data[4]);


        
        if(productosStock<0){
            retorno+=" ID INCORRECTO";
        }else{
            var provedor = new Provedor(nombre,ubicacionLocal,id,ubicacionEntrega,productosStock);
            this.provedorServicelmpl.crear(provedor);
            retorno= "Provedor "+provedor.getNombre()+"Creado";
        }
        return retorno;
    }
}

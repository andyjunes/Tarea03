/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andyj
 */
public class Pedido {
    private int codigoPedido;
    private double peso;
    private String propietario;
    private String informacionPropietario;
    private String direccion;

    public Pedido(int codigoPedido, double peso, String propietario, String informacionPropietario, String direccion) {
        this.codigoPedido = codigoPedido;
        this.peso = peso;
        this.propietario = propietario;
        this.informacionPropietario = informacionPropietario;
        this.direccion = direccion;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getInformacionPropietario() {
        return informacionPropietario;
    }

    public void setInformacionPropietario(String informacionPropietario) {
        this.informacionPropietario = informacionPropietario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigoPedido=" + codigoPedido + ", peso=" + peso + 
                ", propietario=" + propietario + ", informacionPropietario=" + 
                informacionPropietario + ", direccion=" + direccion + '}';
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andyj
 */
public class Provedor {
    private String nombre;
    private String ubicacionLocal;
    private String id;
    private String ubicacionEntrega;
    private int productosStock;

    public Provedor(String nombre, String ubicacionLocal, String id, String ubicacionEntrega, int productosStock) {
        this.nombre = nombre;
        this.ubicacionLocal = ubicacionLocal;
        this.id = id;
        this.ubicacionEntrega = ubicacionEntrega;
        this.productosStock = productosStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacionLocal() {
        return ubicacionLocal;
    }

    public void setUbicacionLocal(String ubicacionLocal) {
        this.ubicacionLocal = ubicacionLocal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacionEntrega() {
        return ubicacionEntrega;
    }

    public void setUbicacionEntrega(String ubicacionEntrega) {
        this.ubicacionEntrega = ubicacionEntrega;
    }

    public int getProductosStock() {
        return productosStock;
    }

    public void setProductosStock(int productosStock) {
        this.productosStock = productosStock;
    }

    @Override
    public String toString() {
        return "Provedor{" + "nombre=" + nombre + ", ubicacionLocal=" + ubicacionLocal + ", id=" + id + ", ubicacionEntrega=" + ubicacionEntrega + ", productosStock=" + productosStock + '}';
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
}

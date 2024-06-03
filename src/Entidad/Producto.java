package Entidad;

import java.util.Objects;

public class Producto {

    private static Integer id = 0;

    private String nombre;
    private Integer precio;
    private String categoria;

    private Integer productoID;

    public Producto(String nombre, Integer precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.productoID = ++id;
    }

    public Producto() {
    }

    public Integer getProductoID() {
        return productoID;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Producto.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return  Objects.equals(productoID, producto.productoID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( productoID);
    }

    @Override
    public String toString() {
        return "| ID :" + productoID + "| nombre :" + nombre +
                "| precio :" + precio +
                "| categoria :" + categoria + "|"
                ;
    }
}

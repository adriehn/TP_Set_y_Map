package Entidad;

import java.util.Objects;

public class Producto {

    private static Integer id = 0;

    private final String nombre;
    private final Integer precio;
    private final String categoria;

    private final Integer productoID;

    public Producto(String nombre, Integer precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.productoID = ++id;
    }

    public Integer getProductoID() {
        return productoID;
    }

    public Integer getPrecio() {
        return precio;
    }


    public String getCategoria() {
        return categoria;
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

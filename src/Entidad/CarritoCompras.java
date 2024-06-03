package Entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarritoCompras {

    private static Integer id=0;

    private Integer carritoID;

    public List<Producto> productos ;

    public static Integer getId() {
        return id;
    }

    public Integer getCarritoID() {
        return carritoID;
    }

    public void setCarritoID(Integer carritoID) {
        this.carritoID = carritoID;
    }



    public CarritoCompras(Integer carritoID) {
        this.carritoID = ++id;
        this.productos = new ArrayList<>();
    }

    public CarritoCompras() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarritoCompras that = (CarritoCompras) o;
        return Objects.equals(carritoID, that.carritoID) && Objects.equals(productos, that.productos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carritoID, productos);
    }

    @Override
    public String toString() {
        return "CarritoCompras " +
                "carritoID=" + carritoID +
                ", productos=" + productos +
                '}';
    }
}

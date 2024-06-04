package Controlador;

import Entidad.CarritoCompras;
import Entidad.Producto;
import Repositorios.CarritoRepository;
import Vista.CarritoView;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CarritoController {

    public Set<String> categoriaUnica = new HashSet<>();

    public CarritoController() {
    }

    public void agregarAlCarrito(CarritoCompras carritoCompras) {
       Producto p = ProductoController.buscar();
        String opcion = CarritoView.agrearAlCarrito();
        if (opcion.equalsIgnoreCase("s") && p != null) {
            carritoCompras.productos.add(p);
            categoriaUnica.add(p.getCategoria());
        }
        else {
            CarritoView.opcionInvalida();
        }
    }

    public void finalizarCompra(CarritoCompras carritoCompras) {
        int total = totalCompra(carritoCompras);
        CarritoView.totalCompra(total);
        CarritoRepository.carritocomprasRepository.put(carritoCompras.getCarritoID().toString(), carritoCompras);
        CarritoView.totalCategorias(categoriaUnica);

    }

    public int totalCompra(CarritoCompras carritoCompras) {
        int suma = 0;
        for (Producto p : carritoCompras.productos) {

            suma += p.getPrecio();
        }
        return suma;
    }

    public static void verLista() {
        for (Map.Entry<String, CarritoCompras> entity : CarritoRepository.carritocomprasRepository.entrySet()) {
            CarritoView.verLista(entity);
        }
    }

}

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
    ProductoController prodcont = new ProductoController();
    static CarritoRepository carritoRepository = new CarritoRepository();
    static CarritoView vista = new CarritoView();

    public CarritoController() {
    }

    public void agregarAlCarrito(CarritoCompras carritoCompras) {
       Producto p = prodcont.buscar();
        String opcion = vista.agrearAlCarrito();
        if (opcion.equalsIgnoreCase("s") && p != null) {
            carritoCompras.productos.add(p);
            categoriaUnica.add(p.getCategoria());
        }
        else {
            vista.opcionInvalida();
        }
    }

    public void finalizarCompra(CarritoCompras carritoCompras) {
        int total = totalCompra(carritoCompras);
        vista.totalCompra(total);
        carritoRepository.carritocomprasRepository.put(carritoCompras.getCarritoID().toString(), carritoCompras);
        vista.totalCategorias(categoriaUnica);

    }

    public int totalCompra(CarritoCompras carritoCompras) {
        int suma = 0;
        for (Producto p : carritoCompras.productos) {

            suma += p.getPrecio();
        }
        return suma;
    }

    public static void verLista() {
        for (Map.Entry<String, CarritoCompras> entity : carritoRepository.carritocomprasRepository.entrySet()) {
            vista.verLista(entity);
        }
    }

}

package Controlador;

import Entidad.CarritoCompras;
import Entidad.Producto;
import Repositorios.CarritoRepository;
import Vista.CarritoView;

import java.util.HashSet;
import java.util.Set;

public class CarritoController {

    Set<String> categoriaUnica = new HashSet<>();
    ProductoController prodcont = new ProductoController();
    CarritoRepository carritoRepository = new CarritoRepository();
    CarritoView vista = new CarritoView();
    CarritoCompras carrito = new CarritoCompras();


    public void agregarAlCarrito(CarritoCompras carritoCompras) {
        Producto p = prodcont.buscar();
        String opcion = vista.agrearAlCarrito(p);
        if (opcion.equalsIgnoreCase("s")) {

            carritoCompras.productos.add(p);
        }
    }

    public void finalizarCompra(CarritoCompras carritoCompras)
    {
        carritoRepository.carritocomprasRepository.put(carritoCompras.getCarritoID().toString(), carritoCompras);

    }


}

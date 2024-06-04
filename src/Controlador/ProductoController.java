package Controlador;

import Entidad.Producto;
import Repositorios.ProductoRepository;
import Vista.ProductoView;

import java.util.Map;

public class ProductoController {

    public ProductoController() {
    }

    public static void agregarProducto() {
        Producto p = ProductoView.crearProducto();
        ProductoRepository.listaProductos.put(p.getProductoID().toString(), p);
    }
    public static Producto buscar() {
        String id = ProductoView.buscar();
        boolean existe = ProductoRepository.listaProductos.containsKey(id);
        if (existe) {
            Producto encontrado = ProductoRepository.listaProductos.get(id);
            ProductoView.mostrarUnProducto(encontrado);
            return encontrado;
        }
        return null;
    }

    public static void verLista() {
        for (Map.Entry<String, Producto> entity : ProductoRepository.listaProductos.entrySet()) {
            ProductoView.verLista(entity);
        }
    }
}

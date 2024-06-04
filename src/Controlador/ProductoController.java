package Controlador;

import Entidad.Producto;
import Repositorios.ProductoRepository;
import Vista.ProductoView;

import java.util.Map;

public class ProductoController {

    static ProductoView vista = new ProductoView();
    static ProductoRepository prodrepo = new ProductoRepository();

    public ProductoController() {
    }

    public void agregarProducto() {
        Producto p = vista.crearProducto();
        prodrepo.listaProductos.put(p.getProductoID().toString(), p);
    }

    public Producto buscar() {
        String id = vista.buscar();
        boolean existe = prodrepo.listaProductos.containsKey(id);
        if (existe == true) {
            Producto encontrado = prodrepo.listaProductos.get(id);
            vista.mostrarUnProducto(encontrado);
            return encontrado;
        }
        return null;
    }

    public static void verLista() {
        for (Map.Entry<String, Producto> entity : prodrepo.listaProductos.entrySet()) {
            vista.verLista(entity);
        }
    }


}

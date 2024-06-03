package Controlador;
import Entidad.Producto;
import Repositorios.ProductoRepository;
import Vista.ProductoView;

public class ProductoController {

    ProductoView vista = new ProductoView();
    ProductoRepository prodrepo = new ProductoRepository();
    public ProductoController() {
    }

    public void agregarProducto()
    {
        Producto p = vista.crearProducto();
        prodrepo.listaProductos.put(p.getProductoID().toString(), p);
    }

    public Producto buscar ()
    {
        String id = vista.buscar();
        boolean existe = prodrepo.listaProductos.containsKey(id);
        Producto p = vista.encontrado(existe,id);
        vista.mostrarUnProducto(p);

        return p;
    }

}

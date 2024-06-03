package Vista;

import Controlador.ProductoController;
import Entidad.CarritoCompras;
import Entidad.Producto;
import Repositorios.CarritoRepository;
import Repositorios.ProductoRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class CarritoView {

    ProductoController prodcont = new ProductoController();
    static CarritoRepository carritoRepository = new CarritoRepository();
    static CarritoCompras carritoCompras = new CarritoCompras();
    static Scanner scanner = new Scanner(System.in);

    public CarritoView() {
    }

    public String agrearAlCarrito(Producto p) {
        String opcion = null;
        if (p != null) {
            System.out.println("Agregar al carrito? s/n");
            opcion = scanner.nextLine();
        }
        return opcion;
    }

    public static void verCarritoActual(CarritoCompras carritoCompras) {
        for (Producto p : carritoCompras.productos)
        {
            System.out.println(p.toString());

        }
    }

    public static void verLista() {
        for (Map.Entry<String, CarritoCompras> entry : carritoRepository.carritocomprasRepository.entrySet()) {

            System.out.println(entry.getValue().toString());
        }
    }

    public static  void menuComprador ()
    {
        System.out.println("Menú:");
        System.out.println("1. Ver Productos");
        System.out.println("2. Buscar");
        System.out.println("3. agregar carrito");
        System.out.println("4. ver carrito actual");
        System.out.println("5. finalizar compra");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: ");
    }

}

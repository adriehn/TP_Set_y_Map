package Vista;

import Controlador.CarritoController;
import Controlador.ProductoController;
import Entidad.CarritoCompras;
import Entidad.Producto;
import Repositorios.CarritoRepository;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CarritoView {
    static CarritoController carritoController = new CarritoController();
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
        for (Producto p : carritoCompras.productos) {
            System.out.println(p.toString());

        }
    }

    public static void verLista() {
        for (Map.Entry<String, CarritoCompras> entry : carritoRepository.carritocomprasRepository.entrySet()) {

            System.out.println(entry.getValue().toString());
        }
    }

    public static void menuComprador() {
        System.out.println("Menú:");
        System.out.println("1. Ver Productos");
        System.out.println("2. Buscar");
        System.out.println("3. agregar carrito");
        System.out.println("4. ver carrito actual");
        System.out.println("5. finalizar compra");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: ");
    }

    public void totalCompra(int total) {
        System.out.println("El total de la compra es : $ " + total);

    }

    public void totalCategorias(Set<String> categoriaUnica) {

        System.out.println("Las Categorias que has comprado son : ");
        for (String s : categoriaUnica)
        {
            System.out.println(s);
        }
    }
    public static void primerMenu()
    {
        System.out.println("Ingresa como:");
        System.out.println("1. administrador.");
        System.out.println("2. comprador.");
        System.out.println("3. Salir");
        System.out.print("Ingrese su opción: ");
    }

    public void salir ()
    {
        System.out.println("Saliendo del programa...");

    } public void opcionInvalida ()
    {
        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");

    }
}

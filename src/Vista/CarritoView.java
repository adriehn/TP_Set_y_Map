package Vista;

import Entidad.CarritoCompras;
import Entidad.Producto;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CarritoView {
    static Scanner scanner = new Scanner(System.in);

    public CarritoView() {
    }

    public static String agrearAlCarrito() {
        System.out.println("Agregar al carrito? s/n");
        return scanner.nextLine();
    }

    public static void verCarritoActual(CarritoCompras carritoCompras) {
        for (Producto p : carritoCompras.productos) {
            System.out.println(p.toString());

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

    public static void totalCompra(int total) {
        System.out.println("El total de la compra es : $ " + total);
    }

    public static void totalCategorias(Set<String> categoriaUnica) {

        System.out.println("Las Categorias que has comprado son : ");
        for (String s : categoriaUnica) {
            System.out.println(s);
        }
    }

    public static void primerMenu() {
        System.out.println("Ingresa como:");
        System.out.println("1. administrador.");
        System.out.println("2. comprador.");
        System.out.println("3. Salir");
        System.out.print("Ingrese su opción: ");
    }

    public static void salir() {
        System.out.println("Saliendo del programa...");

    }

    public static void opcionInvalida() {
        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
    }

    public static void verLista(Map.Entry<String, CarritoCompras> a) {
        System.out.println(a);
    }
}

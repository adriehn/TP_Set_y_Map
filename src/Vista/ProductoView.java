package Vista;

import Entidad.Producto;
import Repositorios.ProductoRepository;
import org.w3c.dom.ls.LSOutput;

import java.util.Map;
import java.util.Scanner;

public class ProductoView {
    public ProductoView() {
    }

    static Scanner scanner = new Scanner(System.in);
    static ProductoRepository prodrepo = new ProductoRepository();

    public static Producto crearProducto() {

        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio: ");
        Integer precio = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la categoria: ");
        String categoria = scanner.nextLine();

        Producto p = new Producto(nombre, precio, categoria);


        return p;

    }

    public static String buscar() {
        System.out.println("Ingrese el ID del producto");
        String id = scanner.nextLine();
        return id;
    }

    public static Producto encontrado(boolean a, String id) {
        if (a == true) {
            Producto encontrado = prodrepo.listaProductos.get(id);
            return encontrado;
        } else {
            return null;
        }
    }

    public static void mostrarUnProducto(Producto p) {
        if (p != null) {
            System.out.println(p.toString());

        } else {
            System.out.println("No existe el producto buscado.");
        }
    }

    public static void verLista() {
        for (Map.Entry<String, Producto> entry : ProductoRepository.listaProductos.entrySet()) {

            System.out.println(entry.getValue().toString());
        }
    }

    public static void menuAdministrador()
    {
        System.out.println("Menú:");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Ver Productos");
        System.out.println("3. Buscar");
        System.out.println("4. Ver historial carritos");
        System.out.println("5. Salir");
        System.out.print("Ingrese su opción: ");
    }

}

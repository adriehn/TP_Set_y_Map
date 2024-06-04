package Vista;

import Entidad.Producto;

import java.util.Map;
import java.util.Scanner;

public class ProductoView {
    public ProductoView() {
    }

    static Scanner scanner = new Scanner(System.in);

    public static Producto crearProducto() {

        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio: ");
        Integer precio = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la categoria: ");
        String categoria = scanner.nextLine();

        return new Producto(nombre, precio, categoria);

    }

    public static String buscar() {
        System.out.println("Ingrese el ID del producto");
        return scanner.nextLine();
    }


    public static void mostrarUnProducto(Producto p) {
        if (p != null) {
            System.out.println(p);

        } else {
            System.out.println("No existe el producto buscado.");
        }
    }

    public static void verLista(Map.Entry<String, Producto> a) {

            System.out.println(a);

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

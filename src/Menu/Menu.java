package Menu;

import Controlador.CarritoController;
import Controlador.ProductoController;
import Entidad.CarritoCompras;
import Entidad.Producto;
import Vista.CarritoView;
import Vista.ProductoView;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarritoView carritoView = new CarritoView();

        while (true) {
            carritoView.primerMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    administrador();
                    break;
                case 2:
                    Comprador();
                    break;
                case 3:
                    carritoView.salir();
                    return;
                default:
                    carritoView.opcionInvalida();
            }
        }

    }


    public static void Comprador() {
        Scanner scanner = new Scanner(System.in);

        ProductoController controller = new ProductoController();
        CarritoController carritocontroller = new CarritoController();
        CarritoCompras carritoCompras = new CarritoCompras(0);
        CarritoView carritoView = new CarritoView();
        Producto p = new Producto();
        while (true) {

            carritoView.menuComprador();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ProductoView.verLista();
                    break;
                case 2:
                    p = controller.buscar();
                    break;
                case 3:
                    carritocontroller.agregarAlCarrito(carritoCompras);
                    break;
                case 4:
                    carritoView.verCarritoActual(carritoCompras);
                    break;
                case 5:
                    carritocontroller.finalizarCompra(carritoCompras);
                    carritoCompras = new CarritoCompras(0);
                    break;
                case 6:
                    carritoView.salir();
                    return;
                default:
                    carritoView.opcionInvalida();
            }
        }

    }

    public static void administrador() {
        ProductoController controller = new ProductoController();
        CarritoView carritoView = new CarritoView();
        ProductoView productoView = new ProductoView();
        Scanner scanner = new Scanner(System.in);
        Producto p = new Producto();
        while (true) {

            productoView.menuAdministrador();

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    controller.agregarProducto();
                    break;
                case 2:
                    ProductoView.verLista();
                    break;
                case 3:
                    p = controller.buscar();
                    break;
                case 4:
                    carritoView.verLista();
                    break;
                case 5:
                    carritoView.salir();
                    return;
                default:
                    carritoView.opcionInvalida();
            }
        }

    }
}

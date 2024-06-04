package Menu;

import Controlador.CarritoController;
import Controlador.ProductoController;
import Entidad.CarritoCompras;
import Vista.CarritoView;
import Vista.ProductoView;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            CarritoView.primerMenu();
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
                    CarritoView.salir();
                    return;
                default:
                    CarritoView.opcionInvalida();
            }
        }

    }


    public static void Comprador() {
        Scanner scanner = new Scanner(System.in);
        CarritoController carritocontroller = new CarritoController();
        CarritoCompras carritoCompras = new CarritoCompras();
        while (true) {

            CarritoView.menuComprador();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ProductoController.verLista();
                    break;
                case 2:
                    ProductoController.buscar();
                    break;
                case 3:
                    carritocontroller.agregarAlCarrito(carritoCompras);
                    break;
                case 4:
                    CarritoView.verCarritoActual(carritoCompras);
                    break;
                case 5:
                    carritocontroller.finalizarCompra(carritoCompras);
                    carritoCompras = new CarritoCompras();
                    break;
                case 6:
                    CarritoView.salir();
                    return;
                default:
                    CarritoView.opcionInvalida();
            }
        }

    }

    public static void administrador() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            ProductoView.menuAdministrador();

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ProductoController.agregarProducto();
                    break;
                case 2:
                    ProductoController.verLista();
                    break;
                case 3:
                    ProductoController.buscar();
                    break;
                case 4:
                    CarritoController.verLista();
                    break;
                case 5:
                    CarritoView.salir();
                    return;
                default:
                    CarritoView.opcionInvalida();
            }
        }

    }
}

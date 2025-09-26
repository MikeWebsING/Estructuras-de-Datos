/*
 * ¡Bienvenido al Sistema de Inventario de Tienda!
 * 
 * Este proyecto fue desarrollado por Miguel Macias para simular la gestión
 * básica de un inventario de productos. Permite agregar, eliminar y consultar
 * artículos de una tienda de abarrotes de forma sencilla.
 * 
 * ¡Espero que este programa te sea útil para entender los conceptos básicos
 * de la gestión de datos en Java!
 */
package com.mycompany.ejercicio_01;

import java.util.*;

class Ejercicio_01 {

    public static void main(String[] args) {

        Articulo[] inventario = new Articulo[100];

        inventario[0] = new Articulo(101, "Manzana", 100, 15.5f);
        inventario[1] = new Articulo(102, "Pan Blanco", 50, 30.0f);
        inventario[2] = new Articulo(103, "Leche Lala 1L", 80, 25.5f);
        inventario[3] = new Articulo(104, "Azúcar 1kg", 40, 24.0f);
        inventario[4] = new Articulo(105, "Arroz 1kg", 60, 20.5f);
        inventario[5] = new Articulo(106, "Frijol 1kg", 50, 22.0f);
        inventario[6] = new Articulo(107, "Aceite 1L", 30, 35.0f);
        inventario[7] = new Articulo(108, "Huevos 12 piezas", 90, 45.0f);
        inventario[8] = new Articulo(109, "Sal 1kg", 70, 12.0f);
        inventario[9] = new Articulo(110, "Pasta La Moderna", 60, 8.5f);
        inventario[10] = new Articulo(111, "Atún lata", 50, 16.0f);
        inventario[11] = new Articulo(112, "Sardinas lata", 40, 18.0f);
        inventario[12] = new Articulo(113, "Café soluble", 25, 42.0f);
        inventario[13] = new Articulo(114, "Harina de trigo 1kg", 55, 16.5f);
        inventario[14] = new Articulo(115, "Mantequilla 90g", 30, 23.5f);
        inventario[15] = new Articulo(116, "Jugo de naranja 1L", 50, 25.0f);
        inventario[16] = new Articulo(117, "Queso Oaxaca 250g", 35, 70.0f);
        inventario[17] = new Articulo(118, "Crema 250ml", 40, 18.0f);
        inventario[18] = new Articulo(119, "Cereal Corn Flakes 500g", 20, 45.0f);
        inventario[19] = new Articulo(120, "Chocolates Snickers", 100, 13.0f);
        inventario[20] = new Articulo(121, "Refresco Coca-Cola 600ml", 120, 16.0f);
        inventario[21] = new Articulo(122, "Galletas Marías", 80, 12.5f);
        inventario[22] = new Articulo(123, "Sopa Maruchan", 60, 10.0f);
        inventario[23] = new Articulo(124, "Fideos instantáneos", 70, 7.5f);
        inventario[24] = new Articulo(125, "Papas fritas Sabritas", 50, 18.0f);
        inventario[25] = new Articulo(126, "Tortillas 1kg", 150, 20.0f);
        inventario[26] = new Articulo(127, "Yogurt Danone 1L", 40, 30.0f);
        inventario[27] = new Articulo(128, "Plátano", 90, 12.0f);
        inventario[28] = new Articulo(129, "Naranja", 80, 8.0f);
        inventario[29] = new Articulo(130, "Papel higiénico 4 rollos", 60, 25.0f);
        inventario[30] = new Articulo(131, "Detergente 1kg", 30, 35.0f);
        inventario[31] = new Articulo(132, "Suavizante 1L", 20, 40.0f);
        inventario[32] = new Articulo(133, "Jabón Zote", 100, 12.0f);
        inventario[33] = new Articulo(134, "Shampoo 500ml", 25, 45.0f);
        inventario[34] = new Articulo(135, "Pasta dental", 40, 25.0f);
        inventario[35] = new Articulo(136, "Cepillo dental", 50, 20.0f);
        inventario[36] = new Articulo(137, "Cloro 1L", 30, 15.0f);
        inventario[37] = new Articulo(138, "Fabuloso 1L", 25, 30.0f);
        inventario[38] = new Articulo(139, "Veladora", 80, 12.0f);
        inventario[39] = new Articulo(140, "Pilón de 100 pesos", 25, 100.0f);
        inventario[40] = new Articulo(141, "Cerveza Corona 355ml", 60, 20.0f);
        inventario[41] = new Articulo(142, "Vino tinto", 10, 120.0f);
        inventario[42] = new Articulo(143, "Té Lipton 20 sobres", 40, 18.0f);
        inventario[43] = new Articulo(144, "Mayonesa McCormick 380g", 30, 35.0f);
        inventario[44] = new Articulo(145, "Catsup Heinz 397g", 20, 32.0f);
        inventario[45] = new Articulo(146, "Mostaza French's 226g", 25, 25.0f);
        inventario[46] = new Articulo(147, "Chiles en vinagre lata", 40, 22.0f);
        inventario[47] = new Articulo(148, "Salsa Valentina 370ml", 50, 15.0f);
        inventario[48] = new Articulo(149, "Helado de vainilla 1L", 20, 60.0f);
        inventario[49] = new Articulo(150, "Miel de abeja 250g", 15, 55.0f);
        inventario[50] = new Articulo(151, "costa brava 250ml", 30, 10.0f);

        Scanner leer = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("Menú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Consultar producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(inventario, leer);
                    break;
                case 2:
                    eliminarProducto(inventario, leer);
                    break;
                case 3:
                    consultarProducto(inventario, leer);
                    break;
                case 4:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        leer.close();
        System.out.println("Programa finalizado.");
    }

    private static void agregarProducto(Articulo[] inventario, Scanner leer) {
        System.out.print("Ingrese la clave del producto: ");
        int clave = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = leer.nextLine();
        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = leer.nextInt();
        System.out.print("Ingrese el precio del producto: ");
        float precio = leer.nextFloat();

        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                inventario[i] = new Articulo(clave, descripcion, cantidad, precio);
                System.out.println("Producto agregado exitosamente.");
                return;
            }
        }
        System.out.println("Inventario lleno. No se pudo agregar el producto.");
    }

    private static void eliminarProducto(Articulo[] inventario, Scanner leer) {
        System.out.print("Ingrese la clave del producto a eliminar: ");
        int clave = leer.nextInt();

        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null && inventario[i].clave == clave) {
                inventario[i] = null;
                System.out.println("Producto eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    private static void consultarProducto(Articulo[] inventario, Scanner leer) {
        System.out.print("Ingrese la clave del producto que desea buscar: ");
        int buscarClave = leer.nextInt();

        Articulo artEncontrado = buscarProducto(inventario, buscarClave);

        if (artEncontrado != null) {
            System.out.println("Clave: " + artEncontrado.clave);
            System.out.println("Descripción: " + artEncontrado.descripcion);
            System.out.println("Cantidad: " + artEncontrado.cantidad);
            System.out.println("Precio: " + artEncontrado.precio);
            System.out.println("Inversión: " + artEncontrado.cantidad * artEncontrado.precio);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static Articulo buscarProducto(Articulo[] inventario, int clave) {
        for (Articulo producto : inventario) {
            if (producto != null && producto.clave == clave) {
                return producto;
            }
        }
        return null;
    }
}

class Articulo {

    int clave;
    String descripcion;
    int cantidad;
    float precio;

    Articulo(int c, String d, int cant, float p) {
        clave = c;
        descripcion = d;
        cantidad = cant;
        precio = p;
    }
}

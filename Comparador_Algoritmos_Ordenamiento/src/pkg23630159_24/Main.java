/*
 * Proyecto: Implementación y Comparación de Algoritmos de Ordenamiento
 * Creado por: Miguel Macias
 * Fecha de Creación: 25 de julio de 2025
 * Descripción: Clase principal que implementa y compara la eficiencia de diversos algoritmos de ordenamiento en arreglos.
 */

/*
 * ¡Bienvenido al Comparador de Algoritmos de Ordenamiento!
 * 
 * Este proyecto fue desarrollado por Miguel Macias como una herramienta para
 * analizar y comparar el rendimiento de diferentes algoritmos de ordenamiento
 * en Java. ¡Espero que te sea de gran utilidad para entender mejor cómo
 * funcionan estos algoritmos!
 * 
 * Si tienes alguna pregunta o sugerencia, no dudes en contactarme.
 * 
 * ¡Disfruta explorando el código!
 */
package pkg23630159_24;

import java.util.Scanner;

public class Main {

    static MisMetodos mm = new MisMetodos();

    static Scanner L = new Scanner(System.in);
    static int TamArr;
    static int[] A;

    public static void main(String[] args) {
        int op = 0;

        System.out.println("Tamano del Arreglo");
        TamArr = L.nextInt();             
        System.out.println("");

        System.out.println("*****METODOS DE ORDENAMIENTO*****");

        do {
            System.out.println("1. Burbuja Simple\n"
                    + "2. Burbuja Mejorada\n"
                    + "3. QuickSort\n"
                    + "4. HeapSort\n"
                    + "5. MergeSort\n"
                    + "6. Evaluar Metodos De Ordenamiento\n"
                    + "7. Salir");
            op = L.nextInt();
            switch (op) {
                case 1:
                    System.out.println("BURBUJA SIMPLE\n");
                    A = mm.CrearArreglo(TamArr);
                    System.out.println("Arreglo Desordenado:");
                    mm.ImprimeArreglo(A);
                    System.out.println("Arreglo Ordenado:");
                    mm.ImprimeArreglo(mm.BurbujaSimple(A));
                    System.out.println("");                  
                    break;
                case 2:
                    System.out.println("BURBUJA MEJORADA\n");
                    A = mm.CrearArreglo(TamArr);
                    System.out.println("Arreglo Desordenado:");
                    mm.ImprimeArreglo(A);
                    System.out.println("Arreglo Ordenado:");
                    mm.ImprimeArreglo(mm.BurbujaMejorada(A));
                    break;
                case 3:
                    System.out.println("QUICKSORT\n");
                   A = mm.CrearArreglo(TamArr);
                    System.out.println("Arreglo Desordenado:");
                    mm.ImprimeArreglo(A);
                    mm.QuickSort(A, 0, A.length - 1);
                    System.out.println("Arreglo Ordenado:");
                    mm.ImprimeArreglo(A);
                    break;
                case 4:
                    System.out.println("HEAPSORT:\n");
                    A = mm.CrearArreglo(TamArr);
                    System.out.println("Arreglo Desordenado:");
                    mm.ImprimeArreglo(A);
                    System.out.println("Arreglo ordenado");
                    mm.CrearArbolBST(A);
                    break;
                case 5:
                    System.out.println("MergeSort\n");
                    A = mm.CrearArreglo(TamArr);
                    System.out.println("Arreglo Desordenado:");
                    mm.ImprimeArreglo(A);
                    mm.MergeSort(A, 0, A.length - 1);
                    System.out.println("Arreglo Ordenado:");
                    mm.ImprimeArreglo(A);
                    break;
                case 6:                   
                mm.Evaluar(TamArr);
                break;
                
            }
        } while (op != 7);
    }
}

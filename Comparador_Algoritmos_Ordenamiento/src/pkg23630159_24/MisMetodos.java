package pkg23630159_24;

import java.util.Random;


public class MisMetodos {

    static Nodo Raiz;
    static long ti, tf, tt;

    public int[] CrearArreglo(int n) {
        int[] Arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Arr[i] = random.nextInt(n) + 1;
        }
        return Arr;
    }

    public void ImprimeArreglo(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }

    public int[] BurbujaSimple(int A[]) {
        ti = System.nanoTime();
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int Aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = Aux;
                }
            }
        }
        tf = System.nanoTime();
        tt = tf - ti;
        return A;
    }

    public int[] BurbujaMejorada(int A[]) {
        ti = System.nanoTime();
        boolean Cambiar;
        for (int i = 0; i < A.length - 1; i++) {
            Cambiar = false;
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int Aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = Aux;
                    Cambiar = true;
                }
            }
            if (!Cambiar) {

            }
        }
        tf = System.nanoTime();
        tt = tf - ti;
        return A;
    }

    public void QuickSort(int A[], int primero, int ultimo) {
        ti = System.nanoTime();
        int i, j, pivote, aux;
        i = primero;
        j = ultimo;
        pivote = A[(primero + ultimo) / 2];
        do {
            while (A[i] < pivote) {
                i++;
            }
            while (A[j] > pivote) {
                j--;
            }
            if (i <= j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero <= j) {
            QuickSort(A, primero, j);
        }
        if (i < ultimo) {
            QuickSort(A, i, ultimo);
        }
        tf = System.nanoTime();
        tt = tf - ti;

    }

    public void ArbolBST(int Dato) {
        Nodo nuevoNodo = new Nodo(Dato);
        if (Raiz == null) {
            Raiz = nuevoNodo;
        } else {
            Nodo actual = Raiz;
            Nodo padre;
            while (true) {
                padre = actual;
                if (Dato < actual.Dato) {
                    actual = actual.Izq;
                    if (actual == null) {
                        padre.Izq = nuevoNodo;
                        break;
                    }
                } else {
                    actual = actual.Der;
                    if (actual == null) {
                        padre.Der = nuevoNodo;
                        break;
                    }
                }
            }
        }
    }

    public void CrearArbolBST(int[] A) {
        Raiz = null;
        ti = System.nanoTime();
        for (int i = 0; i < A.length; i++) {
            ArbolBST(A[i]);
        }
        System.out.println("Arbol en orden (Inorden):");
        Inorden(Raiz);
        System.out.println();
        tf = System.nanoTime();
        tt = tf - ti;
    }

    public void Inorden(Nodo nodo) {
        if (nodo != null) {
            Inorden(nodo.Izq);
            System.out.print(nodo.Dato + " ");
            Inorden(nodo.Der);
        }
    }

    public void MergeSort(int A[], int izquierdo, int derecho) {
        ti = System.nanoTime();
        if (izquierdo < derecho) {
            int medio = (izquierdo + derecho) / 2;
            MergeSort(A, izquierdo, medio);
            MergeSort(A, medio + 1, derecho);
            Fusionar(A, izquierdo, medio, derecho);
        }
        tf = System.nanoTime();
        tt = tf - ti;
    }

    public void Fusionar(int A[], int izquierdo, int medio, int derecho) {
        int n1 = medio - izquierdo + 1;
        int n2 = derecho - medio;
        int[] Izq = new int[n1];
        int[] Der = new int[n2];
        for (int i = 0; i < n1; i++) {
            Izq[i] = A[izquierdo + i];
        }
        for (int i = 0; i < n2; i++) {
            Der[i] = A[medio + 1 + i];
        }
        int i = 0, j = 0, k = izquierdo;
        while (i < n1 && j < n2) {
            if (Izq[i] <= Der[j]) {
                A[k] = Izq[i];
                i++;
            } else {
                A[k] = Der[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            A[k] = Izq[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = Der[j];
            j++;
            k++;
        }
    }

    public void Evaluar(int TamArr) {
        int[] A;
        long[] Tiempo = new long[5];
        String[] Metodo = {"BURBUJA SIMPLE", "BURBUJA MEJORADA", "QUICK SORT", "HEAPSORT", "MERGE SORT"};

        System.out.println("BURBUJA SIMPLE");
        A = CrearArreglo(TamArr);
        System.out.println("Arreglo Desordenado:");
        ImprimeArreglo(A);
        BurbujaSimple(A);
        System.out.println("Arreglo Ordenado:");
        ImprimeArreglo(A);
        Tiempo[0] = tt;
        System.out.println("El tiempo de ejecucion de BURBUJA SIMPLE fue: " + tt + " ns.\n");

        System.out.println("67BURBUJA MEJORADA");
        A = CrearArreglo(TamArr);
        System.out.println("Arreglo Desordenado:");
        ImprimeArreglo(A);
        BurbujaMejorada(A);
        System.out.println("Arreglo Ordenado:");
        ImprimeArreglo(A);
        Tiempo[1] = tt;
        System.out.println("El tiempo de ejecucion de BURBUJA MEJORADA fue: " + tt + " ns.\n");

        System.out.println("QUICKSORT");
        A = CrearArreglo(TamArr);
        System.out.println("Arreglo Desordenado:");
        ImprimeArreglo(A);
        QuickSort(A, 0, A.length - 1);
        System.out.println("Arreglo Ordenado:");
        ImprimeArreglo(A);
        Tiempo[2] = tt;
        System.out.println("El tiempo de ejecucion de QUICKSORT fue: " + tt + " ns.\n");

        System.out.println("HEAPSORT:");
        A = CrearArreglo(TamArr);
        System.out.println("Arreglo Desordenado:");
        ImprimeArreglo(A);
        CrearArbolBST(A);
        System.out.println("Arreglo Ordenado:");
        ImprimeArreglo(A);
        Tiempo[3] = tt;
        System.out.println("El tiempo de ejecucion de HEAPSORT fue: " + tt + " ns.\n");

        System.out.println("MERGESORT");
        A = CrearArreglo(TamArr);
        System.out.println("Arreglo Desordenado:");
        ImprimeArreglo(A);
        MergeSort(A, 0, A.length - 1);
        System.out.println("Arreglo Ordenado:");
        ImprimeArreglo(A);
        Tiempo[4] = tt;
        System.out.println("El tiempo de ejecucion de MERGESORT fue: " + tt + " ns.\n");

        long MenorT = Tiempo[0];
        String TiempoE = Metodo[0];

        for (int i = 1; i < Tiempo.length; i++) {
            if (Tiempo[i] < MenorT) {
                MenorT = Tiempo[i];
                TiempoE = Metodo[i];
            }
        }

        System.out.println("El metodo mas eficiente fue " + TiempoE + " con un tiempo de " + MenorT + " ns.\n");
    }

}

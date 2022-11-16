package E12;

import java.util.Scanner;

public class E12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("teclee el numero de filas de la matriz: ");
        int f = teclado.nextInt();
        System.out.print("Introuzca el numero de columnas de la matriz: ");
        int c = teclado.nextInt();
        int matriz[][] = new int[f][c];

        LlenarMatriz(matriz, f - 1, c - 1, 0, 0);
        imprimirMatriz(matriz, 0, 0);
        System.out.println("Sumatoria: " + sumatoriaMatriz(matriz, f - 1, c - 1));
    }

    public static void LlenarMatriz(int[][] matriz, int f, int c, int i, int j) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("teclee numero [" + i + "," + j + "]: ");
        matriz[i][j] = teclado.nextInt();
        if (j < c) {
            LlenarMatriz(matriz, f, c, i, j + 1);
        } else if (j > c) {
            LlenarMatriz(matriz, f, c, i + 1, 0);
        } else {
            if (i == f) {

            } else {
                LlenarMatriz(matriz, f, c, i + 1, 0);
            }
        }
    }

    public static int sumatoriaMatriz(int[][] matriz, int f, int c) {
        if ((f == 0) && (c == 0)) {
            return matriz[f][c];
        } else {
            if (f > -1) {
                c--;
                if (c >= -1) {
                    return matriz[f][c + 1] + sumatoriaMatriz(matriz, f, c);
                } else {
                    return sumatoriaMatriz(matriz, f - 1, 2);
                }
            } else {
                return 0;
            }
        }
    }

    public static void imprimirMatriz(int matriz[][], int i, int j) {
        if (i < matriz.length) {
            System.out.print("| " + matriz[i][j] + " ");
            j++;
            if (j >= matriz[0].length) {
                System.out.println("|");
                i = i + 1;
                j = 0;
            }
            imprimirMatriz(matriz, i, j);
        }
    }

}

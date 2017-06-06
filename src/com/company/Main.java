package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[][] b = new char[10][10];
        int[] s = new int[10];
        int i, j, n, m;
        char t;
        float p;

        System.out.println("VVedite n: ");
        n = in.nextInt();
        System.out.println("VVedite m: ");
        m = in.nextInt();

        System.out.println("Matrix");
        //ввод матрицы
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                b[i][j] = (char) in.nextInt();
            }
            System.out.println("/");
        }

        System.out.println("Matrix 1");
        //транспонированая
        for (i = 1; i <= n; i++) {
            for (j = i; j <= m; j++) {
                t = b[i][j];
                b[i][j] = b[j][i];
                b[j][i] = t;
            }

        }

        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print((int) b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("serednye znach stovpchikiv");
        
        //среднее значение столбиков
        for (i = 1; i <= n; i++) {
            s[i] = 0;
            for (j = 1; j <= m; j++) {
                s[i] = s[i] + (int) b[j][i];
            }
            p = (float) s[i] / m;
            System.out.print("Stovpchik ");
            System.out.print(i);
            System.out.print("- ");
            System.out.println(p);
        }
    }
}

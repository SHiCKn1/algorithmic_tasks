package com.prokopovich.tinkoff_2023_summer_academy.task3;

import java.util.Arrays;
import java.util.Scanner;

public class СountAccessibleRooms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        //System.out.println(Arrays.deepToString(map));



        for (int qi = 0; qi < q; qi++) {
            int n1 = scanner.nextInt() - 1;
            int m1 = scanner.nextInt() - 1;
            int current_danger = map[n1][m1];
            int health = scanner.nextInt();

            int countRooms = 0;

            for (int i = 0; i < n; i++) {
                if (i != n1) {
                    int diff = current_danger - map[i][m1];
                    if (diff < 0) {
                        diff = -diff;
                    }
                    if (diff <= health) {
                        countRooms++;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                if (i != m1) {
                    int diff = current_danger - map[n1][i];
                    if (diff < 0) {
                        diff = -diff;
                    }
                    if (diff <= health) {
                        countRooms++;
                    }
                }
            }

            System.out.println(countRooms);
        }

    }
}

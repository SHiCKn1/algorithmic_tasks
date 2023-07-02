package com.prokopovich.tinkoff_2023_summer_academy.task4;

import java.util.Scanner;

public class СompressionAlgorithm {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int qi = 0; qi < q; qi++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int numberForCompression = l;

            for (int i = (l + 1); i <= r ; i++) {
                numberForCompression = numberForCompression * i;
            }


            while (numberForCompression > 9) {
                int temp2 = 0;
                int myInt = numberForCompression;
                while (myInt != 0) {
                    temp2 = temp2 + (myInt % 10);
                    myInt = myInt / 10;
                }
                numberForCompression = temp2;
            }

            System.out.println(numberForCompression);

        }

    }
}

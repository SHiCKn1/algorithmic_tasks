package com.prokopovich.tinkoff_2023_summer_academy.task1;

import java.util.Scanner;

public class CostOfShumeridy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int numberOfCubes = 0;
        int cost = 0;

        for (int i = 1; i <= h; i++) {
            numberOfCubes = numberOfCubes + (int) Math.pow((2*i-1),2);
            //System.out.println(numberOfCubes);
            cost = (int) Math.pow((2*i-1),3) - numberOfCubes;
            System.out.print(cost+" ");
        }
    }
}

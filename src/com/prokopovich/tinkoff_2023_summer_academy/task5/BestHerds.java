package com.prokopovich.tinkoff_2023_summer_academy.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BestHerds {

    public

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        List<String> herds = new ArrayList<>();
        scanner.nextLine();

        //заведем константы
        char charA = 'a';
        char charB = 'b';
        char charC = 'c';


        for (int qi = 0; qi < q; qi++) {
            String s = scanner.nextLine();
            herds.add(s);
        }

        //теперь надо посчитать сколько лошадей каждого типа и вычислить слабость и силу
        //Переберем все варианты
        for (int i = 0; i < herds.size(); i++) {
            for (int j = i + 1; j < herds.size(); j++) {
                String s = herds.get(i);// + herds.get(j);
                int na = 0;
                int nb = 0;
                int nc = 0;

                for (int k = 0; k < s.length(); k++) {
                    char ch = s.charAt(k);
                    if (ch == charA) {
                        na++;
                    } else if (ch == charB) {
                        nb++;
                    } else if (ch == charC) {
                        nc++;
                    }
                }

                int weakness = Math.max(na,Math.max(nb,nc)) - Math.min(na,Math.min(nb,nc));
                int power = na + nb + nc;

                System.out.println(s + " " + weakness + " " + power);
            }
        }
    }


}

package com.prokopovich.tinkoff_2023_summer_academy.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BestHerds {

    public static int getWeek(String s) {
        char charA = 'a';
        char charB = 'b';
        char charC = 'c';

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

        return Math.max(na,Math.max(nb,nc)) - Math.min(na,Math.min(nb,nc));
    }

    public static int getPower(String s) {
        char charA = 'a';
        char charB = 'b';
        char charC = 'c';

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

        return na + nb + nc;
    }

    public static List<String> getCombinations(List<String> originalList) {
        List<String> result = new ArrayList<>();
        StringBuilder currentCombination = new StringBuilder();

        backtrack(originalList, 0, currentCombination, result);

        return result;
    }

    private static void backtrack(List<String> originalList, int index, StringBuilder currentCombination, List<String> result) {
        if (index == originalList.size()) {
            result.add(currentCombination.toString());
            return;
        }

        // Попробовать добавить элемент в текущую комбинацию
        currentCombination.append(originalList.get(index));
        backtrack(originalList, index + 1, currentCombination, result);
        currentCombination.delete(currentCombination.length() - originalList.get(index).length(), currentCombination.length());

        // Попробовать не добавлять элемент в текущую комбинацию
        backtrack(originalList, index + 1, currentCombination, result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        List<String> herds = new ArrayList<>();
        scanner.nextLine();

       for (int qi = 0; qi < q; qi++) {
            String s = scanner.nextLine();
            herds.add(s);
        }

        List<String> result = getCombinations(herds);

       int cw = Integer.MAX_VALUE;
       int cp = 0;


        // Вывод результатов
        for (String combination : result) {
            if(!(getPower(combination) == 0)) {
                cw = Math.min(cw,getWeek(combination));

            }

            //System.out.println(combination + " " +  + " " + getPower(combination));
        }

        for (String combination : result) {
            if(!(getPower(combination) == 0)) {
                if((cw == getWeek(combination)) && (cp <= getPower(combination))) {
                    cw = getWeek(combination);
                    cp = getPower(combination);
                }
            }

            //System.out.println(combination + " " +  + " " + getPower(combination));
        }

        System.out.println(cp);

    }


}

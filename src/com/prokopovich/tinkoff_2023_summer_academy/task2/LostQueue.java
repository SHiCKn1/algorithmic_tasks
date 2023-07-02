package com.prokopovich.tinkoff_2023_summer_academy.task2;

import java.util.*;

public class LostQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        Deque<Integer> queue = new LinkedList<>();
        List<Integer> removeElements = new ArrayList<>();


        for (int i = 0; i < m; i++) {
            int command = scanner.nextInt();

            if (command == 1) {
                int x = scanner.nextInt();
                queue.addLast(x);
            } else if (command == 2) {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    int element = queue.removeFirst();
                    queue.addLast(element);
                    queue.addLast(element);
                }
            } else if (command == 3) {
                removeElements.add(queue.removeFirst());
            }
        }

//        while (!queue.isEmpty()) {
//            System.out.println(queue.removeFirst());
//        }


        for (Integer i : removeElements) {
            System.out.println(i);
        }

    }
}




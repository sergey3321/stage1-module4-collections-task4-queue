package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.offer(i);
        }

        List<Integer> list = new ArrayList<Integer>();

        while (!queue.isEmpty()) {
            int current = 1;
            while (!queue.isEmpty()) {
                if (current == everyDishNumberToEat) {
                    int dish = queue.poll().intValue();
                    list.add(dish);
                    queue.offer(dish);
                    current = 1;
                } else {
                    queue.offer(queue.poll());
                    current++;
                }
            }
        }

        return list;
    }
}

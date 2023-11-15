package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {

    List<Integer> result = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                queue.add(queue.poll());
            }

            result.add(queue.poll());
        }

        return result;
    }
}

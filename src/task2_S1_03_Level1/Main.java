package task2_S1_03_Level1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        List<Integer> numbers2 = new ArrayList<>();

        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());

        while (iterator.hasPrevious()) {
            Integer num = iterator.previous();
            numbers2.add(num);
        }
        System.out.println("First list in ascending order: " + numbers);
        System.out.println("Second list in descending order with listIterator: " + numbers2);
    }
}

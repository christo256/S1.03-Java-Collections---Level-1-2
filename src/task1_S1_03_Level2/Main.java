package task1_S1_03_Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Burguer King", 4);
        Restaurant restaurant2 = new Restaurant("Five Guys", 5);
        Restaurant restaurant3 = new Restaurant("La Paellera", 6);
        Restaurant restaurant4 = new Restaurant("La cachapera", 8);
        Restaurant restaurant5 = new Restaurant("Burguer King", 4);
        Restaurant restaurant6 = new Restaurant("Five Guys", 5);
        Restaurant restaurant7 = new Restaurant("La Paellera", 7);

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
        restaurants.add(restaurant4);
        restaurants.add(restaurant5);
        restaurants.add(restaurant6);
        restaurants.add(restaurant7);

        System.out.println("Saved restaurants: ");
        for (Restaurant r : restaurants) {
            System.out.println(r + " hashCode: " + r.hashCode());
        }

        List<Restaurant> sortedList = new ArrayList<>(restaurants);

        Collections.sort(sortedList);

        System.out.println("\nRestaurants orded by name and score: ");

        for (Restaurant r : sortedList) {
            System.out.println(r);

        }
    }
}

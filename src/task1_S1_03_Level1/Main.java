package task1_S1_03_Level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
        // Adding duplicate months to confirm that HashSet does not allow duplicates
        months.add(new Month("November"));
        months.add(new Month("December"));

        months.add(7, new Month("August"));
        System.out.println("Sorted ArrayList but with duplicates: ");
        for (Month month : months) {
            System.out.println(month.getName());
        }
        HashSet<Month> monthSet = new HashSet<>(months);
        System.out.println("\n" + "HashSet contents without duplicates in a for loop: ");
        for (Month month : monthSet) {
            System.out.println(month.getName());
        }
        System.out.println("\n" + "Traversing the hashSet list with an iterator: ");
        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()) {
            Month currentMonth = iterator.next();
            System.out.println(currentMonth.getName());
        }
    }
}

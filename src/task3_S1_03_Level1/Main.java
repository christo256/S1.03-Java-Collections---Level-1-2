package task3_S1_03_Level1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> countriesMap = new HashMap<>();

        try (BufferedReader bRead = new BufferedReader(new FileReader("countries.txt"))) {
            String line;
            while ((line = bRead.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countriesMap.put(country, capital);
                }
            }
        } catch (IOException error) {
            System.out.println("Error reading file: " + error.getMessage());
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Write ur name to start the game: ");
        String userName = sc.nextLine();

        List<String> countryList = new ArrayList<>(countriesMap.keySet());
        Random random = new Random();
        int score = 0;

        for (int i = 0; i < 10; i++) {
            int ind = random.nextInt(countryList.size());
            String randomCountry = countryList.get(ind);
            System.out.println("¿What is the capital of " + randomCountry + "?");
            String userAnswer = sc.nextLine().trim();

            String correctCapital = countriesMap.get(randomCountry);
            if (userAnswer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect :(. The capital is: " + correctCapital);
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("classificacio.txt", true))) {

            bw.write(userName + ": " + score + " points");
            bw.newLine();
            System.out.println("Your score has been saved successfully!");
        } catch (IOException error) {
            System.out.println("Error writing file.");
        }
        System.out.println("Game finished. " + userName + " Your score is: " + score);
        sc.close();
    }
}
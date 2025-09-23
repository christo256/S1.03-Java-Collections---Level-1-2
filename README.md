📘 Sprint 0 - Java Collections & File I/O - Level 1 & Level 2
📄 Description

This repository contains Java exercises focused on collections (ArrayList, HashSet, HashMap), file input/output operations, and basic object-oriented programming. The solutions follow the best practices described in Sprint 0, and all code is written in English using Eclipse or IntelliJ IDEA.

🧩 Level 1 - Exercises
Exercise 1 — Months Collection

Created a Month class with a name attribute and overridden equals(), hashCode(), and toString().

Initialized an ArrayList with 11 months (excluding August), then inserted August in the correct position to keep the list ordered.

Converted the ArrayList to a HashSet to demonstrate elimination of duplicates.

Traversed the collection both with a for loop and an Iterator.

Exercise 2 — Reverse List

Created a List<Integer> with several numbers in ascending order.

Created a second list where elements from the first are inserted in reverse order using a ListIterator.

Exercise 3 — Capitals Quiz Game

Read countries.txt file storing country-capital pairs in a HashMap<String, String>.

Implemented a console quiz game that asks the user for their name and then quizzes them on 10 random countries, asking for their capitals.

The user's score is tracked and saved in a classificacio.txt file at the end of the game.

🧩 Level 2 - Exercises
Exercise 1 — Unique Restaurants in a HashSet

Created a Restaurant class with name and score attributes.

Overrode equals() and hashCode() so that a HashSet prevents adding duplicates with the same name and score but allows the same name with different scores.

Exercise 2 — Sorting Restaurants

Implemented Comparable<Restaurant> to sort restaurants by name alphabetically, and if names are equal, by score in descending order.

Demonstrated sorting by converting the HashSet to a List and using Collections.sort().

💻 Technologies Used

Java 17+

Eclipse or IntelliJ IDEA

Git & GitHub

📋 Requirements

Java JDK 17 or later

IDE: Eclipse or IntelliJ IDEA

Git properly configured

Follow Sprint 0 best practices for code and repository structure

🛠️ Installation & Usage

Clone this repository:

git clone https://github.com/yourusername/your-repo.git


Import the projects in your preferred IDE. Run each Main class under the corresponding package to execute the exercises.

For the quiz game (Level 1, Exercise 3), ensure the countries.txt file is located in the working directory.

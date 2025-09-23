## 📘 Sprint 0 - Java Collections & File I/O - Level 1 & Level 2

## 📄 Description

This repository contains the exercises for **Level 1** and **Level 2** focusing on Java collections (`ArrayList`, `HashSet`, `HashMap`), file input/output, and basic object-oriented programming. The projects follow the best practices defined in Sprint 0, and all code is written in English using IntelliJ IDEA.

---

### 🧩 Level 1 - Exercises

#### Exercise 1 - Month Collection Management

- Create a class named `Month` with an attribute `name`.  
- Initialize an `ArrayList<Month>` with 11 months (excluding August).  
- Insert "August" at the correct index to maintain order.  
- Convert the `ArrayList` to a `HashSet<Month>` to ensure no duplicates are allowed.  
- Traverse the collections using both a **for loop** and an **Iterator**.

#### Exercise 2 - Reverse List Using ListIterator

- Create a `List<Integer>` and populate it with numbers.  
- Create a second `List<Integer>` and insert elements from the first list in reverse order using a `ListIterator`.

#### Exercise 3 - Capitals Quiz Game

- Read the file `countries.txt`, which contains country-capital pairs, into a `HashMap<String, String>`.  
- Ask the user for their name.  
- Randomly select 10 countries and prompt the user to enter the capital city for each.  
- Track and count the correct answers.  
- Save the user’s name and score into a file called `classificacio.txt`.

---

### 🧩 Level 2 - Exercises

#### Exercise 1 - Restaurant Class and HashSet Uniqueness

- Create a `Restaurant` class with attributes `name` (String) and `score` (int).  
- Override `equals()` and `hashCode()` so that the `HashSet<Restaurant>` prevents adding duplicate restaurants with the **same name and score** but allows same names with different scores.

#### Exercise 2 - Sorting Restaurants

- Implement `Comparable<Restaurant>` to sort `Restaurant` objects first by `name` (alphabetically), then by `score` in **descending order**.  
- Demonstrate sorting by converting the `HashSet` to a `List` and sorting it with `Collections.sort()`.

---

## 💻 Technologies Used

- Java 17 or higher  
- Eclipse or IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requirements

- Java JDK 17 or later  
- IDE (Eclipse or IntelliJ IDEA)  
- Git properly configured  
- Follow Sprint 0 coding and repository best practices  

--- 

## 🛠️ Installation & Usage

1. Clone the repository:  
   ```bash
   git clone https://github.com/christo256/S1.03-Java-Collections---Level-1-2.git

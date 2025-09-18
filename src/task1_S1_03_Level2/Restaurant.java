package task1_S1_03_Level2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

    private final String name;
    private final int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Restaurant)) return false;

        Restaurant other = (Restaurant) obj;
        return this.score == other.score &&
                Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + score;
    }

    @Override
    public String toString() {
        return name + " (" + score + ")";
    }

    @Override
    public int compareTo(Restaurant other) {
        int nameCompare = name.compareTo(other.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(other.score, this.score);
    }
}


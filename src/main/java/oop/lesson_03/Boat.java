package oop.lesson_03;

/*
 * Класс "Катер"
 */
public class Boat extends Swimmer {

    public Boat(String name, int numOfPaddles) {
        super("катер", true, numOfPaddles, name);
    }

    public Boat(String name) {
        this(name, 2);
    }

    public Boat(int numOfPaddles) {
        this("", numOfPaddles);
    }

    public Boat() {
        this("", 2);
    }
}

package oop.lesson_03;

/*
 * Класс "Велосипед"
 */
public class Bike extends Runner {

    public Bike(String name, int numOfWheels) {
        super("велосипед", false, numOfWheels, name);
    }

    public Bike(String name) {
        this(name, 2);
    }

    public Bike(int numOfWheels) {
        this("", numOfWheels);
    }

    public Bike() {
        this("", 2);
    }
}

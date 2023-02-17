package oop.lesson_03;

/*
 * Класс "Ялик"
 */
public class Rowboat extends Swimmer {

    public Rowboat(String name, int numOfPaddles) {
        super("вёсельный ялик", false, numOfPaddles, name);
    }

    public Rowboat(String name) {
        this(name, 2);
    }

    public Rowboat(int numOfPaddles) {
        this("", numOfPaddles);
    }

    public Rowboat() {
        this("", 2);
    }
}

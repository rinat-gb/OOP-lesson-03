package oop.lesson_03;

/*
 * Класс "Воздушный шар"
 */
public class Balloon extends Flyer {

    public Balloon(String name) {
        super("воздушный шар", false, 0, name);
    }

    public Balloon() {
        this("");
    }
}

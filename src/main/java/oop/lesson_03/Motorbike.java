package oop.lesson_03;

/*
 * Класс "Мотоцикл"
 */
public class Motorbike extends Runner {

    public Motorbike(String name) {
        super("мотоцикл", true, 2, name);
    }

    public Motorbike() {
        this("");
    }
}

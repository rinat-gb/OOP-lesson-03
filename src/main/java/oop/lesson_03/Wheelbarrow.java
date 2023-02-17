package oop.lesson_03;

/*
 * Класс "Садовый прицеп" ("Садовая тачка")
 */

public class Wheelbarrow extends Runner {

    public Wheelbarrow(String name) {
        super("садовый прицеп", false, 1, name);
    }

    public Wheelbarrow() {
        this("");
    }
}

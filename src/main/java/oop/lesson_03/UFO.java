package oop.lesson_03;

/*
 * Супер-пупер транспортное средство "НЛО"
 * 
 * Способен и летать, и ездить, и плавать
 */
public class UFO extends Vehicle implements Flyable, Runable, Swimmable {

    public UFO(String name) {
        super("НЛО", true, name);
    }

    @Override
    public String fly() {
        return "отлично летать";
    }

    @Override
    public String run() {
        return "быстро ездить";
    }

    @Override
    public String swim() {
        return "восхитительно плавать";
    }

    @Override
    public String move() {
        return fly() + ", " + run() + " и " + swim();
    }
}

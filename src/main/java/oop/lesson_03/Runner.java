package oop.lesson_03;

/*
 * Общий класс для объектов, способных ездить
 */
public class Runner extends Vehicle implements Runable {
    private int numOfWheels;

    public Runner(String whoAmI, boolean hasEngine, int numOfWheels, String name) {
        super(whoAmI, hasEngine, name);
        this.numOfWheels = numOfWheels;
    }

    @Override
    public String run() {
        return "ездить";
    }

    @Override
    public String move() {
        return run();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", ");

        if (this.numOfWheels > 1) {
            sb.append(this.numOfWheels);
        }

        switch (this.numOfWheels) {
            case 0:
                sb.append("колёс нет");
                break;
            case 1:
                sb.append("одно колесо");
                break;
            case 2:
            case 3:
            case 4:
                sb.append(" колеса");
                break;
            default:
                sb.append(" колёс");
        }
        return sb.toString();
    }
}

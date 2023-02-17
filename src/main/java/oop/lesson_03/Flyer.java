package oop.lesson_03;

/*
 * Общий класс для объектов, способных летать
 */
public class Flyer extends Vehicle implements Flyable {
    private int numOfWings;

    public Flyer(String whoAmI, boolean hasEngine, int numOfWings, String name) {
        super(whoAmI, hasEngine, name);
        this.numOfWings = numOfWings;
    }

    @Override
    public String fly() {
        return "летать";
    }

    @Override
    public String move() {
        return fly();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", ");

        if (this.numOfWings > 1) {
            sb.append(this.numOfWings);
        }

        switch (this.numOfWings) {
            case 0:
                sb.append("крыльев нет");
                break;
            case 1:
                sb.append("одно крыло");
                break;
            case 2:
            case 3:
            case 4:
                sb.append(" крыла");
                break;
            default:
                sb.append(" крыльев");
        }
        return sb.toString();
    }
}

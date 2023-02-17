package oop.lesson_03;

/*
 * Общий класс для объектов, способных плавать
 */
public class Swimmer extends Vehicle implements Swimmable {
    private int numOfPaddles;

    public Swimmer(String whoAmI, boolean hasEngine, int numOfPaddles, String name) {
        super(whoAmI, hasEngine, name);
        this.numOfPaddles = numOfPaddles;
    }

    @Override
    public String swim() {
        return "плавать";
    }

    @Override
    public String move() {
        return swim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", ");

        if (this.numOfPaddles > 1) {
            sb.append(this.numOfPaddles);
        }

        switch (this.numOfPaddles) {
            case 0:
                sb.append("вёсел нет");
                break;
            case 1:
                sb.append("одно весло");
                break;
            case 2:
            case 3:
            case 4:
                sb.append(" весла");
                break;
            default:
                sb.append(" вёсел");
        }
        return sb.toString();
    }
}

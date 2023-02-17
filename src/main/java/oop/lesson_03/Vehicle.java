package oop.lesson_03;

/*
 * Общий абстрактный класс для всех транспортных средств
 * 
 * Реализует интерфейс Comparable для сравнения экземпляров класса между собой
 */
public abstract class Vehicle implements Comparable<Vehicle> {
    // класс транспортного средства
    private String whoAmI;
    // есть ли двигатель
    private boolean hasEngine;
    // имя (название) транспортного средства
    private String name;

    /**
     * Конструктор транспортного средства
     * 
     * @param whoAmI класс транспортного средства, String
     * @param hasEngine есть ли двигатель, boolean
     * @param name имя (название) транспортного средства, String
     */
    public Vehicle(String whoAmI, boolean hasEngine, String name) {
        this.whoAmI = whoAmI;
        this.hasEngine = hasEngine;
        this.name = name;
    }

    /**
     * Метод должен быть переопределён во всех производных классах
     * 
     * @return как данный класс способен перемещаться, String
     */
    public abstract String move();

    /**
     * Переопределённый метод из класса Comparable
     * 
     * @param vehicle экземпляр класса с которым сранивать текущий
     * @return -1 если текущий меньше
     *          0 если текущий равен сравниваемому экземпляру класса
     *          1 если текущий больше
     */
    @Override
    public int compareTo(Vehicle vehicle) {
        // текущий экземпляр класса летающий?
        if (this instanceof Flyable) {
            // летающий всегда больше (выше) ездящего или плавающего
            if (vehicle instanceof Runable || vehicle instanceof Swimmable) {
                return 1;
            }
            // летающий равен другому летающему
            else if (vehicle instanceof Flyable) {
                return 0;
            }
            // во всех остальных случаях текущий экземпляр класса меньше
            else {
                return -1;
            }
        }
        // текущий экземпляр класса ездящий?
        else if (this instanceof Runable) {
            // если другой экземпляр класса летающий, то наш меньше (ниже)
            if (vehicle instanceof Flyable) {
                return -1;
            }
            // если другой ездит, то они  равны
            else if (vehicle instanceof Runable) {
                return 0;
            }
            // в противном случае наш больше (выше)
            else {
                return 1;
            }
        }
        // текущий экземпляр класса плавающий?
        else if (this instanceof Swimmable) {
            // если другой экземпляр класса летающий или ездящий, то наш меньше (ниже)
            if (vehicle instanceof Flyable || vehicle instanceof Runable) {
                return -1;
            }
            // если другой экземпляр класса плавающий, то он равен текущему
            if (vehicle instanceof Swimmable){
                return 0;
            }
            // в противном случае наш больше (выше)
            else {
                return 1;
            }
        }
        return -1;
    }

    /**
     * Переопределённый метод для вывода данного экземпляра класса в читаемом виде
     *
     * @return читаемая строка, представляющая данный экземпляр класса
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (this.name == "") {
            sb.append("безымянный ");
            sb.append(this.whoAmI);
        } else {
            sb.append(this.whoAmI);
            sb.append(" по имени \"");
            sb.append(this.name);
            sb.append('"');
        }

        if (this.hasEngine) {
            sb.append(" с двигателем");
        } else {
            sb.append(" без двигателя");
        }
        return sb.toString();
    }
}

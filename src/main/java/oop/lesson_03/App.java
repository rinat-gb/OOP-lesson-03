/*
 * Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
 *
 * Создать иерархию родительский и дочернии классы для Транспорта
 * Например Транспорт - > Автомобиль - > Автобус
 * Транспорт - > Автомобиль - > Легковой
 * Используем наследование, инкапсуляцию
 */
package oop.lesson_03;

public final class App {
    public static void main(String[] args) {
        // создаём и заполняем массив транспортных средств
        VehicleList vehicleList = new VehicleList();

        // просто тачка
        vehicleList.addVehicle(new Wheelbarrow());
        // детский безымянный трёхколёсный велосипед
        vehicleList.addVehicle(new Bike(3));
        // велосипед "STELS"
        vehicleList.addVehicle(new Bike("STELS"));
        // плот
        vehicleList.addVehicle(new Raft());
        // безымянный воздушный шар
        vehicleList.addVehicle(new Balloon());
        // воздушный шар-метеозонд
        vehicleList.addVehicle(new Balloon("метеозонд"));
        // катер "Ракета" с 16 вёслами на всякий случай
        vehicleList.addVehicle(new Boat("Ракета", 16));
        // летающая тарелка
        vehicleList.addVehicle(new UFO("UnKnOwN"));
        // безымянный мотоцикл
        vehicleList.addVehicle(new Motorbike());
        // мотоцикл Honda
        vehicleList.addVehicle(new Motorbike("Honda"));
        // вёсельная лодка
        vehicleList.addVehicle(new Rowboat());


        System.out.println("*** Состояние массива транспортных средств до сортировки:\n");
        System.out.println(vehicleList);

        /*
         * Сортируем массив транспортных средств
         * 
         * Критерий сортировки объявлен в файле Vehicle.java как имплементация
         * метода compareTo класса Comparable<>
         */
        System.out.println("*** Состояние массива транспортных средств после сортировки:\n");
        System.out.println(vehicleList);
    }
}

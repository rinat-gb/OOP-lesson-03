package oop.lesson_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Класс для хранения списка транспортных средств
 * 
 * Реализует интерфейс Iterable для возможности использования в циклах fpreach
 */
public class VehicleList implements Iterable<Vehicle> {
    private List<Vehicle> vehicles;

    public VehicleList() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void sort() {
        Collections.sort(vehicles);
    }

    @Override
    public Iterator<Vehicle> iterator() {
        Iterator<Vehicle> it = new Iterator<Vehicle>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < vehicles.size();
            }

            @Override
            public Vehicle next() {
                return vehicles.get(index++);
            }
        };
        return it;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Vehicle vehicle : this.vehicles) {
            sb.append(vehicle);
            sb.append('\n');
            sb.append("способен: ");
            sb.append(vehicle.move());
            sb.append('\n');
            sb.append('\n');
        }
        return sb.toString();
    }
}

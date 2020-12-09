package by.tc.factory;

import by.tc.factory.ElectricalEquipment;
import by.tc.factory.Factory;

public class FactoryOven implements Factory {
    int POWER_CONSUMPTION;
    int WEIGHT;
    int CAPACITY;
    int DEPTH;
    double HEIGHT;
    double WIDTH;

    public FactoryOven(int POWER_CONSUMPTION, int WEIGHT, int CAPACITY, int DEPTH, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.CAPACITY = CAPACITY;
        this.DEPTH = DEPTH;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    @Override
    public ElectricalEquipment createProduct() {
        System.out.println("Creating oven");
        ElectricalEquipment oven = new Oven(POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH);
        return oven;
    }
}

package by.tc.factory;

import by.tc.factory.ElectricalEquipment;
import by.tc.factory.Factory;

public class FactoryRefrigerator implements Factory {
    Integer POWER_CONSUMPTION;
    Integer WEIGHT;
    Integer FREEZER_CAPACITY;
    Integer OVERALL_CAPACITY;
    Integer HEIGHT;
    Integer WIDTH;

    public FactoryRefrigerator(Integer POWER_CONSUMPTION, Integer WEIGHT, Integer FREEZER_CAPACITY, Integer OVERALL_CAPACITY, Integer HEIGHT, Integer WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    @Override
    public ElectricalEquipment createProduct() {
        System.out.println("Creating refrigerator");
        ElectricalEquipment refrigerator = new Refrigerator(POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH);
        return refrigerator;
    }
}

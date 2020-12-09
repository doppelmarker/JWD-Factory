package by.tc.factory;

import by.tc.factory.ElectricalEquipment;
import by.tc.factory.Factory;

public class FactoryLaptop implements Factory {
    int BATTERY_CAPACITY;
    String OS;
    int MEMORY_ROM;
    int SYSTEM_MEMORY;
    double CPU;
    int DISPLAY_INCHS;

    public FactoryLaptop(int BATTERY_CAPACITY, String OS, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, int DISPLAY_INCHS) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }


    @Override
    public ElectricalEquipment createProduct() {
        System.out.println("Creating laptop");
        ElectricalEquipment laptop = new Laptop(BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS );
        return laptop;
    }
}

package by.tc.factory;

import by.tc.factory.ElectricalEquipment;
import by.tc.factory.Factory;

public class FactoryTabletPC implements Factory {
    int BATTERY_CAPACITY;
    int DISPLAY_INCHES;
    int MEMORY_ROM;
    int FLASH_MEMORY_CAPACITY;
    String COLOR;

    public FactoryTabletPC(int BATTERY_CAPACITY, int DISPLAY_INCHES, int MEMORY_ROM, int FLASH_MEMORY_CAPACITY, String COLOR) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
        this.MEMORY_ROM = MEMORY_ROM;
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
        this.COLOR = COLOR;
    }

    @Override
    public ElectricalEquipment createProduct() {
        System.out.println("Creating tabletPC");
        ElectricalEquipment tabletPC = new TabletPC( BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR);
        return tabletPC;
    }
}

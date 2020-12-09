package by.tc.factory;

import by.tc.factory.ElectricalEquipment;

public class TabletPC implements ElectricalEquipment {
    int BATTERY_CAPACITY;
    int DISPLAY_INCHES;
    int MEMORY_ROM;
    int FLASH_MEMORY_CAPACITY;
    String COLOR;


    public TabletPC(int BATTERY_CAPACITY,int DISPLAY_INCHES, int MEMORY_ROM, int FLASH_MEMORY_CAPACITY, String COLOR) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
        this.MEMORY_ROM = MEMORY_ROM;
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
        this.COLOR = COLOR;
    }

    public int getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public void setBATTERY_CAPACITY(int BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public int getDISPLAY_INCHES() {
        return DISPLAY_INCHES;
    }

    public void setDISPLAY_INCHES(int DISPLAY_INCHES) {
        this.DISPLAY_INCHES = DISPLAY_INCHES;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public void setMEMORY_ROM(int MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public int getFLASH_MEMORY_CAPACITY() {
        return FLASH_MEMORY_CAPACITY;
    }

    public void setFLASH_MEMORY_CAPACITY(int FLASH_MEMORY_CAPACITY) {
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    @Override
    public String toString() {
        return "TabletPC : " +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", DISPLAY_INCHES=" + DISPLAY_INCHES +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", FLASH_MEMORY_CAPACITY=" + FLASH_MEMORY_CAPACITY +
                ", COLOR='" + COLOR;
    }

    @Override
    public void info() {
        System.out.println("TabletPC ready");
    }
}


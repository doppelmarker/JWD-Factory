package by.tc.factory;

import by.tc.factory.ElectricalEquipment;

public class Laptop implements ElectricalEquipment {
    int BATTERY_CAPACITY;
    String OS;
    int MEMORY_ROM;
    int SYSTEM_MEMORY;
    double CPU;
    int DISPLAY_INCHS;


    public Laptop(int BATTERY_CAPACITY, String OS, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, int DISPLAY_INCHS) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    public int getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public void setBATTERY_CAPACITY(int BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public void setMEMORY_ROM(int MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public int getSYSTEM_MEMORY() {
        return SYSTEM_MEMORY;
    }

    public void setSYSTEM_MEMORY(int SYSTEM_MEMORY) {
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public int getDISPLAY_INCHS() {
        return DISPLAY_INCHS;
    }

    public void setDISPLAY_INCHS(int DISPLAY_INCHS) {
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    @Override
    public String toString() {
        return "Laptop : " +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY=" + SYSTEM_MEMORY +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS;
    }

    @Override
    public void info() {
        System.out.println("Laptop ready");
    }
}

package by.tc.factory;

public class Refrigerator implements ElectricalEquipment {
    int POWER_CONSUMPTION;
    int WEIGHT;
    int FREEZER_CAPACITY;
    int OVERALL_CAPACITY;
    int HEIGHT;
    int WIDTH;


    public Refrigerator(int POWER_CONSUMPTION, int WEIGHT, int FREEZER_CAPACITY, int OVERALL_CAPACITY, int HEIGHT, int WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(int WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public int getFREEZER_CAPACITY() {
        return FREEZER_CAPACITY;
    }

    public void setFREEZER_CAPACITY(int FREEZER_CAPACITY) {
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
    }

    public int getOVERALL_CAPACITY() {
        return OVERALL_CAPACITY;
    }

    public void setOVERALL_CAPACITY(int OVERALL_CAPACITY) {
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    @Override
    public String toString() {
        return "Refrigerator : " +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH;
    }

    @Override
    public void info() {
        System.out.println("Refrigerator ready");
    }
}


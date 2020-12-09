package by.tc.factory;

public class Speakers implements ElectricalEquipment {
    int POWER_CONSUMPTION;
    int NUMBER_OF_SPEAKERS;
    String FREQUENCY_RANGE;
    int CORD_LENGTH;


    public Speakers(int POWER_CONSUMPTION, int NUMBER_OF_SPEAKERS, String FREQUENCY_RANGE, int CORD_LENGTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
        this.CORD_LENGTH = CORD_LENGTH;
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public int getNUMBER_OF_SPEAKERS() {
        return NUMBER_OF_SPEAKERS;
    }

    public void setNUMBER_OF_SPEAKERS(int NUMBER_OF_SPEAKERS) {
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
    }

    public String getFREQUENCY_RANGE() {
        return FREQUENCY_RANGE;
    }

    public void setFREQUENCY_RANGE(String FREQUENCY_RANGE) {
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
    }

    public int getCORD_LENGTH() {
        return CORD_LENGTH;
    }

    public void setCORD_LENGTH(int CORD_LENGTH) {
        this.CORD_LENGTH = CORD_LENGTH;
    }

    @Override
    public String toString() {
        return "Speakers : " +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", NUMBER_OF_SPEAKERS=" + NUMBER_OF_SPEAKERS +
                ", FREQUENCY_RANGE='" + FREQUENCY_RANGE + '\'' +
                ", CORD_LENGTH=" + CORD_LENGTH;
    }

    @Override
    public void info() {
        System.out.println("Speakers ready");
    }
}


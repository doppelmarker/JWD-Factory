package by.tc.factory;

import by.tc.factory.ElectricalEquipment;
import by.tc.factory.Factory;

public class FactorySpeakers implements Factory {
   int POWER_CONSUMPTION;
    int  NUMBER_OF_SPEAKERS;
    String FREQUENCY_RANGE;
    int  CORD_LENGTH;

    public FactorySpeakers(int  POWER_CONSUMPTION, int  NUMBER_OF_SPEAKERS, String FREQUENCY_RANGE, int  CORD_LENGTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
        this.CORD_LENGTH = CORD_LENGTH;
    }

    @Override
    public ElectricalEquipment createProduct() {
        System.out.println("Creating speakers");
        ElectricalEquipment speakers = new Speakers(POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH);
        return speakers;
    }
}

package by.tc.factory;

import by.tc.factory.ElectricalEquipment;
import by.tc.factory.Factory;

public class FactoryVacuumCleaner implements Factory {
    int POWER_CONSUMPTION;
    String FILTER_TYPE;
    String BAG_TYPE;
    String WAND_TYPE;
    int MOTOR_SPEED_REGULATION;
    int CLEANING_WIDTH;

    public FactoryVacuumCleaner(int POWER_CONSUMPTION, String FILTER_TYPE, String BAG_TYPE, String WAND_TYPE, int MOTOR_SPEED_REGULATION, int CLEANING_WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.FILTER_TYPE = FILTER_TYPE;
        this.BAG_TYPE = BAG_TYPE;
        this.WAND_TYPE = WAND_TYPE;
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
        this.CLEANING_WIDTH = CLEANING_WIDTH;
    }

    @Override
    public ElectricalEquipment createProduct() {
        System.out.println("Creating vacuumCleaner");
        ElectricalEquipment vacuumCleaner = new VacuumCleaner(POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH);
        return vacuumCleaner;
    }
}

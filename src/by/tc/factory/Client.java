package by.tc.factory;

public class Client {
    private Factory factory;
    private ElectricalEquipment electricalEquipment;

    public void setFactory(Factory factory1) {
        factory = factory1;
    }

    public ElectricalEquipment action() {
        electricalEquipment = factory.createProduct();
        //electricalEquipment.info();
        return electricalEquipment;
    }

}

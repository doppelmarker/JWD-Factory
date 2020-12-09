package by.tc.factory;

import by.tc.factory.Client;
import by.tc.factory.FactoryLaptop;
import by.tc.factory.FactoryOven;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        client.setFactory(new FactoryLaptop(1, "Linux", 8000, 1000, 2.2, 19));
        System.out.println(client.action());

        client.setFactory(new FactoryOven(1000, 10, 32, 60, 45.5, 59.5));
        System.out.println(client.action());


    }
}

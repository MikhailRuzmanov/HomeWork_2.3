package ru.skypro.HomeWork_2_3;

public class Truck extends WheeledVehicles{

    public Truck(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

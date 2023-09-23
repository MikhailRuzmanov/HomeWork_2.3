package ru.skypro.HomeWork_2_3;

public class Bicycle extends WheeledVehicles {

    public Bicycle(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}


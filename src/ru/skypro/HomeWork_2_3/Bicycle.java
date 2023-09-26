package ru.skypro.HomeWork_2_3;

public class Bicycle extends WheeledVehicles {
    public void service(){
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }


    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}


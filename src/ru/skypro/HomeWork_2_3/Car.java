package ru.skypro.HomeWork_2_3;

public class Car extends  WheeledVehicles {

    public void service(){

        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();


    }

    public Car(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
    }
}
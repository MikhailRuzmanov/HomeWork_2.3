package ru.skypro.HomeWork_2_3;

public class Truck extends WheeledVehicles{
    public void service(){
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();


    }

    public Truck(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

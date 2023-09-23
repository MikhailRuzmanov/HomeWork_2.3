package ru.skypro.HomeWork_2_3;

public class WheeledVehicles {
    private String modelName;

    private int wheelsCount;


    public WheeledVehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

}

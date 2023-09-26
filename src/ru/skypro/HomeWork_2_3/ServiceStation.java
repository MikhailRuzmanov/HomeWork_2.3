package ru.skypro.HomeWork_2_3;

public class ServiceStation implements ServiceInterface {


    @Override
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("");
            System.out.println("***************************");
            System.out.println("Обслуживаем " + bicycle.getModelName());
            System.out.println("***************************");
            bicycle.service();
        }
    }

    @Override
    public void check(Car car) {
        if (car != null) {
            System.out.println("");
            System.out.println("***************************");
            System.out.println("Обслуживаем " + car.getModelName());
            System.out.println("***************************");
            car.service();
        }
    }
    @Override
    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("");
            System.out.println("***************************");
            System.out.println("Обслуживаем " + truck.getModelName());
            System.out.println("***************************");
            truck.service();
        }
    }
}


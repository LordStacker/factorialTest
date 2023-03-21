package com.example.factorymethod2;

import be.Cars;
import bll.CarsFactory;

public class Main {
    public static void main(String[] args) {
        Cars car = CarsFactory.getCars("car","small","87324h","2008", "sedan", "2019","March","50dkk");
        Cars motorcycle = CarsFactory.getCars("Motorcycle","small","87324h","2008", "DN", "2019","March","30000DKK");
        Cars truck = CarsFactory.getCars("Truck","small","87324h","2008", "YUYU", "2019","March","70dkk");
        System.out.println("Car::"+car);
        System.out.println("Motorcycle::"+motorcycle);
        System.out.println("Truck::"+ truck);

    }
}
package bll;

import be.Car;
import be.Cars;
import be.Motorcycle;
import be.Truck;

public class CarsFactory {

    public static Cars getCars(String type,String size, String plate, String make, String model, String year, String month, String price){

        if("car".equalsIgnoreCase(type)) return new Car(size, plate, make, model, year, month, price);
        if("motorcycle".equalsIgnoreCase(type)) return new Motorcycle(size,plate,make,model,year,month,price);
        if("truck".equalsIgnoreCase(type)) return new Truck(size, plate, make,model,year,month,price);
        return null;
    }
}

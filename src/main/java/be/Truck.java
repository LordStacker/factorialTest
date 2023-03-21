package be;

public class Truck extends Cars {
    private String size;
    private String plate;
    private String make;
    private String model;
    private String year;
    private String month;
    private String price;

    public Truck(String size, String plate, String make, String model, String year, String month, String price){
        this.size = size;
        this.plate = plate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.month = month;
        this.price = price;

    }


    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String getPlate() {
        return plate;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public String getMonth() {
        return month;
    }

    @Override
    public String getPrice() {
        return price;
    }
}

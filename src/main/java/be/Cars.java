package be;

public abstract class Cars {
    public abstract String getSize();
    public abstract String getPlate();
    public abstract String getMake();
    public abstract String getModel();
    public abstract String getYear();
    public abstract String getMonth();
    public abstract String getPrice();

    @Override
    public String toString()
    {
        return "Size= "+this.getSize()+"Plate= "+this.getPlate()+", Make= "+this.getMake() + ", Model= "+this.getModel()+", Year and Month= "+this.getYear() +" "+ this.getMonth()+ ", Price= "+this.getPrice();
    }
}

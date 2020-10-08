package Task1;

public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private String driver;


    public Car(String tempMake, String tempModel, int tempYear, String tempBodyStyle){
        this.make = tempMake;
        this.model = tempModel;
        this.year = tempYear;
        this.bodyStyle = tempBodyStyle;

    }

    public String getDriver(Driver migSelv) {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car " +
                "make '" + make + '\'' +
                ", model '" + model + '\'' +
                ", year " + year +
                ", bodyStyle '" + bodyStyle + '\'';
    }
}

package Task1;

public class Task1Main {
    public static void main(String[] args){
        Driver migSelv = new Driver("Mikkel",21);
        Car newCar1 = new Car("Mazda", "3", 2019, "Sedan");
        System.out.println(newCar1.toString()+" "+migSelv.toString());
        Car newCar2 = new Car("Ford", "Kuga", 2016, "SUV");
        System.out.println(newCar2.toString()+" "+migSelv.toString());




    }




}


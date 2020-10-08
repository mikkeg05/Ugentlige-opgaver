package Task3;

public class Animal implements animalSound {

    private int numberOfLegs;


    public Animal(int tempNumberOfLegs){
        this.numberOfLegs = tempNumberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void makeSound() {
        System.out.println("Undefined animal makes no sound.");
    }
}

package Task3;

public class Task3Main {
    public static void main(String[] args){
        Zoo myZoo = new Zoo();

        Fish myFish = new Fish(0);
        Centipede myCentipede = new Centipede(1000);
        Snail mySnail = new Snail(0);


        myZoo.addAnimal(myFish);
        myZoo.addAnimal(myCentipede);
        myZoo.addAnimal(mySnail);

        myZoo.printNumberOfLegs();
        myZoo.makeAllSounds();


    }
}

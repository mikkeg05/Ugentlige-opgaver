import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bog bog1 = new Bog(1242,1988, "lars og ulven");
        Bog bog2 = new Bog(1242,1988, "lars og ulven");
        Bog bog3 = new Bog(1248,1988, "lars og ulven");
        Bog bog4 = new Bog(1241,1988, "lars og ulven");

        List<Bog> bøger = new ArrayList<Bog>();
        bøger.add(bog1);
        bøger.add(bog2);
        bøger.add(bog3);
        bøger.add(bog4);
        bøger.sort(bog1.compareByISBN);



        System.out.println("bog1 ISBN = "+bog1.ISBNnummer);
        System.out.println("bog2 ISBN = "+bog2.ISBNnummer);
        System.out.println("bog3 ISBN = "+bog3.ISBNnummer);
        System.out.println("bog4 ISBN = "+bog4.ISBNnummer);
        System.out.println(bog1.equals(bog2));
        System.out.println(bog2.equals(bog3));
        System.out.println(bog3.equals(bog4));

    }
}

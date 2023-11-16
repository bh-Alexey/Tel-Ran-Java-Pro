package execute;

import vehicles.Cabrio;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Cabrio firstCabriolet = new Cabrio(1, "Mercdes", "black", 0, false);
        Cabrio secondCabriolet = new Cabrio(2, "BMW", "blue", 0, false);
        Cabrio thirdCabriolet = new Cabrio(3, "AUDI", "red", 0, false);

        Cabrio cabriolet = new Cabrio(4, "byd", "white", 0, false);
        Cabrio cabriolet2 = new Cabrio(4, "byd", "white", 0, false);

        Set<Cabrio> myOwnCabriolets = new TreeSet<>();
        myOwnCabriolets.add(firstCabriolet);
        myOwnCabriolets.add(secondCabriolet);
        myOwnCabriolets.add(thirdCabriolet);
        myOwnCabriolets.add(cabriolet);
        myOwnCabriolets.add(cabriolet2);

        System.out.println(myOwnCabriolets);

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(10_000);
        numbers.add(500_000_000);
        numbers.add(0);

        System.out.println(numbers);

        String a = "Vera";
        String b = "Alex";

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));

        //TreeSet

    }
}

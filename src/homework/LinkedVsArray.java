package homework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedVsArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(1);
            linkedList.add(1);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            linkedList.add(500_000, 1);
        }

        long finish = System.currentTimeMillis();
        System.out.println(finish - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.add(500_000, 1);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}

package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Dima");
        arrayList1.add("Vasya");
        arrayList1.add("Alena");
        arrayList1.add("Katya");
        arrayList1.add("Vasya");
        System.out.println(arrayList1);

        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}

package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(200);
        arrayList1.add("Dima");
        arrayList1.add("Vasya");
        arrayList1.add("Alena");
        arrayList1.add("Katya");
        System.out.println(arrayList1);

        List<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList2.size());
    }
}

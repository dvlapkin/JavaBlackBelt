package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(200);
        arrayList1.add("Dima");
        arrayList1.add("Vasya");
        arrayList1.add("Alena");
        arrayList1.add("Katya");
        arrayList1.add("Vasya");
        System.out.println(arrayList1);

        for(String s:arrayList1){
            System.out.print(s+" ");
        }

        arrayList1.set(0,"ya");
        System.out.println();

        System.out.println(arrayList1.lastIndexOf("Vasya"));

        System.out.println(arrayList1.toString());
    }
}

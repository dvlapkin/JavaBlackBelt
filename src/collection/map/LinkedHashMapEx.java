package collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double,Student> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Dima","Lapkin",3);
        Student st2 = new Student("Katya","Lapkina",2);
        Student st3 = new Student("Seva","Sevin",1);
        Student st4 = new Student("Ivan","Ivanov",4);
        Student st5 = new Student("A","B",1);
        Student st6 = new Student("a","b",2);
        Student st7 = new Student("a","c",3);

        linkedHashMap.put(9.4,st1);
        linkedHashMap.put(5.0,st2);
        linkedHashMap.put(4.5,st3);
        linkedHashMap.put(3.9,st4);
        linkedHashMap.put(7.7,st5);
        linkedHashMap.put(2.3,st6);
        linkedHashMap.put(4.1,st7);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(9.4));
        System.out.println(linkedHashMap.get(7.7));
        System.out.println(linkedHashMap);
    }
}

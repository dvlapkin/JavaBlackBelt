package collection.map;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
      /*  TreeMap<Double,Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Dima","Lapkin",3);
        Student st2 = new Student("Katya","Lapkina",2);
        Student st3 = new Student("Seva","Sevin",1);
        Student st4 = new Student("Ivan","Ivanov",4);
        Student st5 = new Student("A","B",1);
        Student st6 = new Student("a","b",2);
        Student st7 = new Student("a","c",3);

        treeMap.put(9.4,st1);
        treeMap.put(5.0,st2);
        treeMap.put(4.5,st3);
        treeMap.put(3.9,st4);
        treeMap.put(7.7,st5);
        treeMap.put(2.3,st6);
        treeMap.put(4.1,st7);

        System.out.println(treeMap);*/
     //    System.out.println(treeMap.get(7.7));
     //    System.out.println(treeMap.remove(2.3));
     //   System.out.println(treeMap);
     //   System.out.println(treeMap.lastEntry());
        TreeMap<Student,Double> treeMap2 = new TreeMap<>();
        Student st1 = new Student("Dima","Lapkin",3);
        Student st2 = new Student("Katya","Lapkina",2);
        Student st3 = new Student("Seva","Sevin",2);
        Student st4 = new Student("Ivan","Ivanov",4);
        Student st5 = new Student("A","B",1);
        Student st6 = new Student("a","bb",3);
        Student st7 = new Student("aa","c",3);

        treeMap2.put(st1, 9.4);
        treeMap2.put(st2, 5.0);
        treeMap2.put(st3, 4.5);
        treeMap2.put(st4, 3.9);
        treeMap2.put(st5, 7.7);
        treeMap2.put(st6, 2.3);
        treeMap2.put(st7, 4.1);

        System.out.println(treeMap2);
    }

}


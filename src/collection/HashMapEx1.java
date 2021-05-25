package collection;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"abcd");
        map1.put(20,"bbb");
        map1.put(3,"c");
        map1.put(40,"d");
        map1.put(5,"eeee");
        map1.put(null,"a");
        map1.putIfAbsent(null,"eeee");
        System.out.println(map1);
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}

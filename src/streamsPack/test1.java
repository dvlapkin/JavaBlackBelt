package streamsPack;

import java.nio.charset.StandardCharsets;
import java.sql.Time;
import java.util.*;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");

        long startTime = System.currentTimeMillis();
        List<Integer> listInt=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            listInt.add(list.get(i).length());
        }
        long endTime = System.currentTimeMillis()-startTime;
        System.out.println("Total execution time: " + (endTime) + "ms");
        System.out.println(listInt);
        startTime = System.currentTimeMillis();
        List<Integer> list2= list.stream().map(element->element.length()).collect(Collectors.toList());
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");


        System.out.println(list2);

        int[] array= {5,9,3,8,1};
        int[] array2;
        System.out.println(Arrays.toString(array));
        array2 = Arrays.stream(array).map(element
                ->{if (element %3 ==0){
                element /=3;}
                return element;
        }).toArray();
        System.out.println(Arrays.toString(array2));


        Set<String > set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("ok");
        set.add("poka");
        set.add("no");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(e->e.length()).collect(Collectors.toSet());
        System.out.println(set2);

        System.out.println("\n=== filter ===");
        Set<String> setFiltered = set.stream().filter(e->e.length()>3).collect(Collectors.toSet());
        System.out.println(setFiltered);

        System.out.println("\n=== forEach ===");
        set.stream().forEach(e->{e.toUpperCase();System.out.println(e);});
        Arrays.stream(array).forEach(e->{e*=2;
            System.out.println(e);});

        System.out.println("\n=== reduce ===");
        int proizv = Arrays.stream(array).reduce((a,e)->a*e).getAsInt();
        OptionalInt o1 = Arrays.stream(array).reduce((a, e)->a*e);
        System.out.println(proizv);

        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);
        list5.add(5);
        List<Integer> list100 = new ArrayList<>();

        Optional<Integer> o= list100.stream().reduce((a,c)->a*c);
        Optional<Integer> o2= list5.stream().reduce((a,c)->a*c);
        if (o2.isPresent())
        System.out.println(o2.get());
        else System.out.println("no present");



    }
}

package streamsPack;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class groupBy {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));
/*

        Map<String, List<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany));

        for(Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey()) ;
            for(Phone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }
*/


        System.out.println("====");
/*
        Map<Boolean, List<Phone>> phonesByCompany2 = phoneStream.collect(
                Collectors.partitioningBy(p->p.getCompany()=="Apple"));

        for(Map.Entry<Boolean, List<Phone>> item : phonesByCompany2.entrySet()){

            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }
    */

          Map<String, Long> phonesBySum = phoneStream.collect(Collectors.groupingBy(Phone::getCompany,Collectors.summingLong(Phone::getPrice)));
          for (Map.Entry<String,Long> item : phonesBySum.entrySet()){
              System.out.println(item.getKey()+"-"+item.getValue());
          }
        System.out.println("====");

  Stream<Phone2> phoneStream3 = Stream.of(new Phone2("iPhone X", "Apple", new Price(600)),
                new Phone2("Pixel 2", "Google", new Price(500)),
                new Phone2("iPhone 8", "Apple",new Price(450)),
                new Phone2("Galaxy S9", "Samsung", new Price(500)),
                new Phone2("Galaxy S8", "Samsung", new Price(450)));

  //Map<Price,List<Phone2>> groupByT = phoneStream3.collect(Collectors.groupingBy(Phone2::getPrice)) ;
/*    Map<String, Optional<Phone2>> groupMax = phoneStream3.collect(
                            Collectors.groupingBy(Phone2::getCompany),
                            Collectors.minBy(Comparator.comparing(Phone2::getPrice)));

    for (Map.Entry<Price,List<Phone2>> item : groupByT.entrySet()){
        for (Map.Entry<String,Optional<Phone2>> item : groupMax.entrySet()){
      System.out.println(item.getKey()+"-"+item.getValue().);
     for(Phone2 phone2 : item.getValue()){
          System.out.println(phone2.getName());
      }
      System.out.println();

     */
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
            Optional<Integer> min = numbers.stream().min(Integer::compare);
            System.out.println(min.get());


    }
}
class Phone{

    private String name;
    private String company;
    private int price;

    public Phone(String name, String comp, int price){
        this.name=name;
        this.company=comp;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getCompany() { return company; }
}

class Phone2{

    private String name;
    private String company;
    private Price price;

    public Phone2(String name, String comp, Price price){
        this.name=name;
        this.company=comp;
        this.price = price;
    }

    public String getName() { return name; }
    public Price getPrice() { return price; }
    public int getsPrice() {return price.getRubles();}
    public String getCompany() { return company; }
}


class Price{
    private int dollars;
    private int rubles;

    public Price(int dollars) {
        this.dollars = dollars;
        this.rubles = dollars*100;
    }

    public int getDollars() {
        return dollars;
    }

    public int getRubles() {
        return rubles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return this.dollars==price.getDollars();
        //return dollars == price.dollars && rubles == price.rubles;
    }

    @Override
    public int hashCode() {
        return this.rubles;
        //return Objects.hash(dollars, rubles);
    }
}
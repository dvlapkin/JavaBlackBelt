package com.company;

import java.util.ArrayList;

public class Wildcard {
    public static void main(String[] args) {
        ArrayList<String> as1=new ArrayList<>();
        ArrayList<Double> al1=new ArrayList<>();
        al1.add(3.1);
        al1.add(3.2);
        al1.add(3.3);
      //  System.out.println(summ(as1));
    }

    public static double summ (ArrayList<? extends Number> al){
        double summ=0;
        for (Number n : al){
            summ+=n.doubleValue();
        }
        return summ;
    }
}

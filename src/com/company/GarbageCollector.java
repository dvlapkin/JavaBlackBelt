package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GarbageCollector {
    public static void main(String[] args) {
       method(); }

    private static void method(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        //List<Date> dateList = new ArrayList<>() ;
        for (int i=0; i< 10;i++){
            Temp temp=new Temp(i);
            temp =null;
          //  Date date =  new Date();
          //  date = null;
          //  dateList.add(date);
        }
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        System.gc();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("final");
        super.finalize();
    }
}

class Temp{
    private int i=0;

    public Temp(int i) {
        this.i = i;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("temp "+i+" final");
        super.finalize();
    }
}

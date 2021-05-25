package com.company;

import testPack.TestClass;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {

    public static void main(String[] args) {


/*

        Set s = new LinkedHashSet<City>();
       // Set s = new HashSet<City>();
        s.add(new City(1, 1));
        s.add(new City(1, 2));
        s.add(new City(2, 1));
        s.add(new City(1, 3));
        s.add(new City(1, 1));
        Iterator<City> iter = s.iterator();
        System.out.println("set size:"+s.size());
        while (iter.hasNext()) {
            City c = (City) iter.next();
            System.out.println(c.toStr());
        }


        Set s2 = new HashSet<Integer>();
        s2.add(new Integer(1));
        s2.add(new Integer(2));
        s2.add(new Integer(3));
        s2.add(new Integer(4));
        s2.add(new Integer(5));
        s2.add(new Integer(1));
        Iterator<Integer> iter2 = s2.iterator();
        System.out.println("set size:"+s2.size());
        while (iter2.hasNext()) {
            Integer c = (Integer) iter2.next();
            System.out.println(c);
        }
*/

        Comparator<User> cmprtr = new UserComporator();
        Set<User> set = new TreeSet<>(cmprtr);
        set.add(new User(30));
        set.add(new User(3));
        set.add(new User(40));
        set.add(new User(20));
        set.add(new User(10));
        for (User u : set){
            System.out.println("user id:" +u.id);
        }


	// write your code here
/*

        Account<String> acc1 = new Account<String>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);
        Account<Integer> acc2 = new Account<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
*/

   //

        TestClass tc = new TestClass();
        System.out.println(tc.pub);
        TestClass.method();

        Integer i = 128;
        Integer j = 128;
        if(i==j){
            System.out.println("equals!");
        }


    }

    static class User implements Comparable{
        int id;

        public User(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }


        @Override
        public int compareTo(Object o) {
            return id-((User)o).id;
        }

        public int getId() {
            return id;
        }
    }

    public static class UserComporator implements Comparator<User>{

        @Override
        public int compare(User o1, User o2) {
            return o2.id-o1.id;
        }
    }

    static class Account<T>{

        private T id;
        private int sum;

        Account(T id, int sum){
            this.id = id;
            this.sum = sum;
        }

        public T getId() { return id; }
        public int getSum() { return sum; }
        public void setSum(int sum) { this.sum = sum; }
    }
}

package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student,Double> map = new HashMap<>();
        Student st1 = new Student("Dima","Lapkin",3);
        Student st2 = new Student("Katya","Lapkina",2);
        Student st3 = new Student("Seva","Sevin",1);
        map.put(st1,4.1);
        map.put(st2,4.8);
        map.put(st3,5.0);
        System.out.println(map);
        System.out.println(map.containsKey(st1));
        System.out.println(map.containsKey(st1));

        Student st4 = new Student("Dima","Lapkin",3);
        Student st5 = new Student("Dima","Lapk",2);
        map.put(st4,3.0);
        map.put(st5,2.0);
       // System.out.println("equals="+st1.equals(st4));
       // boolean result = map.containsKey(st4);
       // System.out.println("contains="+result);
        map.forEach((k,v)->System.out.println(k+":"+v+" = "+k.hashCode()));

        //map.forEach(printHashCode();
        System.out.println(st4.hashCode());


        Map<Integer,String> m = new HashMap<>(16,0.75f);

    }

    public static <T,G> void printHashCode(T s){
        System.out.println("HashCode for "+ s+ " = "+s.hashCode());
    }
}


final class Student implements Comparable<Student>{
    final String name,surname;
    final Integer course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }
/*

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
       // return Objects.hash(name, surname, course);
        //return name.length()*7+surname.length()*11+course*49;
        return name.length()+surname.length()+course;
    }
*/

    @Override
    public int compareTo(Student o) {
        return this.course.compareTo(o.course);
    }
}


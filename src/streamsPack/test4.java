package streamsPack;

import collection.Student;

import java.util.ArrayList;
import java.util.List;

public class test4 {

    public static void main(String[] args) {
        Student student1 = new Student("kolya", 1,18,'m',4.5);
        Student student2 = new Student("nikolya", 5,23,'m',4.1);
        Student student3 = new Student("masha", 4,20,'f',4.7);
        Student student4 = new Student("vasha", 3,20,'m',3.5);
        Student student5 = new Student("nysha", 2,19,'f',5.0);
        Student student6 = new Student("kasha", 4,21,'f',3.9);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        studentList.stream().map( element -> {
            element.setName(element.getName().toUpperCase());
            return element;
        })
                .filter(element-> element.getSex()=='f')
                .sorted((x,y)->x.getAge()-y.getAge())
                .forEach(element-> System.out.println(element));

    }





}

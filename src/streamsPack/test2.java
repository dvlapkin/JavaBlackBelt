package streamsPack;

import collection.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class test2 {
    public static void main(String[] args) {
        System.out.println(" === Sorted ===");
        int [] array = {3,8,1,5,9,12,4,21,81,7,18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        Student student1 = new Student("kolya", 1);
        Student student2 = new Student("nikolya", 5);
        Student student3 = new Student("masha", 4);
        Student student4 = new Student("vasha", 3);
        Student student5 = new Student("nysha", 2);
        Student student6 = new Student("kasha", 4);

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

        List<Student> students = studentList.stream().sorted(
                (x,y)->x.getCourse()-y.getCourse()
        ).collect(Collectors.toList());
        System.out.println(studentList);
        System.out.println(students);


    }
}

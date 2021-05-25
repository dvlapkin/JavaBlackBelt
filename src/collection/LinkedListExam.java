package collection;

import java.util.LinkedList;

public class LinkedListExam {
    public static void main(String[] args) {
        Student student1 = new Student("kolya", 1);
        Student student2 = new Student("nikolya", 2);
        Student student3 = new Student("masha", 2);
        Student student4 = new Student("vasha", 3);
        Student student5 = new Student("nysha", 4);
        Student student6 = new Student("kasha", 4);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);
        studentLinkedList.add(student6);

    }
}

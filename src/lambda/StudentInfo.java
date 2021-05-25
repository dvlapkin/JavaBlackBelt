package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {

//    void testStudents(ArrayList<Student>al,StudentCheck sc){
//        for (Student s:al){
//            if(sc.check(s)){
//                System.out.println(s);
//            }
//        }
//    }
    void testStudents(ArrayList<Student>al, Predicate<Student> pr){
        for (Student s:al){
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }
    }

/*    void printStudentOverGrade(ArrayList<Student>al,double grade){
        for(Student s : al){
            if (s.avgGrade>grade){
                System.out.println(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student>al,int age){
        for(Student s : al){
            if (s.age<age){
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade,char sex){
        for(Student s : al){
            if (s.avgGrade<grade && s.age>age && s.sex==sex){
                System.out.println(s);
            }
        }
    }*/

class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        StudentInfo info = new StudentInfo();
        Predicate<Student> p1 = stud -> stud.sex == 'm';
        Predicate<Student> p2 = stud -> stud.avgGrade > 6.;
        //info.testStudents(students, s  ->{return s.age<23;});
        info.testStudents(students,p1.and(p2));

        
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course- o2.course;
//            }
//        });
        System.out.println(students);

//        Collections.sort(students,(s1,s2)-> s1.age-s2.age);

//
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("===============");
//        info.testStudents(students, new StudentCheck() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
//        System.out.println("===============");

//        info.testStudents(students,(Student s)->{return s.age<23;});

//        info.printStudentOverGrade(students,8);
//        System.out.println("----------------------");
//        info.printStudentsUnderAge(students,30);
//        System.out.println("----------------------");
//        info.printStudentsMixCondition(students,20,9.5,'f');
//
    }
}

interface StudentCheck{
    boolean check(Student s);
}

class CheckOverGrade implements StudentCheck{

    @Override
    public boolean check(Student s) {
        return s.avgGrade>8 ;
    }
}


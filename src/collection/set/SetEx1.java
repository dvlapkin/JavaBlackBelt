package collection.set;
import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student st1 = new Student("A","B",4);
        set.add(st1);
        Student st2 = new Student("C","D",1);
        set.add(st2);
        Student st3 = new Student("A1","B1",3);
        set.add(st3);
        Student st4 = new Student("A2","B2",3);
        set.add(st4);
        Student st5 = new Student("A2","B2",3);
        set.add(st5);

        System.out.println(set);
    }
}

final class Student{
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
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }
*/
    @Override
    public int hashCode() {
        return course;
    }

    }

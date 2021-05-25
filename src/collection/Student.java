package collection;

public class Student{
    String name;
    int course;
    int age;
    char sex;
    double avgGrade;

    public Student(String name, int course, int age, char sex, double avgGrade) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.sex = sex;
        this.avgGrade = avgGrade;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;

    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", age=" + age +
                ", sex=" + sex +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

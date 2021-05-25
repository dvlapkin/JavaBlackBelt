package generics;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("ivan",14);
        Schoolar schoolar2 = new Schoolar("ivan2",15);
        Schoolar schoolar3 = new Schoolar("ivan3",14);
        Schoolar schoolar4 = new Schoolar("ivan4",15);

        Student student1 = new Student("kolya", 19);
        Student student2 = new Student("nikolya", 20);

        Employee employee1 = new Employee("F",25);
        Employee employee2 = new Employee("Z",28);

        Team<Schoolar> schoolarTeam = new Team<>("shkolota");
        Team<Schoolar> schoolarTeam2 = new Team<>("shkololo");
        Team<Student> studentTeam = new Team<>("studen");
        Team<Employee> employeeTeam = new Team<>("rabu");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);

      //  Team<String> anotherTeam = new Team<>("sssss");
      //  anotherTeam.addNewParticipant("ddd");

    }
}

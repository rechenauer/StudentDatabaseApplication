package studentdatabaseapp;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many new users we want to add
        Student s = new Student();
        s.enroll();
        s.payTuition();
        System.out.println(s.showInfo());
        //Create n number of new students
    }
}

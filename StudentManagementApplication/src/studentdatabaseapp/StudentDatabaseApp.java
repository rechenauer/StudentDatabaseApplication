package studentdatabaseapp;

import java.lang.reflect.Array;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many new users we want to add
        System.out.println("How many students do you want to add? ");
        Scanner in = new Scanner(System.in);
        int amountStudent = in.nextInt();
        Student[] students = new Student[amountStudent];

        //Create n number of new students
        for(int i = 0; i < amountStudent; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());
        }
    }
}

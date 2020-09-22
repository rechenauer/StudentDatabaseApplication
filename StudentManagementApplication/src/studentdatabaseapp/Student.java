package studentdatabaseapp;

import java.util.Scanner;


public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses;
    private String tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;
    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student firstname: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student lastname: ");
        this.lastName = in.nextLine();
        System.out.println("1 for Freshman \n2 for Sophmore \n3 for Junior\n4 for Senior \nEnter student class level: ");
        this.year = in.nextInt();
        System.out.println(firstName + " "+ lastName + " "+ year);
        setStudentID();
        System.out.println(firstName + " "+ lastName+ " "+ year + " "+ studentID);
    }
    //Generate an ID
    private void setStudentID(){
        //GradeLevel + ID
        id++;
        this.studentID = year + " " + id;
    }

    //Enroll in courses

    //Pay tuition

    //Show status
}

package StudentDatabaseApp;

import java.util.*;

public class Student {
    private int gradeYear, tuitionBalance;
    private static int costOfCourse = 600;
    private String firstName, lastName, studentID;
    private String courses = "";
    private static int id = 1000;

    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scan.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = scan.nextLine();
        System.out.print("1 -Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter student class level: ");
        this.gradeYear = scan.nextInt();
        setStudentID();
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }

        } while (1 != 0);

    }

    public void viewBalance() {
        System.out.println("Your balance is : $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your payment amount: $");
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
                + "\nCourses Enrolled:" + courses + "\nBalance: $" + tuitionBalance;
    }

}
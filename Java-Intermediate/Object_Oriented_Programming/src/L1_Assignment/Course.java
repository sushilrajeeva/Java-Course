package L1_Assignment;

import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList<String> enrolledStudents;
    static int maxCapacity = 100;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(String studentName) {
        if (this.enrolledStudents.size() < Course.maxCapacity) {
            this.enrolledStudents.add(studentName);
            System.out.println(studentName + " is enrolled in " + this.courseName + " course");
        } else {
            System.out.println("Max course capacity reached! Can't add " + studentName + " to " + this.courseName + " course.");
        }
    }

    public int findStudent(String studentName) {
        if (this.enrolledStudents.isEmpty()) return -1;
        for (int i = 0; i<this.enrolledStudents.size(); i++) {
            if (this.enrolledStudents.get(i).equals(studentName)) return i;
        }
        return -1;
    }

    public void unenrollStudent(String studentName) {
        int index = findStudent(studentName);
        if (index == -1) {
            System.out.println("The given student " + studentName + " is not found in the " + this.courseName + " enrolled list!");
        } else {
            this.enrolledStudents.remove(index);
            System.out.println("The given student " + studentName + " is removed from the " + this.courseName + " enrolled list!");
        }
    }

    static void setMaxCapacity(int capacity) {
        Course.maxCapacity = capacity;
    }

    public static void main(String[] args) {
        Course python = new Course("Python");
        Course.setMaxCapacity(2);
        System.out.println("Max capacity of the course : " + Course.maxCapacity);
        python.enrollStudent("Sushil");
        python.enrollStudent("Sachi");
        python.enrollStudent("Sabitha");
        int index = python.findStudent("Sabitha");
        System.out.println(index == -1 ? "Can't find the student" : "Found student at index : " + index); ;
        python.findStudent("Sabitha");
        python.unenrollStudent("Sushil");
        python.unenrollStudent("Sachi");
        python.unenrollStudent("Sabitha");
        Course.setMaxCapacity(3);
    }
}

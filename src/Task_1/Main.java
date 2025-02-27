package Task_1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Jack", "3A", 1));
        students.add(new Student("Jane", "4B", 2));
        students.add(new Student("Tom", "5", 3));
        students.add(new Student("Alice", "6D", 4));
        students.add(new Student("Bob", "2D", 5));
        students.add(new Student("Charlie", "1D", 2));
        students.add(new Student("Diana", "3A", 1));
        students.add(new Student("Edward", "4C", 2));
        students.add(new Student("Fiona", "5D", 3));
        students.add(new Student("George", "6A", 5));



        printAllStudents(students, 5);
        //deleteStudent(students);
        passStudent(students);

    }

    public static void printAllStudents(Set<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void printAllStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course)
                System.out.println(student);
        }
    }

    public static void deleteStudent(Set<Student> students) {

        Set<Student> newStudents = new HashSet<>();

        for (Student student : students) {
            if (student.getAverageScore() < 3)
                continue;
            else
                newStudents.add(student);
        }

        students.clear();
        students.addAll(newStudents);
    }

    public static void passStudent(Set<Student> students) {

        Set<Student> newStudents = new HashSet<>();

        for (Student student : students) {
            if (student.getAverageScore() >= 3)
                newStudents.add(student);
        }

        students.clear();
        students.addAll(newStudents);
    }

}
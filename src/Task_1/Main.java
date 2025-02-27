package Task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

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

        //deleteStudent(students);
        passStudent(students);

    }

//    public static void printAllStudents(ArrayList<Student> students) {
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }

    public static void printAllStudents(ArrayList<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course)
                System.out.println(student);
        }
    }

    public static void deleteStudent(ArrayList<Student> students) {

        ArrayList<Student> newStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverageScore() < 3)
                continue;
            else
                newStudents.add(student);
        }

        students.clear();
        students.addAll(newStudents);
    }

    public static void passStudent(ArrayList<Student> students) {

        ArrayList<Student> newStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverageScore() >= 3)
                newStudents.add(student);
        }

        students.clear();
        students.addAll(newStudents);
    }

}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Jack", "3", 1));
        students.add(new Student("Jane", "4", 2));
        students.add(new Student("Tom", "5", 3));
        students.add(new Student("Alice", "6", 4));
        students.add(new Student("Bob", "2", 5));
        students.add(new Student("Charlie", "1", 2));
        students.add(new Student("Diana", "3", 1));
        students.add(new Student("Edward", "4", 2));
        students.add(new Student("Fiona", "5", 3));
        students.add(new Student("George", "6", 5));


        //printAllStusents(students);
        System.out.println();
        printAllStusents(students, 1);
        System.out.println();
        deleteStudent(students);
        System.out.println();
        compliteStudent(students);

    }

    public static void printAllStusents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void printAllStusents(ArrayList<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course)
                System.out.println(student);
        }
    }

    public static void deleteStudent(ArrayList<Student> students) {

        ArrayList<Student> newStusents = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverageScore() < 3)
                newStusents.add(student);
        }
        System.out.println("Список студентов со средним баллом < 3");
        printAllStusents(newStusents);
    }

    public static void compliteStudent(ArrayList<Student> students) {

        ArrayList<Student> newStusents = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverageScore() >= 3)
                newStusents.add(student);
        }
        System.out.println("Список студентов со средним баллом >= 3");
        printAllStusents(newStusents);
    }


}
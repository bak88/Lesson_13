import java.util.ArrayList;
import java.util.Random;

public class Student {

    Random random = new Random();

    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> evaluations;
    private int averageScore;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        evaluations = fillEvaluations();
        averageScore = findAverageScore();
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public ArrayList<Integer> getEvaluations() {
        return evaluations;
    }

    public int getAverageScore() {
        return averageScore;
    }

    private ArrayList<Integer> fillEvaluations() {

        evaluations = new ArrayList<>();
        int size = 10;

        for (int i = 0; i < size; i++) {
            evaluations.add(random.nextInt(1, 6));
        }
        return evaluations;
    }

    private int findAverageScore() {

        int sum = 0;

        for (int num : evaluations)
            sum += num;

        int result = sum / evaluations.size();

        return result;
    }

    public void printEvaluations() {

        for (int number : evaluations)
            System.out.print(number + " ");

        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

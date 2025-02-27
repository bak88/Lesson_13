package Task_1;

import java.util.ArrayList;
import java.util.Random;

public class Student {

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


    public int getCourse() {
        return course;
    }

    public int getAverageScore() {
        return averageScore;
    }

    private ArrayList<Integer> fillEvaluations() {

        Random random = new Random();
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

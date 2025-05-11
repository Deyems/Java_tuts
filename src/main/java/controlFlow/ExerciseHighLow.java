package controlFlow;

public class ExerciseHighLow {
    public static void main(String[] args) {
        int [] grades = {45, 23, 38, 90, 22, 19, 34};
        int lowest = grades[0];
        int highest = 0;

        for (int grade : grades) {
            if (highest < grade) {
                highest = grade;
            }

            if (lowest > grade) {
                lowest = grade;
            }
        }
        System.out.println("Highest : " + highest);
        System.out.println("Lowest :" + lowest);
    }
}

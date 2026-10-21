// Bài tập 13: calculateGrade - xếp loại theo điểm trung bình
public class Bai13 {
    public static String calculateGrade(double[] scores) {
        if (scores.length == 0) {
            return "F";
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = sum / scores.length;

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateGrade(new double[]{95, 90, 92})); // A
        System.out.println(calculateGrade(new double[]{85, 80, 82})); // B
        System.out.println(calculateGrade(new double[]{75, 70, 72})); // C
        System.out.println(calculateGrade(new double[]{65, 60, 62})); // D
        System.out.println(calculateGrade(new double[]{50, 40, 55})); // F
    }
}

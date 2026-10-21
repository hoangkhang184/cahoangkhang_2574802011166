// Bài tập 6: calculateAverage - trung bình cộng (mảng trống trả về 0)
public class Bai06 {
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(new int[]{10, 20, 30, 40, 50})); // 30 (Java in ra 30.0)
        System.out.println(calculateAverage(new int[]{})); // 0 (Java in ra 0.0)
    }
}

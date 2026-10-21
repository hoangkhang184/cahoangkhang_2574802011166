// Bài tập 10: sumOfSquares - tổng bình phương
public class Bai10 {
    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(new int[]{1, 2, 3})); // 14
        System.out.println(sumOfSquares(new int[]{4, 5, 6})); // 77
    }
}

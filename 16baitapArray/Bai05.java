// Bài tập 5: sumArray - tổng các số trong mảng
public class Bai05 {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{1, 2, 3, 4, 5})); // 15
    }
}

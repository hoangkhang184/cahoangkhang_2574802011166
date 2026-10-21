// Bài tập 2: sumOddNumbers - tổng các số lẻ
public class Bai02 {
    public static int sumOddNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOddNumbers(new int[]{1, 2, 3, 4, 5})); // 9
    }
}

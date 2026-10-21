// Bài tập 4: countPositiveNumbers - đếm số dương
public class Bai04 {
    public static int countPositiveNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPositiveNumbers(new int[]{-1, 2, 3, -4, 5})); // 3
    }
}

// Bài tập 14: findMissingNumber - tìm số thiếu trong dãy 1..n (không thiếu thì trả về 0)
public class Bai14 {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2; // tổng 1 + 2 + ... + n
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1, 2, 4, 5, 6}, 6)); // 3
        System.out.println(findMissingNumber(new int[]{3, 7, 1, 2, 8, 4, 5}, 8)); // 6
        System.out.println(findMissingNumber(new int[]{1, 2, 3, 4}, 4)); // 0
    }
}

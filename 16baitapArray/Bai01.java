// Bài tập 1: findMax - tìm số lớn nhất trong mảng
public class Bai01 {
    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 3, 5, 7, 9})); // 9
        System.out.println(findMax(new int[]{10, 20, 30, 40, 50})); // 50
        System.out.println(findMax(new int[]{-5, -2, -1, -3})); // -1
    }
}

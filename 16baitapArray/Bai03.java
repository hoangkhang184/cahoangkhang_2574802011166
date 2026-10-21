// Bài tập 3: findMin - tìm số nhỏ nhất trong mảng
public class Bai03 {
    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{5, 2, 8, 1, 4})); // 1
    }
}

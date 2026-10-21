// Bài tập 8: countGreaterThan - đếm phần tử lớn hơn value
public class Bai08 {
    public static int countGreaterThan(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countGreaterThan(new int[]{1, 5, 7, 2, 3}, 3)); // 2
        System.out.println(countGreaterThan(new int[]{2, 3, 1, -6, 8}, 5)); // 1
        System.out.println(countGreaterThan(new int[]{}, 5)); // 0
    }
}

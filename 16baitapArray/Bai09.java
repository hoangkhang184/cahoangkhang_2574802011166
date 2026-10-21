// Bài tập 9: alternateSum - tổng xen kẽ (vị trí chẵn cộng, vị trí lẻ trừ)
public class Bai09 {
    public static int alternateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            } else {
                sum -= arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(alternateSum(new int[]{10, 5, 6, 3})); // 8
        System.out.println(alternateSum(new int[]{1, 2, 3, 4, 5})); // 3
    }
}

// Bài tập 7: isAscending - kiểm tra mảng tăng dần (mảng rỗng hoặc 1 phần tử -> false)
public class Bai07 {
    public static boolean isAscending(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAscending(new int[]{1, 2, 3, 5})); // true
        System.out.println(isAscending(new int[]{1, 3, 2, 5})); // false
        System.out.println(isAscending(new int[]{7})); // false
        System.out.println(isAscending(new int[]{})); // false
    }
}

import java.util.ArrayList;
import java.util.List;

// Bài tập 15: removeDuplicates - bỏ phần tử trùng lặp, trả về mảng mới
public class Bai15 {
    public static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 2, 3, 4, 4, 5})); // [1, 2, 3, 4, 5]
    }
}

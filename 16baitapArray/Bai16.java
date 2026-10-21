import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Bài tập 16: findPairsWithSum - tìm các cặp số có tổng bằng sum
public class Bai16 {
    public static List<List<Integer>> findPairsWithSum(int[] arr, int sum) {
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    pairs.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(findPairsWithSum(new int[]{1, 2, 3, 4, 5}, 5)); // [[1, 4], [2, 3]]
    }
}

import java.util.ArrayList;
import java.util.List;

// Bài tập 11: filterEvensAndSum - lọc số chẵn rồi tính tổng
public class Bai11 {
    public static int filterEvensAndSum(int[] arr) {
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evens.add(arr[i]);
            }
        }
        int sum = 0;
        for (int i = 0; i < evens.size(); i++) {
            sum += evens.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(filterEvensAndSum(new int[]{1, 2, 3, 4, 5, 6})); // 12
        System.out.println(filterEvensAndSum(new int[]{12, 14, 15, 19, 20, 100})); // 146
    }
}

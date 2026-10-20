// Bài tập 9: alternateSum - tổng xen kẽ
// Vị trí chẵn (0, 2, 4...) thì cộng, vị trí lẻ (1, 3, 5...) thì trừ
int alternateSum(List<int> arr) {
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

void main() {
  print(alternateSum([10, 5, 6, 3])); // 8
  print(alternateSum([1, 2, 3, 4, 5])); // 3
}

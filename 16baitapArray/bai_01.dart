// Bài tập 1: findMax - tìm số lớn nhất trong mảng
int findMax(List<int> arr) {
  if (arr.isEmpty) return 0;
  int max = arr[0];
  for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}

void main() {
  print(findMax([1, 3, 5, 7, 9])); // 9
  print(findMax([10, 20, 30, 40, 50])); // 50
  print(findMax([-5, -2, -1, -3])); // -1
}

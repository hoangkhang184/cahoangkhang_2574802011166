// Bài tập 3: findMin - tìm số nhỏ nhất trong mảng
int findMin(List<int> arr) {
  if (arr.isEmpty) return 0;
  int min = arr[0];
  for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
      min = arr[i];
    }
  }
  return min;
}

void main() {
  print(findMin([5, 2, 8, 1, 4])); // 1
}

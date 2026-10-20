// Bài tập 8: countGreaterThan - đếm phần tử lớn hơn value
int countGreaterThan(List<int> arr, int value) {
  int count = 0;
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > value) {
      count++;
    }
  }
  return count;
}

void main() {
  print(countGreaterThan([1, 5, 7, 2, 3], 3)); // 2
  print(countGreaterThan([2, 3, 1, -6, 8], 5)); // 1
  print(countGreaterThan([], 5)); // 0
}

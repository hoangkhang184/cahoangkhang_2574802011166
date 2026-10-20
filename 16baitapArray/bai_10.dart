// Bài tập 10: sumOfSquares - tổng bình phương
int sumOfSquares(List<int> arr) {
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
    sum += arr[i] * arr[i];
  }
  return sum;
}

void main() {
  print(sumOfSquares([1, 2, 3])); // 14
  print(sumOfSquares([4, 5, 6])); // 77
}

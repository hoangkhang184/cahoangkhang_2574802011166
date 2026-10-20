// Bài tập 6: calculateAverage - trung bình cộng (mảng trống trả về 0)
double calculateAverage(List<int> arr) {
  if (arr.isEmpty) return 0;
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum / arr.length;
}

void main() {
  print(calculateAverage([10, 20, 30, 40, 50])); // 30 (Dart in ra 30.0)
  print(calculateAverage([])); // 0
}

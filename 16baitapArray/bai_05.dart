// Bài tập 5: sumArray - tổng các số trong mảng
int sumArray(List<int> arr) {
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
}

void main() {
  print(sumArray([1, 2, 3, 4, 5])); // 15
}

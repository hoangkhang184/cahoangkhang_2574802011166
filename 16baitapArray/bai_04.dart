// Bài tập 4: countPositiveNumbers - đếm số dương
int countPositiveNumbers(List<int> arr) {
  int count = 0;
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > 0) {
      count++;
    }
  }
  return count;
}

void main() {
  print(countPositiveNumbers([-1, 2, 3, -4, 5])); // 3
}

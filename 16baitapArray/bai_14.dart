// Bài tập 14: findMissingNumber - tìm số thiếu trong dãy 1..n (không thiếu thì trả về 0)
int findMissingNumber(List<int> arr, int n) {
  int expectedSum = n * (n + 1) ~/ 2; // tổng 1 + 2 + ... + n
  int actualSum = 0;
  for (int i = 0; i < arr.length; i++) {
    actualSum += arr[i];
  }
  return expectedSum - actualSum;
}

void main() {
  print(findMissingNumber([1, 2, 4, 5, 6], 6)); // 3
  print(findMissingNumber([3, 7, 1, 2, 8, 4, 5], 8)); // 6
  print(findMissingNumber([1, 2, 3, 4], 4)); // 0
}

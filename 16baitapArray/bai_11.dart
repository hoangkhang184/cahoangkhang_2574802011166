// Bài tập 11: filterEvensAndSum - lọc số chẵn rồi tính tổng
int filterEvensAndSum(List<int> arr) {
  List<int> evens = [];
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0) {
      evens.add(arr[i]);
    }
  }
  int sum = 0;
  for (int i = 0; i < evens.length; i++) {
    sum += evens[i];
  }
  return sum;
}

void main() {
  print(filterEvensAndSum([1, 2, 3, 4, 5, 6])); // 12
  print(filterEvensAndSum([12, 14, 15, 19, 20, 100])); // 146
}

// Bài tập 16: findPairsWithSum - tìm các cặp số có tổng bằng sum
List<List<int>> findPairsWithSum(List<int> arr, int sum) {
  List<List<int>> pairs = [];
  for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
      if (arr[i] + arr[j] == sum) {
        pairs.add([arr[i], arr[j]]);
      }
    }
  }
  return pairs;
}

void main() {
  print(findPairsWithSum([1, 2, 3, 4, 5], 5)); // [[1, 4], [2, 3]]
}

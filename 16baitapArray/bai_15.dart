// Bài tập 15: removeDuplicates - bỏ phần tử trùng lặp, trả về mảng mới
List<T> removeDuplicates<T>(List<T> arr) {
  List<T> result = [];
  for (int i = 0; i < arr.length; i++) {
    if (!result.contains(arr[i])) {
      result.add(arr[i]);
    }
  }
  return result;
}

void main() {
  print(removeDuplicates([1, 2, 2, 3, 4, 4, 5])); // [1, 2, 3, 4, 5]
}

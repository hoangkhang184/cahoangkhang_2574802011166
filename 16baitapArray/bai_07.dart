// Bài tập 7: isAscending - kiểm tra mảng tăng dần
// Mảng rỗng hoặc chỉ có 1 phần tử -> false
bool isAscending(List<int> arr) {
  if (arr.length < 2) return false;
  for (int i = 0; i < arr.length - 1; i++) {
    if (arr[i] >= arr[i + 1]) {
      return false;
    }
  }
  return true;
}

void main() {
  print(isAscending([1, 2, 3, 5])); // true
  print(isAscending([1, 3, 2, 5])); // false
  print(isAscending([7])); // false
  print(isAscending([])); // false
}

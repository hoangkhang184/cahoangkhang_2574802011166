// Bài tập 12: findLongestWord - chuỗi dài nhất (trùng độ dài thì lấy chuỗi đầu tiên)
String findLongestWord(List<String> words) {
  if (words.isEmpty) return '';
  String longest = words[0];
  for (int i = 1; i < words.length; i++) {
    if (words[i].length > longest.length) {
      longest = words[i];
    }
  }
  return longest;
}

void main() {
  print(findLongestWord(["apple", "banana", "cherry", "date"])); // banana
  print(findLongestWord(["hello", "world", "this", "is", "great"])); // hello
}

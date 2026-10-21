// Bài tập 12: findLongestWord - chuỗi dài nhất (trùng độ dài thì lấy chuỗi đầu tiên)
public class Bai12 {
    public static String findLongestWord(String[] words) {
        if (words.length == 0) {
            return "";
        }
        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(findLongestWord(new String[]{"apple", "banana", "cherry", "date"})); // banana
        System.out.println(findLongestWord(new String[]{"hello", "world", "this", "is", "great"})); // hello
    }
}

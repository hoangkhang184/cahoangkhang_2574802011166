# Bài tập 12: findLongestWord - chuỗi dài nhất (trùng độ dài thì lấy chuỗi đầu tiên)
def findLongestWord(words):
    if len(words) == 0:
        return ""
    longest = words[0]
    for w in words:
        if len(w) > len(longest):
            longest = w
    return longest


print(findLongestWord(["apple", "banana", "cherry", "date"]))  # banana
print(findLongestWord(["hello", "world", "this", "is", "great"]))  # hello

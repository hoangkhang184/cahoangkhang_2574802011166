# Bài tập 14: findMissingNumber - tìm số thiếu trong dãy 1..n (không thiếu thì trả về 0)
def findMissingNumber(arr, n):
    expected_sum = n * (n + 1) // 2  # tổng 1 + 2 + ... + n
    actual_sum = 0
    for x in arr:
        actual_sum += x
    return expected_sum - actual_sum


print(findMissingNumber([1, 2, 4, 5, 6], 6))  # 3
print(findMissingNumber([3, 7, 1, 2, 8, 4, 5], 8))  # 6
print(findMissingNumber([1, 2, 3, 4], 4))  # 0

# Bài tập 10: sumOfSquares - tổng bình phương
def sumOfSquares(arr):
    total = 0
    for x in arr:
        total += x * x
    return total


print(sumOfSquares([1, 2, 3]))  # 14
print(sumOfSquares([4, 5, 6]))  # 77

# Bài tập 2: sumOddNumbers - tổng các số lẻ
def sumOddNumbers(arr):
    total = 0
    for x in arr:
        if x % 2 != 0:
            total += x
    return total


print(sumOddNumbers([1, 2, 3, 4, 5]))  # 9

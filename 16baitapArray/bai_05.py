# Bài tập 5: sumArray - tổng các số trong mảng
def sumArray(arr):
    total = 0
    for x in arr:
        total += x
    return total


print(sumArray([1, 2, 3, 4, 5]))  # 15

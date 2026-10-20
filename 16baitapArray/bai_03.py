# Bài tập 3: findMin - tìm số nhỏ nhất trong mảng
def findMin(arr):
    if len(arr) == 0:
        return 0
    min_value = arr[0]
    for x in arr:
        if x < min_value:
            min_value = x
    return min_value


print(findMin([5, 2, 8, 1, 4]))  # 1

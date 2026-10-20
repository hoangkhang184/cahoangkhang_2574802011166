# Bài tập 1: findMax - tìm số lớn nhất trong mảng
def findMax(arr):
    if len(arr) == 0:
        return 0
    max_value = arr[0]
    for x in arr:
        if x > max_value:
            max_value = x
    return max_value


print(findMax([1, 3, 5, 7, 9]))  # 9
print(findMax([10, 20, 30, 40, 50]))  # 50
print(findMax([-5, -2, -1, -3]))  # -1

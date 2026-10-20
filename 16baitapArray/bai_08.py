# Bài tập 8: countGreaterThan - đếm phần tử lớn hơn value
def countGreaterThan(arr, value):
    count = 0
    for x in arr:
        if x > value:
            count += 1
    return count


print(countGreaterThan([1, 5, 7, 2, 3], 3))  # 2
print(countGreaterThan([2, 3, 1, -6, 8], 5))  # 1
print(countGreaterThan([], 5))  # 0

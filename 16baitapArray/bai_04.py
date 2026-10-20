# Bài tập 4: countPositiveNumbers - đếm số dương
def countPositiveNumbers(arr):
    count = 0
    for x in arr:
        if x > 0:
            count += 1
    return count


print(countPositiveNumbers([-1, 2, 3, -4, 5]))  # 3

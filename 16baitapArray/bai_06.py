# Bài tập 6: calculateAverage - trung bình cộng (mảng trống trả về 0)
def calculateAverage(arr):
    if len(arr) == 0:
        return 0
    total = 0
    for x in arr:
        total += x
    return total / len(arr)


print(calculateAverage([10, 20, 30, 40, 50]))  # 30 (Python in ra 30.0)
print(calculateAverage([]))  # 0

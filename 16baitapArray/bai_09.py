# Bài tập 9: alternateSum - tổng xen kẽ
# Vị trí chẵn (0, 2, 4...) thì cộng, vị trí lẻ (1, 3, 5...) thì trừ
def alternateSum(arr):
    total = 0
    for i in range(len(arr)):
        if i % 2 == 0:
            total += arr[i]
        else:
            total -= arr[i]
    return total


print(alternateSum([10, 5, 6, 3]))  # 8
print(alternateSum([1, 2, 3, 4, 5]))  # 3

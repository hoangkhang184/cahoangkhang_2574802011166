# Bài tập 7: isAscending - kiểm tra mảng tăng dần
# Mảng rỗng hoặc chỉ có 1 phần tử -> False
def isAscending(arr):
    if len(arr) < 2:
        return False
    for i in range(len(arr) - 1):
        if arr[i] >= arr[i + 1]:
            return False
    return True


print(isAscending([1, 2, 3, 5]))  # True
print(isAscending([1, 3, 2, 5]))  # False
print(isAscending([7]))  # False
print(isAscending([]))  # False

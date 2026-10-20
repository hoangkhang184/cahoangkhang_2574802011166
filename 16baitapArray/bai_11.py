# Bài tập 11: filterEvensAndSum - lọc số chẵn rồi tính tổng
def filterEvensAndSum(arr):
    evens = []
    for x in arr:
        if x % 2 == 0:
            evens.append(x)
    total = 0
    for x in evens:
        total += x
    return total


print(filterEvensAndSum([1, 2, 3, 4, 5, 6]))  # 12
print(filterEvensAndSum([12, 14, 15, 19, 20, 100]))  # 146

# Bài tập 16: findPairsWithSum - tìm các cặp số có tổng bằng sum
def findPairsWithSum(arr, sum):
    pairs = []
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] + arr[j] == sum:
                pairs.append([arr[i], arr[j]])
    return pairs


print(findPairsWithSum([1, 2, 3, 4, 5], 5))  # [[1, 4], [2, 3]]

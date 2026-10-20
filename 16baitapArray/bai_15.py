# Bài tập 15: removeDuplicates - bỏ phần tử trùng lặp, trả về mảng mới
def removeDuplicates(arr):
    result = []
    for x in arr:
        if x not in result:
            result.append(x)
    return result


print(removeDuplicates([1, 2, 2, 3, 4, 4, 5]))  # [1, 2, 3, 4, 5]

# Bài tập 13: calculateGrade - xếp loại theo điểm trung bình
def calculateGrade(scores):
    if len(scores) == 0:
        return "F"
    total = 0
    for s in scores:
        total += s
    average = total / len(scores)

    if average >= 90:
        return "A"
    elif average >= 80:
        return "B"
    elif average >= 70:
        return "C"
    elif average >= 60:
        return "D"
    else:
        return "F"


print(calculateGrade([95, 90, 92]))  # A
print(calculateGrade([85, 80, 82]))  # B
print(calculateGrade([75, 70, 72]))  # C
print(calculateGrade([65, 60, 62]))  # D
print(calculateGrade([50, 40, 55]))  # F

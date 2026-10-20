// Bài tập 13: calculateGrade - xếp loại theo điểm trung bình
String calculateGrade(List<num> scores) {
  if (scores.isEmpty) return 'F';
  double sum = 0;
  for (int i = 0; i < scores.length; i++) {
    sum += scores[i];
  }
  double average = sum / scores.length;

  if (average >= 90) {
    return 'A';
  } else if (average >= 80) {
    return 'B';
  } else if (average >= 70) {
    return 'C';
  } else if (average >= 60) {
    return 'D';
  } else {
    return 'F';
  }
}

void main() {
  print(calculateGrade([95, 90, 92])); // A
  print(calculateGrade([85, 80, 82])); // B
  print(calculateGrade([75, 70, 72])); // C
  print(calculateGrade([65, 60, 62])); // D
  print(calculateGrade([50, 40, 55])); // F
}

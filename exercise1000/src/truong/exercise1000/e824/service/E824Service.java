package truong.exercise1000.e824.service;

import truong.exercise1000.e824.model.Student;

public class E824Service {
	public Student[] getListStudentHasMathMarkLessThan5(Student[] listStudent) {
		int length = listStudent.length;
		Student[] resultListStudent = new Student[length];
		int index = 0;
		int newIndex = 0;
		while (index < length) {
			if (listStudent[index].getMathMark() < 5) {
				resultListStudent[newIndex] = listStudent[index];
				newIndex++;
			}
			index++;
		}

		return resultListStudent;
	}

	public int countStudentHasMathAndLitetureMarkGreatThan8(Student[] listStudent) {
		int length = listStudent.length;
		int index = 0;
		int count = 0;
		while (index < length) {
			double mark = listStudent[index].getMathMark() + listStudent[index].getMathMark();
			if (mark > 16) {
				count++;
			}
			index++;
		}
		return count;
	}

	public Student[] sortListStudentByAverageMark(Student[] listStudent) {
		int length = listStudent.length;
		for (int i = 1; i < length; i++) {
			Student last = listStudent[i];
			int j = i;
			while (j > 0 && (listStudent[j - 1].getAverageMark() > last.getAverageMark())) {
				listStudent[j] = listStudent[j - 1];
				j--;
			}
			listStudent[j] = last;
		}

		return listStudent;
	}

	public void printListStudent(Student[] listStudent) {
		for (int i = 0; i < listStudent.length; i++) {
			Student student = listStudent[i];
			if (student != null) {
				System.out
						.println(String.format("Name: %s, Math: %f, Liteture: %f ,Average: %f%n", student.getFullName(),
								student.getMathMark(), student.getLitetureMark(), student.getAverageMark()));
			}
		}
	}

}

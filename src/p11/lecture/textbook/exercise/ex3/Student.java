package p11.lecture.textbook.exercise.ex3;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (this.studentNum == student.studentNum) {
				return true;
			}
		}
		return false;
		
		// return this.studentNum.equals((Student) obj).studentNum));
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}

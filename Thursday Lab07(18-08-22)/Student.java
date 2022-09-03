/*develop an application where we will create batch with students.
1.there will be two course-java and aws.
2.after admission ,we will assign students with details like student id,student name,email id,ph no in that batch in which course
students took admission.
3.make sure each batch capacity is 50,we can't assign more than 50 students in the batch.
4.we can update students details also if required.
5.if student want to take admission other than these course to NoCourseFoundException will thrown*/

package studentbatch_ThursdayLab;

public class Student 
{
	private int studentId;
	private String studentName;
	private String studentMailId;
	private long studentPhno;
	
	public Student(int studentId, String studentName, String studentMailId, long studentPhno) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMailId = studentMailId;
		this.studentPhno = studentPhno;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMailId() {
		return studentMailId;
	}

	public void setStudentMailId(String studentMailId) {
		this.studentMailId = studentMailId;
	}

	public long getStudentPhno() {
		return studentPhno;
	}

	public void setStudentPhno(long studentPhno) {
		this.studentPhno = studentPhno;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMailId=" + studentMailId
				+ ", studentPhno=" + studentPhno + "]";
	}
	
	
	
	

}
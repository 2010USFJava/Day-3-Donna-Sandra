package AllTheFun;

public class Class {
 int classNumber;
 String classTitle;
 Student student;
 
 public Class() {
	 
 }
  public Class(Student student, String classTitle, int classNumber) {
	 this.student = student;
	 this.classTitle = classTitle;
	 this.classNumber = classNumber;
  }
public int getClassNumber() {
	return classNumber;
}
public void setClassNumber(int classNumber) {
	this.classNumber = classNumber;
}
public String getClassTitle() {
	return classTitle;
}
public void setClassTitle(String classTitle) {
	this.classTitle = classTitle;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
@Override
public String toString() {
	return "Class [classNumber=" + classNumber + ", classTitle=" + classTitle + ", student=" + student + "]";
}
  
  
}

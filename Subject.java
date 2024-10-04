package in.nit.workshop;

public class Subject {
// properties of subject 
	public String subjectName;
	public String subjectCode;
	
	public Subject() {
		System.out.println("default constructor");
	}
	
	public void getSubjectDetails() {
		System.out.println("this is getSubjectDetails method");
	}
		
	public void getSubjectDetails (String subjectName) {
        System.out.println("this is getSubjectDetails method");
        System.out.println("subject name:"+subjectName);
	}
	//to get length of the given subject
	public void getNumberofChar(String SubjectName) {
		System.out.println("findind the char count");
		System.out.println("subject char count:"+SubjectName.length);
	}
}
	

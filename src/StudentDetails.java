import java.util.ArrayList;

 public class StudentDetails{
	int rollno;
	String name;
	
	public StudentDetails(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return " [rollno=" + rollno + ", name=" + name + "]";
	}
}

class Student{
	ArrayList<StudentDetails> stud = new ArrayList<>();
	public void firstStudent() {
		addStudent(101, "Arul");
		addStudent(102, "Arun");
		addStudent(103, "Dhanush");
		addStudent(104, "Ilam");
	}
	public void addStudent(int rollno , String name) {
		stud.add(new StudentDetails(rollno,name));	
	}
	
	
	public boolean checkStud(int rn,String name) {
		boolean f=false;
		for(int i=0;i< stud.size();i++) {
			
			if(rn == stud.get(i).rollno && stud.get(i).name.equalsIgnoreCase(name)) {
				f=true;
				break;
			}
		}
		return f;
	}
	
	public void  displayStudentDetails() {
		System.out.println("********************Student Details**********************************");
		for(int j=0;j<stud.size();j++) {
		System.out.println(stud.get(j));
		}
	}
	
}
package dataTypesDemo;
//creating a class of Student
 class Student{

		int studentId=064;
		String studentName="VInayKumar";
		long studentPhoneNumber=9963201021l;
		void  read() {
			System.out.println("reading");
			
		}

	}

public class StudentDemo{
	public static void main(String[] args) {
		//creating object of student
		Student std =new Student();
		System.out.println(std.studentId);
		System.out.println(std.studentName);
		std.read();
	}
}

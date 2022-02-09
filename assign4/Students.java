package week3.day1.assign4;

public class Students {
public void Studentinfo() {
		
		System.out.println("Student information  ");
	}
	public static void Studentinfo(int id) {
		
		System.out.println("Student ID is = "+id);
	}
	public void Studentinfo(int id1,String name) {
		
		System.out.println("Student ID is = "+id1);
		System.out.println("Student Name is = "+name);
	}
	public void Studentinfo(String email,long phoneno) {
		
		System.out.println("Student Email ID is = "+email);
		System.out.println("Student Phone No. is = "+phoneno);
	}
	public static void main(String[] args) {
		 Students student =new  Students();
		 student.Studentinfo();
		 student.Studentinfo(1001);
		 student.Studentinfo(1002, "nelson");
		 student.Studentinfo("nelson08mn@gmail.com", 9789878054L);

	}

}


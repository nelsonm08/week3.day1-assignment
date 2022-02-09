package org.student;

import org.college.college;
import org.department.Department;

public class Student {
	public void StudentName() {
		System.out.println("Student Name:Nelson");
}
	public void StudentDept() {
		System.out.println("Student Department:BCA");
}	
	public void StudentId() {
		System.out.println("Student ID:1801721033133");
}
	public static void main(String[] args) {
		college clg = new college();
		Department dept=new Department();
		Student student=new Student();
		clg.collegeName();
		clg.collegeRank();
		clg.collegeCode();
		dept.deptName();
		student.StudentDept();
		student.StudentId();
		student.StudentName();

	}
}


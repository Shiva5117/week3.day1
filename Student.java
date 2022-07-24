package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	
	public void studentName(String name) {
		System.out.println("Student Name: "+name);
	}
	
	public void studentId(String id) {
		System.out.println("Student Id: "+id);
	}
	
	public void studentDept(String dept) {
		System.out.println("Student Department: "+dept);
	}

	public static void main(String[] args) {
		//Creating object for College class
		College col = new College();
		System.out.println("College Details:");
		col.collegeCode("AC101");
		col.collegeName("ACB University");
		col.collegeRank(3);
		
		//Creating object for Department class
		Department dep = new Department();
		System.out.println("\nDepartment Details:");
		dep.deptName("Mechanical");
		
		//Creating object for Student Class
		Student stud = new Student();
		System.out.println("\nStudent Details:");
		stud.studentId("15BME202");
		stud.studentName("Shiva S");
		stud.studentDept("Mechanical");
		

	}

}

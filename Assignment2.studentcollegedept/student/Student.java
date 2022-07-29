package org.student;

import org.department.*;

public class Student extends Department {
	
	public void studentName()
	{

		System.out.println("Student name :Sridhar TK");
	}

	public void studentDept()
	{
		System.out.println("Department: MCA");
	}

	public void studentId()
	{
		System.out.println("ID:478621");
	}

	public static void main(String[] args) {
		
		Student st=new Student();
		st.collegename();
		st.collegecode();
		st.collegerank();
		st.depname();
		st.studentName();
		st.studentDept();
		st.studentId();
		// TODO Auto-generated method stub

	}

}

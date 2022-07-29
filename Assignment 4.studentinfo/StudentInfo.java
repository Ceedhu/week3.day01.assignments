package org.student;

public class StudentInfo {
	
	public static void getstudentinfo(int id)
	{
		System.out.println("My id is :"+id);
	}
	public static void getstudentinfo(int id, String name)
	{
		System.out.println("My id is :"+id+ "My name is :"  +name);
	}
	
	public static void getstudentinfo(String email, long phno)
	{
		System.out.println("My email is :"+email+ "My phno is :"  +phno);
	}
	public static void main(String[] args) {
		
		{
			//StudentInfo si= new StudentInfo();
			getstudentinfo(478621);
			getstudentinfo(478621, "Sridhar");
			getstudentinfo("tksridhar16@gmail.com", 893990000000l);
		}
		// TODO Auto-generated method stub

	}

}

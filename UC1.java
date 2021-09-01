package Assignments.UC1;

public class UC1
{
   public static void main(String args[])
   {	// TODO Auto-generated method stub

	   int IS_FULL_TIME_ = 2;
	   
	   double empcheck = Math.floor(Math.random() * 10) % 2;
	   
	   if(empcheck == IS_FULL_TIME_)
	       System.out.println("Employee Is Present");
	   else
		   System.out.println("Employee Is Absent");
   }
}


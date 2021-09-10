package Assignment1;

public class UC3 
{
	public static void main(String[] args)
	{
		final int IS_FULL_TIME = 1;
		final int EMP_RATE_PER_HOUR = 20;
		
		int empHours = 0;
		int empWage = 0;
		
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if(empcheck == IS_FULL_TIME)
			empHours = 8;
		else 
		   empWage = EMP_RATE_PER_HOUR * empHours;
		
		System.out.println("Employee Wage :" + empWage);
		

	}


}

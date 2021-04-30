/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-6 */


class NegativeNumberException extends Exception
{
	private int detail;
	NegativeNumberException(int a)
	{
		detail=a;
	}
	public String toString()
	{
		return "NegativeNumberException [" + detail + "]";
	}
}
class CustomeException
{
	public static void main(String args[])
	{
		try
		{
			int n=Integer.parseInt(args[0]);
			if(n<0)
			{
				throw new NegativeNumberException(n);
			}
			else
			{
				System.out.println("You have entered positive number...");
			}
		}
		catch(NegativeNumberException e)
		{
			System.out.println("Caught " + e);
		}	
	}
}
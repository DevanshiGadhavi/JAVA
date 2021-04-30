/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-1*/



import java.util.*;
public class Utility
{
	public static boolean isOddEven(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		return false;
	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int number=0;
		boolean result=false,result1=false;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a integer number::");
		number=s.nextInt();
		result=isOddEven(number);
		result1=isPrime(number);
		if(result)
		{
			System.out.println(number + " Is Even number");
		}
		else
		{
			System.out.println(number + " Is Odd number");
		}
		if(result1)
		{
			System.out.println(number + " Is prime number");
		}
		else
		{
			System.out.println(number + " Is  not prime number");
		}
	}
}
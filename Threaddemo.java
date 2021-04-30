/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-7 */

class PrimeThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			int counter=0;
			for(int no=i;no>=1;no--)
			{
			if(i%no==0)
			{
				counter=counter+1;
			}
			}
			if(counter==2)
			{
				System.out.println("Prime no:- "+i);
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
		}
	}
}
class OddThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("Odd no:- "+i);
				try
				{
					Thread.sleep(500);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
		}
	}
}
class ThreadDemo
{
	public static void main(String s[])
	{
		Thread t1=Thread.currentThread();
		System.out.println(" "+t1.getName());
		t1.setName("Main Thread");
		System.out.println(" "+t1.getName());
		System.out.println(" "+t1.getPriority());

		PrimeThread pt=new PrimeThread();
		pt.start();
		OddThread ot=new OddThread();
		Thread tt=new Thread(ot);
		tt.start();
	}
}
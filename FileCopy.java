/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-12 */


import java.io.*;
import java.util.*;
class FileCopy
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Source file name::");
		String sfile = s.next();
		System.out.println("Enter Destination file name::");
		String dfile = s.next();
		File fin = new File(sfile);
		File fout = new File(dfile);
		try
		{
			FileInputStream fis = new FileInputStream(fin);
			FileOutputStream fos = new FileOutputStream(fout);
			int c;
			while((c=fis.read())!=-1)
			{
				fos.write(c);
			}
			FileInputStream fis1 = new FileInputStream(fout);
			while((c=fis1.read())!=-1)
			{
				System.out.print((char)c);
			}
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found....");
		}
		catch(IOException e)
		{
			System.out.println("IO error...");
		}
	}
}
		
/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-11 */


//Name:-Bhatt Kinjal Hasmukhbhai
//Roll No:-12008109
//Practical-11
import java.io.File;
class FileDirectory{
	public static void main(String[] args)
	{
		String fname = args[0];
		File f = new File(fname);
		if(f.isDirectory())
		{
			File dir = new File(fname);
			int fileCount = dir.list().length;
			System.out.println(" Total File : " + fileCount);
		}
		else
		{
			System.out.println("File name : " + f.getName());
			System.out.println("File Length : " + f.length());
		
		}
		
	}
}
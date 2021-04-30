/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-13 */


import java.io.*;  
public class FileReaderDemo
 {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\testout.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    
/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-9 */


import java.sql.*;
class StudentRecordDisp
{
	public static void main(String s[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc://mysql://localhost:3306/Student","root"," ");
			Statement st=con.createStatement();

			String sql="select *from student_master";
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(" "+rs.getString("stdid")+" "+rs.getString("stdname")+" "+rs.getString("stdmobile"));
			}
			rs.close();
			st.close();
			con.close();
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
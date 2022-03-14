	import java.sql.*;
	class Arya11{
	public static void main(String args[]){
        try
	   {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
	Statement start=con.createStatement();
	ResultSet rs=start.executeQuery("select * from student");
	while(rs.next())
	  {
	System.out.println(rs.getString(1)+"    "+ rs.getInt(2)+"    "+rs.getString(3));
         }
	con.close();
	   }
	catch(ClassNotFoundException e)
    	  {
	System.out.println(e);
	  }
	catch(SQLException e)
	{
	System.out.println(e);
	  }
	}
	
        }
	
 
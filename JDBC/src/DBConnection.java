import java.sql.*;
public class DBConnection {
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3308/classicmodels","root","root");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from employees") ; 
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	con.close();  
	

}
}

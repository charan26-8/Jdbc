import java.sql.*;//step-1:import the packages 
public class DBConnection {
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");  //step-2:load the jar file and register : This method is used to dynamically load the driver class.
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3308/classicmodels","root","root"); step-3://The getConnection() method of DriverManager class is used to establish connection with the database. 
	//here classicmodels is database name, root is username and password  
	Statement stmt=con.createStatement();//Step-4:The createStatement() method of Connection interface is used to create statement.The object of statement is responsible to execute queries with the database.  
	ResultSet rs=stmt.executeQuery("select * from employees") ; //step-5:The executeQuery() method of Statement interface is used to execute queries to the database.This method returns the object of ResultSet that can be used to get all the records of a table.
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	con.close();  //step-6:The close() method of Connection interface is used to close the connection.
	

}
}

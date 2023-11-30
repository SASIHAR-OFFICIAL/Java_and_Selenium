package _J_32_Expectation_Handling_Throw;
import java.sql.*;
public class stud1 {
public static void main(String[] args)throws Exception{
	Class.forName("oracle.jdbc.driver.oracleDrivwer");
	Connection C=DriverManager.getConnection("jdbc:oracle:thin@172.16.100.13:1521/*orcl","N18119,pass321");
	System.out.println(C);
	System.out.println("Connection Established Successfully");
	Statement st=C.createStatement();
	System.out.println("table Create");
	st.executeUpdate("insert into IT values('n118','viswa')");
	System.out.println("value inserted,");
	C.close();
	
}
}

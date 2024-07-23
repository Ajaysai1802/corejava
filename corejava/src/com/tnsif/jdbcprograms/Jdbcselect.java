package com.tnsif.jdbcprograms;
import java.sql.*;
import javax.sql.*;
public class Jdbcselect {
	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","Ajju@1802");
			Statement st=conn.createStatement();
			String strselect="Select bookid,booktitle,price,quantity";
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("the records are");
			int rowcount=0;
			while(rst.next()) {
				String booktitle=rst.getString("booktitle");
				int price=rst.getInt("price");
				int quantity=rst.getInt("quantity");
				System.out.println(booktitle+" "+price+" "+quantity);
				++rowcount;
			}
			
		}
		catch (SQLException e) { 
			e.printStackTrace();			
		}
		}
}
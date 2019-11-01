package com.ali;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBInteraction {

static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	
	static final String DB_URL = "jdbc:mysql://localhost/ali?useUnicode=true" + 
		"&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" + 
		"serverTimezone=UTC&useSSL=false";
	
	   //  Database credentials
	   private final String USER = "root";
	   private final String PASS = "sahrawia";
	   // connection 
	   private Connection conx;
	   
	   // requete pour le dialogue
	   private Statement stm;
	   
	   public void getConnection() {
		   try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			
		    conx = DriverManager.getConnection(DB_URL,USER,PASS);

		    stm = conx.createStatement();
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	   }
	   
	   public void close() {
		   try {
			stm.close();
			conx.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
	   
	   public int update(String sql) throws SQLException {
		   
		   int rowsUp = stm.executeUpdate(sql);
		   
		   return rowsUp;
	   }
	   
	   public List<Personne> select(String sql) throws SQLException {
		   getConnection();
		   ResultSet rs = stm.executeQuery(sql);
			List<Personne> ls = new ArrayList<Personne>();

			while(rs.next()) {
				
				Personne p = new Personne(rs.getString(2),rs.getString(3),rs.getInt(4));
				ls.add(p);
			}
		   close();
		   return ls;
	   }
	
}

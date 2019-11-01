package com.main;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ali.DBInteraction;
import com.ali.Personne;

public class TestM {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		DBInteraction dao = new DBInteraction();
		
		dao.getConnection();
		
		
		
		List<Personne> ls = new ArrayList<Personne>();
		
		ls = dao.select("select * from personne;");
		
			
		
		dao.close();
		//Personne personne = new Personne("dupont","ali",24);
		
		//System.out.println( personne);
		for(Personne p : ls) {
			System.out.println(p.toString());
		}
	
	}

}

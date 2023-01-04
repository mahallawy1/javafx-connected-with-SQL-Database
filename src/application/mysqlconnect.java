/*package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
 /*class film {
int cid ;
String filmname,country,released,language;


public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}
public String getFilmname() {
	return filmname;
}
public void setFilmname(String filmname) {
	this.filmname = filmname;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getReleased() {
	return released;
}
public void setReleased(String released) {
	this.released = released;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
} 
public film( String filmname, String country, String released, String language,int cid) {
	this.cid = cid;
	this.filmname = filmname;
	this.country = country;
	this.released = released;
	this.language = language;
}

}*/
/*
public class mysqlconnect {
    
    Connection conn = null;
    public static Connection ConnectDb(){
    	Connection dbConnection = null;
    	try {
            
        	String url = "jdbc:mysql://localhost:3306/cinema";
  	      Properties info = new Properties();
  	      info.put("user", "root");
  	      info.put("password", "root");

  	      dbConnection = DriverManager.getConnection(url, info);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
		return dbConnection;
    
    }
    
    public static ObservableList<film> getDatausers(){
        Connection conn = ConnectDb();
        ObservableList<film> list = FXCollections.observableArrayList();
        try {
        	Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cinema.film");
            System.out.println("id  name    job");
             
            System.out.println("id  name    job");
            while (rs.next()){ 
            	System.out.println("id  name    job");
                list.add(new film( rs.getString("filmname"), rs.getString("country"), rs.getString("releasedyear"), rs.getString("language"),(Integer.parseInt(rs.getString("cid")))));               
 }
        }
        catch (SQLException ex) {
  	      System.out.println("An error occurred while connecting MySQL databse");
  	      ex.printStackTrace();
  	    }
        catch (Exception e) {
        	System.out.println("Succe");
        }
        return list;
    }
    
}

/*while (rs.next()) {
     cid = rs.getInt("cid");
    filmname = rs.getString("filmname");
 country = rs.getString("country");
 release = rs.getString("releasedyear");
 language=rs.getString("language");*/

  
     
     
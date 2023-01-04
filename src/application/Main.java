package application;
	
import java.lang.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;
import java.util.Properties;



public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
    	 Parent root = FXMLLoader.load(getClass().getResource("entry.fxml"));
    	   Scene scene = new Scene(root);
    	   
    	   stage.setTitle("cinema documentation");
    	   stage.setScene(scene);
    	   stage.show();
    }


    public static void main(String[] args) {
    	  Connection dbConnection = null;

    	    try {
    	      String url = "jdbc:mysql://localhost:3306/cinema";
    	      Properties info = new Properties();
    	      info.put("user", "root");
    	      info.put("password", "root");

    	      dbConnection = DriverManager.getConnection(url, info);
    	    
    	      if (dbConnection != null) {
    	        System.out.println("Successfully connected to MySQL database test");
    	      }

    	    } catch (SQLException ex) {
    	      System.out.println("An error occurred while connecting MySQL databse");
    	      ex.printStackTrace();
    	    } 
    	    
    	    
        launch(args);
    }
}


    				

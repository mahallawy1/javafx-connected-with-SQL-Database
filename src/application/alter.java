package application;

import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

import java.sql.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class alter {
	private Stage stage;

	private Scene scene;

	private Parent root;

    @FXML
    private Label La4;

    @FXML
    private Label La41;

    @FXML
    private Label La411;

    @FXML
    private Label La412;

    @FXML
    private Label La413;

    @FXML
    private Label La414;

    @FXML
    private Label La4141;

    @FXML
    private Label La41411;

    @FXML
    private Label La41412;

    @FXML
    private Label La41413;

    @FXML
    private Label La41414;

    @FXML
    private Label La415;

    @FXML
    private TextField Tagender;

    @FXML
    private TextField Tagender1;

    @FXML
    private TextField Tagender11;

    @FXML
    private TextField Taname;

    @FXML
    private TextField Taname1;

    @FXML
    private TextField Taname11;

    @FXML
    private TextField Taname111;

    @FXML
    private TextField Taname1111;

    @FXML
    private TextField Taname1112;

    @FXML
    private TextField Taname1113;

    @FXML
    private TextField Taname1114;

    @FXML
    private TextField Taname1115;

    @FXML
    private TextField Taname1116;

    @FXML
    private TextField Taname1117;

    @FXML
    private TextField Taname1118;

    @FXML
    private TextField Taname2;

    @FXML
    private TextField Taname21;

    @FXML
    private TextField Taname211;

    @FXML
    private TextField Taname212;

    @FXML
    private TextField Taname213;

    @FXML
    private TextField Taname22;

    @FXML
    private TextField Taname23;

    @FXML
    private TextField Taname24;

    @FXML
    private TextField Taname3;

    @FXML
    private TextField Taname4;

    @FXML
    private TextField Taname5;

    @FXML
    private TextField Taname6;

    @FXML
    private TextField Taname7;

    @FXML
    private TextField Taphone;

    @FXML
    private TextField Taphone1;

    @FXML
    private TextField Taphone11;

    @FXML
    private TextField Tnat;

    @FXML
    private TextField Tnat1;

    @FXML
    private TextField Tnat11;

    @FXML
    private TextField Tnat4;

    @FXML
    private TextField Tnat41;

    @FXML
    private TextField Tnat411;

    @FXML
    private TextField Tnat4111;

    @FXML
    private TextField Tnat41111;

    @FXML
    private TextField Tnat4112;

    @FXML
    private TextField Tnat412;

    Connection dbConnection = null;
    {
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
        }
    public void addyaba(ActionEvent event) throws IOException   {   }
    public void delusr(ActionEvent event) throws IOException   {
    	
   	 try {
   		 
   			
   		 Statement stmt=dbConnection.createStatement ();
 	    System.out.println("deleting");
 	    String sql="DELETE FROM `cinema`.`user` WHERE (`ID` = '"+Taname1.getText()+"');";    		
 	    stmt.executeUpdate (sql);
 	   La413.setText(":)");
   		
   	 }
   		catch (NumberFormatException | SQLException e){

   			System.out.println("enter only numbers plz");
   			La413.setText(":(");
   			JOptionPane.showMessageDialog(null, "no such tuple :'(");
   		}
   	/* catch (Banexception e) {

   			System.out.println("error");
   			lfilm.setText(e.getMessage());
   		}
*/
   		catch (Exception e) {

   			System.out.println("error");

   		}
   	
    }
    public void delfilm(ActionEvent event) throws IOException   {
    	
      	 try {
      		 
      			
      		 Statement stmt=dbConnection.createStatement ();
    	    System.out.println("deleting");
    	    String sql="DELETE FROM `cinema`.`film` WHERE (`filmname` = '"+Taname.getText()+"' );" ;
    	    		
    	    stmt.executeUpdate (sql);
    	   La4.setText(":)");
      		
      	 }
      		catch (NumberFormatException | SQLException e){

      			System.out.println("enter only numbers plz");
      			La4.setText(":(");
      			JOptionPane.showMessageDialog(null, "no such tuple :'(");
      		}
      	/* catch (Banexception e) {

      			System.out.println("error");
      			lfilm.setText(e.getMessage());
      		}
   */
      		catch (Exception e) {

      			System.out.println("error");

      		}
      	
       }
    public void delrate(ActionEvent event) throws IOException   {
    	
      	 try {
      		
      		int hi = Integer.parseInt(Taname22.getText() );
      		 Statement stmt=dbConnection.createStatement ();
    	    System.out.println("deleting");
    	    String sql="DELETE FROM `cinema`.`rate` WHERE (`Filmname` = '"+Taname21.getText()+"') and (`Userid` = '"+hi+"');" ;
    	    		
    	    stmt.executeUpdate (sql);
    	    La414.setText(":)");
      		
      	 }
      		catch (NumberFormatException | SQLException e){

      			System.out.println("enter only numbers plz");
      			La414.setText(":(");
      			JOptionPane.showMessageDialog(null, "no such tuple :'(");
      		}
      	/* catch (Banexception e) {

      			System.out.println("error");
      			lfilm.setText(e.getMessage());
      		}
   */
      		catch (Exception e) {

      			System.out.println("error");

      		}
      	
       }
    public void delactor(ActionEvent event) throws IOException   {
    	
      	 try {
      		 
      		int ghs = Integer.parseInt(Taname1113.getText() );
      		 Statement stmt=dbConnection.createStatement ();
    	    System.out.println("deleting");
    	    String sql="DELETE FROM `cinema`.`actors` WHERE (`id` = '"+ghs+"');" ;
    	    		
    	    stmt.executeUpdate (sql);
    	    La41412.setText(":)");
      		
      	 }
      		catch (NumberFormatException | SQLException e){

      			System.out.println("enter only numbers plz");
      			La41412.setText(":(");
      			JOptionPane.showMessageDialog(null, "no such tuple :'(");
      		}
      	/* catch (Banexception e) {

      			System.out.println("error");
      			lfilm.setText(e.getMessage());
      		}
   */
      		catch (Exception e) {

      			System.out.println("error");

      		}
      	
       }
   
    public void editfilm(ActionEvent event) throws IOException   {
    	
     	 try {
     		 
     		int gho = Integer.parseInt(Tnat4.getText() );
     		 Statement stmt=dbConnection.createStatement ();
   	    System.out.println("deleting");
   	    String sql="UPDATE `cinema`.`film` SET `country` = '"+Taphone.getText()+"', `released year` = '"+Tagender.getText()+"', `language` = '"+Tnat.getText()+"', `cid` = '"+gho+"' WHERE (`filmname` = '"+Taname.getText()+"');" ;
   	    		
   	    stmt.executeUpdate (sql);
   	 La4.setText(":)");
     		
     	 }
     		catch (NumberFormatException | SQLException e){

     			System.out.println("enter only numbers plz");
     			La4.setText(":(");
     			JOptionPane.showMessageDialog(null, "no such tuple :'(");
     		}
     	/* catch (Banexception e) {

     			System.out.println("error");
     			lfilm.setText(e.getMessage());
     		}
  */
     		catch (Exception e) {

     			System.out.println("error");

     		}
     	
      }
    public void switcheser(ActionEvent event) throws IOException {

    	  root = FXMLLoader.load(getClass().getResource("service.fxml"));

    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

    	  scene = new Scene(root);

    	  stage.setScene(scene);

    	  stage.show();

    	 }
    public void editrate(ActionEvent event) throws IOException   {
    	
    	 try {
    		 
    		int gho = Integer.parseInt(Taname22.getText() );
    		int ghh = Integer.parseInt(Taname24.getText() );
    		
    		 Statement stmt=dbConnection.createStatement ();
  	    System.out.println("deleting");
  	    String sql="UPDATE `cinema`.`rate` SET `Ratingcomments` = '"+Taname23.getText()+"', `Ratingno` = '"+ghh+"' WHERE (`Filmname` = '"+Taname21.getText()+"') and (`Userid` = '"+gho+"');" ;
  	    		
  	    stmt.executeUpdate (sql);
  	  La414.setText(":)");
    		
    	 }
    		catch (NumberFormatException | SQLException e){

    			System.out.println("enter only numbers plz");
    			La414.setText(":(");
    			JOptionPane.showMessageDialog(null, "no such tuple :'(");
    		}
    	/* catch (Banexception e) {

    			System.out.println("error");
    			lfilm.setText(e.getMessage());
    		}
 */
    		catch (Exception e) {

    			System.out.println("error");

    		}
    	
     }
}

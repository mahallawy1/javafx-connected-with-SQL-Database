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


public class adding {
	
	private Stage stage;

	 private Scene scene;

	 private Parent root;
    @FXML
    private Label La413;

    @FXML
    private Label La414;

    @FXML
    private Label La4141;

    @FXML
    private Label La41412;

    @FXML
    private Label La415;

    @FXML
    private TextField Tagender1;

    @FXML
    private TextField Tagender11;

    @FXML
    private TextField Taname1;

    @FXML
    private TextField Taname11;

    @FXML
    private TextField Taname1113;

    @FXML
    private TextField Taname1114;

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
    private TextField Taphone1;

    @FXML
    private TextField Taphone11;

    @FXML
    private TextField Tnat1;

    @FXML
    private TextField Tnat11;

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

    @FXML
    private TextField actionname; ///...........

    @FXML
    private TextField actionrate;///...........

    @FXML
    private Button addcrew;///...........

    @FXML
    private Button addf;///...........

    @FXML
    private TextField cid;///...........

    @FXML
    private TextField cname;///...........

    @FXML
    private TextField comedygenre;///...........

    @FXML
    private TextField comedyname;///...........

    @FXML
    private Label crewl;///...........

    @FXML
    private TextField csalary;///...........

    @FXML
    private TextField dirid;///...........

    @FXML
    private TextField dirstyle;///...........

    @FXML
    private TextField dramalevel;///...........

    @FXML
    private TextField dramaname;///...........

    @FXML
    private TextField fcountry;///...........

    @FXML
    private TextField fcrewid;///...........

    @FXML
    private TextField flang;///...........

    @FXML
    private TextField fname;///...........

    @FXML
    private TextField fyear;///...........

    @FXML
    private Label laction;///...........

    @FXML
    private Label lcom;///...........

    @FXML
    private Label ldir;///...........

    @FXML
    private Label ldrama;///...........

    @FXML
    private TextField levelproduce;///...........

    @FXML
    private Label lfilm;///...........

    @FXML
    private Label lprod;///...........

    @FXML
    private Button newaction;///...........

    @FXML
    private Button newcom;///...........

    @FXML
    private Button newdir;///...........

    @FXML
    private Button newprod;///...........

    @FXML
    private TextField prodid;///...........
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
    
    
    public void switche(ActionEvent event) throws IOException {

    	  root = FXMLLoader.load(getClass().getResource("Addt.fxml"));

    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

    	  scene = new Scene(root);

    	  stage.setScene(scene);

    	  stage.show();

    	 }
    public void switcheser(ActionEvent event) throws IOException {

  	  root = FXMLLoader.load(getClass().getResource("service.fxml"));

  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

  	  scene = new Scene(root);

  	  stage.setScene(scene);

  	  stage.show();

  	 }

    public void addyaba(ActionEvent event) throws IOException   {
    	
   	 try {
   		 
   		// String t =Tnat.getText();
  
   	int g = Integer.parseInt(fcrewid.getText() );
   		 

   			
   		 Statement stmt=dbConnection.createStatement ();
 	    System.out.println("inserting records");
 	    String sql="INSERT INTO `cinema`.`film` (`filmname`, `country`, `released year`, `language`, `cid`) VALUES ('"+fname.getText()+"', '"+fcountry.getText()+"', '"+fyear.getText()+"', '"+flang.getText()+"', '"+g+"');"
 	    		+ "";
 	    stmt.executeUpdate (sql);
 	   lfilm.setText(":)");
   		
   	 }
   		catch (NumberFormatException | SQLException e){

   			System.out.println("enter only numbers plz");
   			lfilm.setText(":(");
   			JOptionPane.showMessageDialog(null, "non exactance crew worker id :'(");
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
   
   
    public void addcrew(ActionEvent event) throws IOException   {
    	
      	 try {
      		 
      		// String t =Tnat.getText();
     
      	int h = Integer.parseInt(cid.getText() );
      		 

      			
      		 Statement stmt=dbConnection.createStatement ();
    	    System.out.println("inserting records");
    	    String sql=" INSERT INTO `cinema`.`crew` (`Id`, `salary`, `name`) VALUES ('"+h+"', '"+csalary.getText()+"', '"+cname.getText()+"');";
    	    		
    	    stmt.executeUpdate (sql);
    	    
    	    crewl.setText(":)");
      		
      	 }
      		catch (NumberFormatException | SQLException e){

      			System.out.println("enter only numbers plz");
      			crewl.setText(":(");
      			JOptionPane.showMessageDialog(null, "non exactance crew worker id :'(");
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
    public void addprod(ActionEvent event) throws IOException   {
    	
     	 try {
     		 
     		// String t =Tnat.getText();
    
     	int y = Integer.parseInt(prodid.getText() );
     		 

     	
     		 Statement stmt=dbConnection.createStatement ();
   	    System.out.println("inserting records");
   	    String sql="INSERT INTO `cinema`.`producer` (`id`, `Levelofcasting`) VALUES ('"+y+"', '"+levelproduce.getText()+"');";
   	    		
   	    stmt.executeUpdate (sql);
   	 lprod.setText(":)");
     		
     	 }
     		catch (NumberFormatException | SQLException e){

     			System.out.println("enter only numbers plz");
     			lprod.setText(":(");
     			JOptionPane.showMessageDialog(null, "non exactance crew worker id :'(");
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
    
    public void adddir(ActionEvent event) throws IOException   {
    	
     	 try {
     		 
     		// String t =Tnat.getText();
    
     	int j = Integer.parseInt(dirid.getText() );
     		 

     			
     		 Statement stmt=dbConnection.createStatement ();
   	    System.out.println("inserting records");
   	    String sql="INSERT INTO `cinema`.`director` (`id`, `Style`) VALUES ('"+j+"', '"+dirstyle.getText()+"');";
   	    		
   	    stmt.executeUpdate (sql);
   	 ldir.setText(":)");
     		
     	 }
     		catch (NumberFormatException | SQLException e){

     			System.out.println("enter only numbers plz");
     			ldir.setText(":(");
     			JOptionPane.showMessageDialog(null, "non exactance crew worker id :'(");
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
    
    public void addaction(ActionEvent event) throws IOException   {
    	
     	 try {
     		 
     			
     		 Statement stmt=dbConnection.createStatement ();
   	    System.out.println("inserting records");
   	    String sql=" INSERT INTO `cinema`.`action movie` (`film name`, `Movie  rate`) VALUES ('"+actionname.getText()+"', '"+actionrate.getText()+"');";
   	    		
   	    stmt.executeUpdate (sql);
   	 laction.setText(":)");
     		
     	 }
     		catch (NumberFormatException | SQLException e){

     			System.out.println("enter only numbers plz");
     			laction.setText(":(");
     			JOptionPane.showMessageDialog(null, "non exactance film with same name :'(");
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
    public void addacomedy(ActionEvent event) throws IOException   {
    	
    	 try {
    		 
    			
    		 Statement stmt=dbConnection.createStatement ();
  	    System.out.println("inserting records");
  	    String sql="INSERT INTO `cinema`.`comedy movie` (`film name`, `subgenres`)VALUES ('"+comedyname.getText()+"', '"+comedygenre.getText()+"');";
  	    		
  	    stmt.executeUpdate (sql);
  	  lcom.setText(":)");
    		
    	 }
    		catch (NumberFormatException | SQLException e){

    			System.out.println("enter only numbers plz");
    			lcom.setText(":(");
    			JOptionPane.showMessageDialog(null, "non exactance film with same name :'(");
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

    public void adddrama(ActionEvent event) throws IOException   {
    	
    	 try {
    		 
    			
    		 Statement stmt=dbConnection.createStatement ();
  	    System.out.println("inserting records");
  	    String sql="INSERT INTO `cinema`.`drama movie` (`film name`, `Level of drama`) VALUES ('"+dramaname.getText()+"', '"+dramalevel.getText()+"');";
  	    		
  	    stmt.executeUpdate (sql);
  	  ldrama.setText(":)");
  	
    	 }
    		catch (NumberFormatException | SQLException e){

    			System.out.println("enter only numbers plz");
    			ldrama.setText(":(");
    			JOptionPane.showMessageDialog(null, "non exactance film with same name :'(");
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
    
    public void adddusr(ActionEvent event) throws IOException   {
    	
   	 try {
   		int idd = Integer.parseInt(Taname1.getText() );
   		int no = Integer.parseInt(Tnat4111.getText() );
   		int agee = Integer.parseInt(Tnat41.getText() );
   			
   		 Statement stmt=dbConnection.createStatement ();
 	    System.out.println("inserting records");
 	    String sql=" INSERT INTO `cinema`.`user` (`ID`, `interests`, `UserCountry`, `Watched Shows`, `age`, `repeatsofattendance`, `filmattended`) VALUES ('"+idd+"', '"+Taphone1.getText()+"', '"+Tagender1.getText()+"', '"+Tnat1.getText()+"', '"+agee+"', '"+Tnat411.getText()+"', '"+no+"');";
 	    stmt.executeUpdate (sql);
 	   La413.setText(":)");
   		
   	 }
   		catch (NumberFormatException | SQLException e){

   			System.out.println("enter only numbers plz");
   			La413.setText(":(");
   			JOptionPane.showMessageDialog(null, "whyyyyyyyyy? :'(  ");
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

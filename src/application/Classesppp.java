package application;

import java.io.IOException;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;

import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class Classesppp {

//employee

 private Stage stage;

 private Scene scene;

 private Parent root;
 @FXML
	private TextField Ic;
	@FXML
	private TextField Im;
	@FXML
	private TextField Ic1;
	@FXML
	private TextField Im1;
	@FXML
	private TextField Ic2;
	@FXML
	private Label Lala;
	@FXML
	private Label Lala1;
	@FXML
	private Label Lala2;
	
	
	

 
Employee em=new Employee();
 public void switchToScene1(ActionEvent event) throws IOException {

  root = FXMLLoader.load(getClass().getResource("Fxml3.fxml"));

  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

  scene = new Scene(root);

  stage.setScene(scene);

  stage.show();

 }
 public void assign(ActionEvent event) throws IOException  {
	 try {
		 
		 int c = Integer.parseInt(Ic.getText() );
		 int m = Integer.parseInt(Im.getText() );
		
			
		  em.addToClass(c, m);		
		  Lala.setText("assigned inshallah");
		}

		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			 Lala.setText("enter only numbers plz)");
		}

	 catch (Exception e) {

			System.out.println("error");

		}
	 
	

}
 public void delete(ActionEvent event) throws IOException  {
	 try {
		 
		 int c = Integer.parseInt(Ic1.getText() );
		 int m = Integer.parseInt(Im1.getText() );
		
			
		  em.deleteFromClass(c, m);		
		  Lala1.setText("Deleted fe dahya");
		}

		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			 Lala1.setText("enter only numbers plz)");
		}

	 catch (Exception e) {

			System.out.println("error");

		}
 }
 public void view(ActionEvent event) throws IOException  {
	 try {
		 int c = Integer.parseInt(Ic2.getText() );
		
		Lala2.setText(em.viewClassMembers(c));
		
			
		  
		}
	 catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			 Lala2.setText("enter only numbers plz)");
		}
		
	 catch (Exception e) {
		 Lala2.setText("make sure you completed assign method !!");
			System.out.println("error");

		}
 }
 
 
}
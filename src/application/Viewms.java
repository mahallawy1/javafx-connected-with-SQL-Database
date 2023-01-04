package application;
import java.io.IOException;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;

import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;



public class Viewms {



 private Stage stage;

 private Scene scene;

 private Parent root;
 @FXML
	private Label Lm;
 @FXML
	private Label Lt;
 @FXML
	private Label Lg;
 Employee epo=new Employee();

 public void switchToScene1emply(ActionEvent event) throws IOException {

  root = FXMLLoader.load(getClass().getResource("Fxml3.fxml"));

  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

  scene = new Scene(root);

  stage.setScene(scene);

  stage.show();

 }
 public void switchToSceneadmin(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Fxml2.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
 public void viewmonth(ActionEvent event) throws IOException  {
	 try {
		 
		
		 Lm.setText( epo.viewOMmembers());	
		
			
		  
		}

		
	 catch (Exception e) {

			System.out.println("error");

		}
 }
 public void viewTTT(ActionEvent event) throws IOException  {
	 try {
		 
		
		 Lt.setText(epo.viewTMmembers());	
		
			
		  
		}

		
	 catch (Exception e) {

			System.out.println("error");

		}
 }
 public void viewPayG(ActionEvent event) throws IOException  {
	 try {
		 
		
		 Lg.setText(epo.viewPayGmembers());	
		
			
		  
		}

		
	 catch (Exception e) {

			System.out.println("error");

		}
 }
}
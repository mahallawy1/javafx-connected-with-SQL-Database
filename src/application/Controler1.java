package application;

import java.io.IOException;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;

import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class Controler1 {

	@FXML
	private Label loginMessageLabel;
	@FXML
	private TextField Namebox;
	@FXML
	private PasswordField Passwordbox;

 private Stage stage;

 private Scene scene;

 private Parent root;

 

 
 
 public void validateAdmin(ActionEvent event) throws IOException  {
		
		if (Namebox.getText().equals("admin")&&Passwordbox.getText().equals("123")) {

			//loginMessageLabel.setText("Successful");

			root = FXMLLoader.load(getClass().getResource("Fxml2.fxml"));

			  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

			  scene = new Scene(root);

			  stage.setScene(scene);

			  stage.show();

			
	}else {
		
		loginMessageLabel.setText("invalid ya bashmohansa ):");

	}
	}
 public void validateemployee(ActionEvent event) throws IOException  {
		
		if (Namebox.getText().equals("employee")&&Passwordbox.getText().equals("123")) {

			//loginMessageLabel.setText("Successful");

			root = FXMLLoader.load(getClass().getResource("Fxml3.fxml"));

			  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

			  scene = new Scene(root);

			  stage.setScene(scene);

			  stage.show();

			
	}else {
		
		loginMessageLabel.setText("invalid ya bashmohansa ):");

	}
	}
 public void validateemployee2(ActionEvent event) throws IOException  {
		
		

			//loginMessageLabel.setText("Successful");

			root = FXMLLoader.load(getClass().getResource("Fxml3.fxml"));

			  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

			  scene = new Scene(root);

			  stage.setScene(scene);

			  stage.show();

			
	}
 public void validatad2(ActionEvent event) throws IOException  {
		
		

		//loginMessageLabel.setText("Successful");

		root = FXMLLoader.load(getClass().getResource("Fxml2.fxml"));

		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		  scene = new Scene(root);

		  stage.setScene(scene);

		  stage.show();

		
}
 
}
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



public class Viewallt {



 private Stage stage;

 private Scene scene;

 private Parent root;
 @FXML
	private Label All;

 admin mahalawy= new admin();

 public void switchToScene1(ActionEvent event) throws IOException {

  root = FXMLLoader.load(getClass().getResource("Fxml2.fxml"));

  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

  scene = new Scene(root);

  stage.setScene(scene);

  stage.show();

 }

public void warelimembers(ActionEvent event) throws IOException  {
	
try {	
	All.setText(mahalawy.viewTrainersInfo());

}
catch (Exception e) {

		System.out.println("error");

	}

}
 
 
}

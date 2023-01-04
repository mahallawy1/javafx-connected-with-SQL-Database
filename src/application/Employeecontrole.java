package application;

import java.io.IOException;



import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;

import javafx.scene.Node;

import javafx.scene.Parent;

import javafx.scene.Scene;

import javafx.stage.Stage;



public class Employeecontrole {



 private Stage stage;

 private Scene scene;

 private Parent root;

 

 public void switchToScene1(ActionEvent event) throws IOException {

  root = FXMLLoader.load(getClass().getResource("Fxml1.fxml"));

  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

  scene = new Scene(root);

  stage.setScene(scene);

  stage.show();

 }
 public void switchToadd(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Addt.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
 public void switchToMS(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Viewms.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
 public void switchToclass(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Classoptions.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
 public void switchToallmem(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Viewallm.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
}

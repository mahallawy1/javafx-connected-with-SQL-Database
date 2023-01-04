package application;
import java.io.IOException;



import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;

import javafx.scene.Node;

import javafx.scene.Parent;

import javafx.scene.Scene;

import javafx.stage.Stage;



public class Admincontrole {



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
 public void switchTotrainers(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Addm.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
 
 public void switchToams(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Viewms.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
 public void switchToaclass(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Classes.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
 public void switchToaallmem(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Viewallm.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
 
 public void switchToaalltt(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("Viewallt.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
 
}

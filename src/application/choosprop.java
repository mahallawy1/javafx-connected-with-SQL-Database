package application;

import java.io.IOException;


import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;

import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class choosprop {

private Stage stage;

private Scene scene;

private Parent root;
	public void switchToview1(ActionEvent event) throws IOException {

		  root = FXMLLoader.load(getClass().getResource("query3.fxml"));

		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		  scene = new Scene(root);

		  stage.setScene(scene);

		  stage.show();

		 }
	public void switchToedit2(ActionEvent event) throws IOException {

		  root = FXMLLoader.load(getClass().getResource("query4.fxml"));

		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		  scene = new Scene(root);

		  stage.setScene(scene);

		  stage.show();

		 }
	public void switchToadd3(ActionEvent event) throws IOException {

		  root = FXMLLoader.load(getClass().getResource("query5.fxml"));

		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		  scene = new Scene(root);

		  stage.setScene(scene);

		  stage.show();

		 }
	public void switchToprop4(ActionEvent event) throws IOException {

		  root = FXMLLoader.load(getClass().getResource("Viewms2.fxml"));

		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		  scene = new Scene(root);

		  stage.setScene(scene);

		  stage.show();

		 }
	public void switchToprop5(ActionEvent event) throws IOException {

		  root = FXMLLoader.load(getClass().getResource("Fxml2.fxml"));

		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		  scene = new Scene(root);

		  stage.setScene(scene);

		  stage.show();

		 }
	public void switchToprop6(ActionEvent event) throws IOException {

		  root = FXMLLoader.load(getClass().getResource("Fxml2.fxml"));

		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		  scene = new Scene(root);

		  stage.setScene(scene);

		  stage.show();

		 }
	public void switchTback(ActionEvent event) throws IOException {

		  root = FXMLLoader.load(getClass().getResource("service.fxml"));

		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		  scene = new Scene(root);

		  stage.setScene(scene);

		  stage.show();

		 }
}

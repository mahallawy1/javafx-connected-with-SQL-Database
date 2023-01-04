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

public class entry {

private Stage stage;

private Scene scene;

private Parent root;
	public void switchToScene1(ActionEvent event) throws IOException {

		  root = FXMLLoader.load(getClass().getResource("service.fxml"));

		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		  scene = new Scene(root);

		  stage.setScene(scene);

		  stage.show();

		 }
}

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



public class Viewallm {
//both


 private Stage stage;

 private Scene scene;

 private Parent root;
 @FXML
	private Label allmm ;
 @FXML
	private TextField idf;
 @FXML
	private Label We ;

 Employee em=new Employee();
 admin s= new admin();

 Member m =new Member();

 public void switchToSceneemployee(ActionEvent event) throws IOException {

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
 public void warelimembers(ActionEvent event) throws IOException  {
		
	try {	
		 int g = Integer.parseInt(idf.getText() );
	 allmm.setText(em.viewMemberInfo(g));
	}
	 catch (Exception e) {

			System.out.println("error");

		}
	
	}
 public void alll(ActionEvent event) throws IOException  {
		
		try {	
			 
		 We.setText(s.viewMembersInfo());
		}
		 catch (Exception e) {

				System.out.println("error");

			}
		
		}
}
package application;

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



public class Addmem {

	@FXML
	private TextField Mname;
	@FXML
	private TextField Mgender;
	@FXML
	private TextField Mphone;
	@FXML
	private TextField Mattend;
	@FXML
	private TextField Mship;
	@FXML
	private TextField Mname2;
	@FXML
	private TextField Mgender2;
	@FXML
	private TextField Mphone2;
	@FXML
	private TextField Mattend2;
	@FXML
	private TextField Mms;
	@FXML
	private TextField Banidd;
	@FXML
	private TextField Mid;
	@FXML
	private TextField Newid;
	@FXML
	private Label L1;
	@FXML
	private Label L2;
	@FXML
	private Label L3;
	@FXML
	private Label Lban;
	@FXML
	private TextField Mid2;
	static ArrayList<String> banidss = new ArrayList<String>();

 private Stage stage;

 private Scene scene;

 private Parent root;

 Employee empo = new Employee();
 


 public void switchToScene1(ActionEvent event) throws IOException {

  root = FXMLLoader.load(getClass().getResource("Fxml3.fxml"));

  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

  scene = new Scene(root);

  stage.setScene(scene);

  stage.show();

 }
 public void addyaba(ActionEvent event) throws IOException  {
	 try {
		 String t =Mname.getText();
		 if(banidss.contains(t)){
		 	
		 	
		 	throw new Banexception("he is banned");
		 }
		 else
		
		 {
		 int g = Integer.parseInt(Mgender.getText() );
		  int mss = Integer.parseInt(Mship.getText() );

			
		  empo.addMember(g, mss, Mname.getText(), Mphone.getText(), Mattend.getText());
			
		  L1.setText("Member has been add :)");
		}
	 }
		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			L1.setText("enter only numbers plz)");
		}
	 catch (Banexception e) {

			System.out.println("error");
			L1.setText(e.getMessage());
		}

		catch (Exception e) {

			System.out.println("error");

		}

		

			
	
	}
 public void edityaba(ActionEvent event) throws IOException  {
	 try {
		 
		 int r = Integer.parseInt(Mid.getText() );
		 int f = Integer.parseInt(Newid.getText() );


		 int g = Integer.parseInt(Mgender2.getText() );
		  int mss = Integer.parseInt(Mms.getText() );

			
		  empo.editMember(r, mss, Mname2.getText(),f, g, Mphone2.getText(), Mattend2.getText());
			
		  L2.setText("Member has been edited :)");
		}

		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			 L2.setText("enter only numbers plz)");
		}

	 catch (Exception e) {

			System.out.println("error");

		}

		

			
	
	}
 public void deleteyaba(ActionEvent event) throws IOException  {
	 try {
		 
		 int r = Integer.parseInt(Mid2.getText() );
		
			
		  empo.deleteMember(r);
			
		  L3.setText("Member has been deleted ):");
		}

		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			 L3.setText("enter only numbers plz)");
		}

	 catch (Exception e) {

			System.out.println("error");

		}


		

			
	
	}
 public void Banyaba(ActionEvent event) throws IOException  {
	 try {
		 
		
		
		String s= Banidd.getText();
		  
			banidss.add(s);
		  Lban.setText("member banned");
		}

		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			 Lban.setText("enter only numbers plz)");
		}

	 catch (Exception e) {

			System.out.println("error");
			Lban.setText("error");
		}
 }
 
 
 
}

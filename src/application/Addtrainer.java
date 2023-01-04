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



public class Addtrainer {



 private Stage stage;

 private Scene scene;

 private Parent root;
 @FXML
	private TextField Taname;
	@FXML
	private TextField Taphone;
	@FXML
	private TextField Tagender;
	@FXML
	private TextField Tnat;
	@FXML
	private TextField Aname2;
	@FXML
	private TextField Aphone2;
	@FXML
	private TextField Agender2;
	@FXML
	private TextField Select;
	@FXML
	private TextField Select1;
	@FXML
	private TextField Select2;
	@FXML
	private TextField Select3;
	@FXML
	private TextField Anewid;
	@FXML
	private TextField Anat2;
	@FXML
	private TextField Selectban;
	@FXML
	private Label La;
	@FXML
	private Label La2;
	@FXML
	private Label La3;
	@FXML
	private Label La4;
	@FXML
	private Label Lban;
	static ArrayList<String> banids = new ArrayList<String>();
 
	admin empo = new admin();
 public void switchToScene1(ActionEvent event) throws IOException {

  root = FXMLLoader.load(getClass().getResource("Fxml2.fxml"));

  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

  scene = new Scene(root);

  stage.setScene(scene);

  stage.show();

 }
 public void addyaba(ActionEvent event) throws IOException   {
	
	 try {
		 String t =Tnat.getText();
if(banids.contains(t)){
	
	
	throw new Banexception("he is banned");
}
else
	{int g = Integer.parseInt(Tagender.getText() );
		 

			
		  empo.addTrainer(g, Taname.getText(),Taphone.getText(),Tnat.getText());
			
		  La.setText("Trainer added :)");
		}
	 }
		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			La.setText("enter only numbers plz)");
		}
	 catch (Banexception e) {

			System.out.println("error");
			La.setText(e.getMessage());
		}

		catch (Exception e) {

			System.out.println("error");

		}
	
 }
	 public void edityaba(ActionEvent event) throws IOException  {
		 try {
			 
			 int r = Integer.parseInt(Select.getText() );
			 int f = Integer.parseInt(Anewid.getText() );


			 int g = Integer.parseInt(Agender2.getText() );
			  

				
			  empo.editTrainer(g, Aname2.getText(), f, r, Anat2.getText(), Aphone2.getText());
				
			  La2.setText("trainer has been edited :)");
			}

			catch (NumberFormatException e){

				System.out.println("enter only numbers plz");
				 La2.setText("enter only numbers plz)");
			}

		 catch (Exception e) {

				System.out.println("error");

			}
	 }
	 
	 public void deleteyaba(ActionEvent event) throws IOException  {
		 try {
			 
			 int r = Integer.parseInt(Select1.getText() );
			
				
			  empo.deleteTrainer(r);
				
			  La3.setText("trainer has been deleted ):");
			}

			catch (NumberFormatException e){

				System.out.println("enter only numbers plz");
				 La3.setText("enter only numbers plz)");
			}

		 catch (Exception e) {

				System.out.println("error");
				La3.setText("error");
			}


			

				
		
		}
	 public void assign(ActionEvent event) throws IOException  {
		 try {
			 
			 int r = Integer.parseInt(Select3.getText() );
			 int mid = Integer.parseInt(Select2.getText() );
			
				
			  empo.assignTrainerToMember(mid, r);
				
			  La4.setText("Assigned enshallah (:");
			}

			catch (NumberFormatException e){

				System.out.println("enter only numbers plz");
				 La4.setText("enter only numbers plz)");
			}

		 catch (Exception e) {

				System.out.println("error");
				La4.setText("error assigned");

			}


			

				
		
		}
	 public void Banyaba(ActionEvent event) throws IOException  {
		 try {
			 
			
			
			String s= Selectban.getText();
			  
				banids.add(s);
			  Lban.setText("trainer banned");
			}

			catch (NumberFormatException e){

				System.out.println("enter only numbers plz");
				 La3.setText("enter only numbers plz)");
			}

		 catch (Exception e) {

				System.out.println("error");
				Lban.setText("error");
			}
	 }

	 
}

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



public class Classesoooo {

////////admin

 private Stage stage;

 private Scene scene;

 private Parent root;
 @FXML
	private TextField Cid;
	@FXML
	private TextField Cc;
	@FXML
	private TextField Cd;
	@FXML
	private TextField Cid1;
	@FXML
	private TextField Cid2;
	@FXML
	private TextField Cc1;
	@FXML
	private TextField Cd1;
	@FXML
	private TextField ned;
	@FXML
	private TextField Selecto;
	@FXML
	private TextField Selecto1;
	@FXML
	private TextField Selecto2;
	@FXML
	private TextField Selecto5;
	
	@FXML
	private Label Lo;
	@FXML
	private Label Lo1;
	@FXML
	private Label Lo2;
	@FXML
	private Label Lo3;
	@FXML
	private Label Lo4;
 
admin em=new admin();
 public void switchToScene1(ActionEvent event) throws IOException {

  root = FXMLLoader.load(getClass().getResource("Fxml2.fxml"));

  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

  scene = new Scene(root);

  stage.setScene(scene);

  stage.show();

 }
 public void openyaba(ActionEvent event) throws IOException  {
	 try {

		 int g = Integer.parseInt(Cc.getText() );
		  int mss = Integer.parseInt(Cid.getText() );

			
		  em.openClass(g, mss, Cd.getText());
			
		  Lo.setText("class opened :)");
		}

		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			Lo.setText("enter only numbers plz)");
		}

		catch (Exception e) {

			System.out.println("error");

		}

		
 }
 public void edityaba(ActionEvent event) throws IOException  {
	 try {

		 int se = Integer.parseInt(Selecto.getText() );
		  int no = Integer.parseInt(Cid2.getText() );
		  int cap = Integer.parseInt(Cc1.getText() );
		  int ido = Integer.parseInt(ned.getText() );

			
		  em.editClass(se,no, cap, ido, Cd1.getText());
			
		  Lo1.setText("class edited :)");
		}

		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			Lo1.setText("enter only numbers plz)");
		}

		catch (Exception e) {

			System.out.println("error");

		}

		
 }
 public void deleteyaba(ActionEvent event) throws IOException  {
	 try {
		 
		 int r = Integer.parseInt(Cid1.getText() );
		
			
		  em.deleteClass(r);
			
		  Lo2.setText("class has been deleted ):");
		}

		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			 Lo2.setText("enter only numbers plz)");
		}

	 catch (Exception e) {

			System.out.println("error");

		}
		
	
	}
 public void viewspecific(ActionEvent event) throws IOException  {
	 try {
		 
		 int r = Integer.parseInt(Selecto5.getText() );
		
			
			
		  Lo3.setText(em.viewClassMembers(r));
		}

		catch (NumberFormatException e){

			System.out.println("enter only numbers plz");
			 Lo3.setText("enter only numbers plz)");
		}

	 catch (Exception e) {

			System.out.println("error");

		}
 }
	 public void assign(ActionEvent event) throws IOException  {
		 try {
			 
			 int c = Integer.parseInt(Selecto1.getText() );
			 int t = Integer.parseInt(Selecto2.getText() );
			
				
			  em.assignTrainerToClass(c, t);
				
			  Lo4.setText("assigned inshallah");
			}

			catch (NumberFormatException e){

				System.out.println("enter only numbers plz");
				 Lo4.setText("enter only numbers plz)");
			}

		 catch (Exception e) {

				System.out.println("error");

			}
		
	
	}
 
}

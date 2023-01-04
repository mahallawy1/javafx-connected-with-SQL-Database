package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class aview2  implements Initializable{

    @FXML
    private TableColumn<Filme,String> col_email;

    @FXML
    private TableColumn<Filme,String> col_id;

    @FXML
    private TableColumn<Filme, String> col_password;

    @FXML
    private TableColumn<Filme,String> col_type;

    @FXML
    private TableColumn<Filme,String>col_username;

    @FXML
    private TextField filterField;

    @FXML
    private TableView<Filme> table_users;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_password;

    @FXML
    private TextField txt_type;

    @FXML
    private TextField txt_username;
    private Stage stage;

    private Scene scene;

    private Parent root;
    	
    	

   private ObservableList<Filme> listM;
   private ObservableList<Filme> dataList;
    
   
    
    int index = -1;
    
    Connection conn =null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {    
    	
    	 Connection dbConnection = null;
    	    
    	    {
    	    try {
    	    	String url = "jdbc:mysql://localhost:3306/cinema";
    		      Properties info = new Properties();
    		      info.put("user", "root");
    		      info.put("password", "root");

    		      dbConnection = DriverManager.getConnection(url, info);
    		    conn=dbConnection;
    		      if (dbConnection != null) {
    		        System.out.println("Successfully connected to MySQL database test");
    		      }

    		    } catch (SQLException ex) {
    		      System.out.println("An error occurred while connecting MySQL databse");
    		      ex.printStackTrace();
    		    }
    	    }
    	    dataList=FXCollections.observableArrayList();
    	    load();
    	    setCallTable();
    	    
    }
    
    private void setCallTable() {
    	TableColumn<Filme, String> col_id = new TableColumn<>( "col_id" );
    	col_id.setCellValueFactory(
                new PropertyValueFactory<>( "cid" )
        );
    	TableColumn<Filme, String> col_username = new TableColumn<>( "col_username" );
    	col_username.setCellValueFactory(
                new PropertyValueFactory<>( "filmname" )
        );
    	TableColumn<Filme, String> col_password = new TableColumn<>( "col_password" );
    	col_password.setCellValueFactory(
                new PropertyValueFactory<>( "country" )
        );
    	TableColumn<Filme, String> col_email = new TableColumn<>( "col_email" );
        col_email.setCellValueFactory(
                new PropertyValueFactory<>( "released" )
        );
        TableColumn<Filme, String> col_type = new TableColumn<>( "col_type" );
        col_type.setCellValueFactory(
                new PropertyValueFactory<>( "language" )
        );
 
   	 

   }
    
private void load() {
	try {

	pst=conn.prepareStatement("SELECT * FROM film");
	rs=pst.executeQuery();
	System.out.println("                                          ");
	System.out.println("                                          ");
	System.out.println("                                          ");

	System.out.println("filmname country  released year    language    crew id");
	System.out.println("----------------------------------------------------------------------------------");
	while(rs.next()) {
    	System.out.println(rs.getString(1)+"    |"+rs.getString(2)+"   |"+rs.getString(3)+"       |"+rs.getString(4)+"       |"+rs.getString(5));
		dataList.add(new Filme(rs.getString("filmname"), rs.getString("country"), rs.getString("released year"), rs.getString("language"),""+ rs.getDouble("cid")));
		TableColumn<Filme, String> col_type = new TableColumn<>( "col_type" );
        col_type.setCellValueFactory(
                new PropertyValueFactory<>( "language" )
        );
	}
	}
	catch (SQLException ex) {
	      System.out.println("An error occurred while connecting MySQL databse");
	      ex.printStackTrace();
	    }
      catch (Exception e) {
      	System.out.println("Succe");
      	e.printStackTrace();
      }
	table_users.setItems(dataList);
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("                                          ");
	System.out.println("                                          ");
	System.out.println("                                          ");

    System.out.println("hi");

}
	 
public void switchTobacck(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("service.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

	 }
  

}
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
import javafx.scene.control.TextArea;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class query5  implements Initializable{
	
	private Stage stage;

	private Scene scene;

	private Parent root;
	  @FXML
	    private Label lol;
	@FXML
    private TextArea t11;
	  
	  @FXML
	    private TableColumn<?, ?> c1;


	 @FXML
	    private TableColumn<usra,String> q1;

	    @FXML
	    private TableColumn<usra,String> q2;

	    @FXML
	    private TableColumn<usra,String> q3;

	    @FXML
	    private TableColumn<usra,String> q4;

	    @FXML
	    private TableColumn<usra,String> q5;

	    @FXML
	    private TableColumn<usra,String> q6;

	    @FXML
	    private TableColumn<usra,String> q7;
	    @FXML
	    private TableView<usra> tata;

   private ObservableList<fname> dataList;
    
   
    
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
      //  q1.setCellValueFactory(cellData -> ((usra) cellData.getValue()).getFwatched());
    	TableColumn<usra, String> q1 = new TableColumn<>( "q1" );
    	q1.setCellValueFactory(
                new PropertyValueFactory<>("usrid")
        );
    	TableColumn<usra, String> q2 = new TableColumn<>( "q2" );
    	q2.setCellValueFactory(
                new PropertyValueFactory<>( "interest" )
        );
    	TableColumn<usra, String> q3 = new TableColumn<>( "q3" );
    	q3.setCellValueFactory(
                new PropertyValueFactory<>( "usercountry" )
        );
    	TableColumn<usra, String> q4 = new TableColumn<>( "q4" );
    	q4.setCellValueFactory(
                new PropertyValueFactory<>( "watched" )
        );
        TableColumn<usra, String> q5 = new TableColumn<>( "q5" );
        q5.setCellValueFactory(
                new PropertyValueFactory<>( "age" )
        );TableColumn<usra, String> q6 = new TableColumn<>( "q6" );
        q6.setCellValueFactory(
                new PropertyValueFactory<>( "nor" )
        );TableColumn<usra, String> q7 = new TableColumn<>( "q7" );
        q7.setCellValueFactory(
                new PropertyValueFactory<>( "fwatched" )
        );
        
   	 

   }
    
private void load() {
	try {

	pst=conn.prepareStatement("SELECT film.filmname FROM cinema.film,cinema.rate where (Ratingcomments='habby')AND(rate.filmname=film.filmname);");
	rs=pst.executeQuery();
	System.out.println("----------------");

	System.out.println("film names");
	System.out.println("----------------");

	while(rs.next()) {
    	System.out.println(rs.getString(1));
		dataList.add(new fname(rs.getString(1)));

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
	System.out.println("----------------------------------------------------------------------------------");

    System.out.println("hi");
    setCallTable();

}
public void switchTback(ActionEvent event) throws IOException {

	  root = FXMLLoader.load(getClass().getResource("chooseprop.fxml"));

	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();

	  scene = new Scene(root);

	  stage.setScene(scene);

	  stage.show();

}
}
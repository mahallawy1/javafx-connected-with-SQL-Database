module testa {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}

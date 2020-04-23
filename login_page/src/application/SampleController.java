package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SampleController {
	
	@FXML
	private TextField userText;
	
	@FXML
	private TextField password;
	
	@FXML
	void login(ActionEvent event) {
		Stage primaryStage = new Stage();
		if(userText.getText().equals("admin") && password.getText().equals("123"));
			try {
				Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
				Scene scene = new Scene(root,400,400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}


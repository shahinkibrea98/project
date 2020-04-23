package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController1 {

	public void generateRandom(ActionEvent event) {

		Random rand = new Random();
		int myrand = rand.nextInt(50);
		System.out.println(Integer.toString(myrand));

	}

	public void LEAPYEAR(ActionEvent even) {
		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR 2020");
		} else {
			System.out.println("COMMON YEAR");

		}

	}



}

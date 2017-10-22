package com.iota.iri.wallet;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class Wallet extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(event -> System.out.println("Hello World!"));
		StackPane root = new StackPane();
		root.getChildren().add(btn);

		Scene scene = new Scene(root, 640, 800);

		primaryStage.setTitle("IOTA Wallet");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

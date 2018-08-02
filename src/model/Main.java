package model;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application  implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4059043301321459891L;
	private static Stage primaryStage;
	public static Stage addDialogStage;
	public static Users user;
	
	public Main() {

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Main.primaryStage=primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
		Scene scene = new Scene(root);
		scene.setRoot(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);

	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public static void mainview() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/view/main.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}

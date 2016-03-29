/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package galacticemperor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Andrew
 */
public class GalacticEmperor extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		TableView orbitingBodiesTable = new TableView();
		
		StackPane root = new StackPane();
		root.getChildren().add(orbitingBodiesTable);
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setTitle("Orbiting Bodies");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * The main() method is ignored in correctly deployed JavaFX application.
	 * main() serves only as fallback in case the application can not be
	 * launched through deployment artifacts, e.g., in IDEs with limited FX
	 * support. NetBeans ignores main().
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}

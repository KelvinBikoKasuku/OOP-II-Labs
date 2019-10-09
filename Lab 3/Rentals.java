import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Rentals extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
		//step 1: create label Customer
		Text text1= new Text("Customer: ");
		
		//step 2: create label Genre
		Text text2 = new Text("Genre: ");
		
		// create new label Movies
		Text text3 = new Text("Movies: ");
		
		// create new label Borrowed
		Text text4 = new Text("Borrowed: ");
		
		//create new label Returned
		Text text5 = new Text("Returned: ");
		
		//create Combo Box for Customer
		ComboBox comboBox1 = new ComboBox();
		
		//create Combo Box for Genre
		ComboBox comboBox2 = new ComboBox();
		
		//create Combo Box for Movies
		ComboBox comboBox3 = new ComboBox();
		
		//create Combo Box for Borrowed
		ComboBox comboBox4 = new ComboBox();
		
		//create Combo Box for Returned
		ComboBox comboBox5 = new ComboBox();
		
		
		//step 5: create buttons
		Button button1 = new Button("Save Rental");
		Button button2 = new Button("Return Movie");
		
		//step 6: creating a Grid Pane and Import relevant classes
		GridPane gp = new GridPane();
		
		//step 7: Set up size for the pane
		gp.setMinSize(600, 400);
		
		//step 8: set padding
		gp.setPadding(new Insets(10,10,10,10));
		
		//step 9:Set the vertical and horizontal gaps between the columns
		gp.setVgap(10);
		gp.setHgap(10);
		
		//step 10 Set the grid alignment
		gp.setAlignment(Pos.CENTER);
		
		//step 11: Arrange all the nofes in the grid
		gp.add(text1, 0, 0);
		gp.add(comboBox1, 1, 0);
		
		gp.add(text2, 0, 2);
		gp.add(comboBox2, 1, 2);
		
		gp.add(text3, 0, 3);
		gp.add(comboBox3, 1, 3);
		gp.add(button1, 1, 4);
		
		gp.add(text4, 0, 5);
		gp.add(comboBox4, 1, 5);
		
		gp.add(button2, 1, 6);
		
		gp.add(text5, 0, 7);
		gp.add(comboBox5, 1, 7);
		//step 12: Style nodes, be creative and add more styles
		button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size->l3pt;");
		button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size->l3pt;");
		
		text1.setStyle("-fx-font: normal bold 20px 'serif' ");
		text2.setStyle("-fx-font: normal bold 20px 'serif' ");
		text3.setStyle("-fx-font: normal bold 20px 'serif' ");
		text4.setStyle("-fx-font: normal bold 20px 'serif' ");
		text5.setStyle("-fx-font: normal bold 20px 'serif' ");
		gp.setStyle("-fx-background-color: BEIGE;");
		
		//Creating a scene object
		Scene scene = new Scene(gp);
		
		//Setting title to the stage
		stage.setTitle("Movie Library System");
		
		//Adding scene to the stage
		stage.setScene(scene);
		
		//Displaying the contents of the stage
		stage.show();
	}
	
	public static void main(String[] args){
		launch(args);
	}
}
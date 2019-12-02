/**
*<h1>Login</h1> 
 *This is the UI component of the program
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import java.io.File;
import java.sql.*; 
import java.util.*; 
import javafx.scene.control.Alert.AlertType;

public class Login extends Application implements Interface{
	/**
     * Builds the Scene
	 *
	 *@param	Stage	Needs empty stage to set scene in
	 *@return 	void	none
     */
	
	Connection conn = null;	
	String DB_URL = "jdbc:mysql://localhost:3306/library";   
	String USER = "root"; 
	String  PASS = ""; 
	
	@Override
	public void start(Stage stage) throws Exception{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected");
		}catch(ClassNotFoundException ex) {
				System.out.println("Error: unable to load driver class!");
				System.exit(1);
		}
		
		Text text1 = new Text("Student Library");
		Text text2= new Text("Student Number: ");
		Text text3 = new Text("Password: ");
		
		TextField textField1 = new TextField();
		PasswordField passwordField1 = new PasswordField();
	
		Button button1 = new Button("Log In");
		
		Alert errorAlert = new Alert(AlertType.ERROR);
		errorAlert.setTitle("Access Denied");
		errorAlert.setHeaderText(null);
		errorAlert.setContentText("Incorrect Username Or Password");
		
		GridPane gp = new GridPane();
		
		//Set up size for the pane
		gp.setMinSize(970, 450);
		
		//set padding
		gp.setPadding(new Insets(10,10,10,10));
		
		//Set the vertical and horizontal gaps between the columns
		gp.setVgap(10);
		gp.setHgap(10);
		
		//Set the grid alignment
		gp.setAlignment(Pos.CENTER);
		
		//Arrange all the nofes in the grid
		gp.add(text1, 0, 0);

		gp.add(text2, 0, 5);
		gp.add(textField1, 1, 5);
		
		gp.add(text3, 0, 6);
		gp.add(passwordField1, 1, 6);
		
		gp.add(button1, 1, 7);
		
		BackgroundImage myBI= new BackgroundImage(new Image("bg.jpg"),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		//then you set to your node
		gp.setBackground(new Background(myBI));

		
		//step 12: Style nodes, be creative and add more styles
		button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13px;");
		
		text1.setStyle("-fx-font: normal bold 40px 'serif' ");
		text2.setStyle("-fx-font: normal bold 20px 'serif' ");
		text3.setStyle("-fx-font: normal bold 20px 'serif' ");
		
		//Creating a scene object
		Scene scene = new Scene(gp);
		
		//Setting title to the stage
		stage.setTitle("Library Login System");
		
		//Adding scene to the stage
		stage.setScene(scene);
		
		//Displaying the contents of the stage
		stage.show();

		//Welcome scene
		
		Text text4 = new Text("Welcome");
		Button button2 = new Button("Log Out");
		
		GridPane gp2 = new GridPane();
		
		gp2.setMinSize(970, 450);
		
		gp2.setPadding(new Insets(10,10,10,10));
		
		gp2.setVgap(10);
		gp2.setHgap(10);
		
		gp2.setAlignment(Pos.CENTER);
		
		gp2.add(text4, 0, 0);
		gp2.add(button2, 1, 7);

		button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13px;");
		text4.setStyle("-fx-font: normal bold 40px 'serif' ");
		gp2.setBackground(new Background(myBI));

		Scene scene2 = new Scene(gp2);
		
		//Login button event handler
		EventHandler<MouseEvent> eventHandler = new  EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent e){
				
				try{
					PreparedStatement ps;
					ResultSet rs;
					String uname = textField1.getText();
					String pass = passwordField1.getText();
        
					String query = "SELECT * FROM `students` WHERE `StudentId` =? AND`Password` =?";
			
					ps = conn.prepareStatement(query);
            
					ps.setString(1, uname);
					ps.setString(2, pass);
            
					rs = ps.executeQuery();
					
					
					if(rs.next()){
						stage.setScene(scene2);
						textField1.clear();
						passwordField1.clear();
						
						System.out.println("Accepted");
					}else{
						errorAlert.showAndWait();
						System.out.println("Incorrect Username Or Password");
					}
				}catch(SQLException se){
				  se.printStackTrace();
			  }
			}
			
		};
		button1.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler);
		
		//Logout button event handler
		EventHandler<MouseEvent> eventHandler2 = new  EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent e){
				stage.setScene(scene);
			}
		};
		button2.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler2);
		
	}
	
	/* public static void main(String[] args){
		launch(args);
	}*/
	
	/**
     * Runs the UI
	 *
	 *@return 	void	none
     */
	
	@Override
		public void animation(){
			launch();
		}
}
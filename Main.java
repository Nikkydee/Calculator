package HealthApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static javafx.scene.input.KeyCode.T;

public class Main extends Application {

    Stage window;




    public static void main(String[] args)
    {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
       window = primaryStage;
       window .setTitle("Nikki HealthApp");
       //window.setScene(new Scene(root, 300, 275));

        GridPane grid = new GridPane();
        grid. setPadding ( new Insets ( 10,10,10,10 ) );
        grid.setVgap ( 8 );
        grid.setHgap(10);

        //Creating a username label
        Label nameLabel = new Label ("Username:");
        GridPane.setConstraints (nameLabel, 0,0  );

        //creating a name input field
        TextField nameInput = new TextField("Enter name");
        GridPane.setConstraints (nameInput, 1,0  );

        //Creating a password label
        Label passLabel = new Label ("Password:");
        GridPane.setConstraints (passLabel, 0,1  );

        //creating a password input field
        TextField passInput = new TextField();
        passInput.setPromptText ( "password" );
        GridPane.setConstraints ( passInput,1,1 );

        //add a button
        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1,2);

        grid.getChildren ().addAll ( nameLabel,nameInput,passLabel,passInput,loginButton);

        Scene scene = new Scene(grid,300,200);
        window.setScene(scene);

        window .show();
    }
}

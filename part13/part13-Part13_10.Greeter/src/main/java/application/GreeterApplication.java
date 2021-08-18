package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label instructions = new Label("Enter your name to start");
        TextField input = new TextField("");
        Button action = new Button("Start");
        Label error = new Label("");

        GridPane layout = new GridPane();
        layout.add(instructions, 0, 0);
        layout.add(input, 0, 1);
        layout.add(action, 0, 2);
        layout.add(error, 0, 3);

        layout.setVgap(10);
        layout.setHgap(10);
        layout.setAlignment(Pos.CENTER);
        layout.setPrefSize(400, 400);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene firstScreen = new Scene(layout);

        Label welcomeLabel = new Label("");
        GridPane welcomeLayout = new GridPane();
        welcomeLayout.add(welcomeLabel, 0, 0);

        welcomeLayout.setVgap(10);
        welcomeLayout.setHgap(10);
        welcomeLayout.setAlignment(Pos.CENTER);
        welcomeLayout.setPrefSize(400, 400);
        welcomeLayout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene secondScreen = new Scene(welcomeLayout);

        action.setOnAction((event) -> {
            if (input.getText().isEmpty()) {
                error.setText("Text field is empty, try again");
                return;
            }
            String name = input.getText();
            welcomeLabel.setText("Welcome " + name + "!");
            stage.setScene(secondScreen);
        });
        stage.setScene(firstScreen);
        stage.show();
    }
}
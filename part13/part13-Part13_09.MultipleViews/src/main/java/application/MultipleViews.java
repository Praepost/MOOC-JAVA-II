package application;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
        public void start(Stage window) throws Exception {
        Label firstLabel = new Label("First view!");
        Button firstButton = new Button("To the second view!");
        BorderPane firstBorderPane = new BorderPane();
        firstBorderPane.setTop(firstLabel);
        firstBorderPane.setCenter(firstButton);
        
        
        VBox vBox = new VBox();
        Button secondButtonNext = new Button("To the third view!");
        Label secondText = new Label("Second view!");
        vBox.getChildren().addAll(secondButtonNext, secondText);
        
        GridPane gridPane = new GridPane();
        Button thirdButtonNext = new Button("To the first view!");
        Label thirdText = new Label("Third View");
        gridPane.add(thirdText, 0, 0);
        gridPane.add(thirdButtonNext, 1, 1);
        
        Scene first = new Scene(firstBorderPane);
        Scene second = new Scene(vBox);
        Scene third = new Scene(gridPane);
        
        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });
        
        secondButtonNext.setOnAction((event) -> {
            window.setScene(third);
        });
        
        thirdButtonNext.setOnAction((event) -> {
            window.setScene(first);
        });
    
        window.setScene(first);
        window.show();
    }
}

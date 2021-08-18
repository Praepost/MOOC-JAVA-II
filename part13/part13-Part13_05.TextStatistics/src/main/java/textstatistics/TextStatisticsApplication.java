package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane borderPane = new BorderPane();
        HBox horizontalBox = new HBox();
        
        horizontalBox.setSpacing(10);
        horizontalBox.getChildren().add(new Label("Letters: 0"));
        horizontalBox.getChildren().add(new Label("Words: 0"));
        horizontalBox.getChildren().add(new Label("The longest word is: "));
        
        borderPane.setCenter(new TextArea(""));
        borderPane.setBottom(horizontalBox);
        
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
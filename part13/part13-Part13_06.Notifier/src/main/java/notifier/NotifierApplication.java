package notifier;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    public void start(Stage window) throws Exception {
        TextField textField = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event) ->
        {
            label.setText(textField.getText());
        });
        
        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField,button,label);
        
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

}

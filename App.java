import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    
    private int count = 0;
    private Label countLabel;
    
    @Override
    public void start(Stage stage) {
        // create the controls
        countLabel = new Label("Count: 0");
        TextField countField = new TextField();
        Button countButton = new Button("Click to Count");
        
        // set the event handler for the button
        countButton.setOnAction(e -> {
            count++;
            countLabel.setText("Count: " + count);
            countField.setText(Integer.toString(count));
        });
        
        // add the controls to a layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(countLabel, countField, countButton);
        
        // create and show the scene
        Scene scene = new Scene(layout, 250, 150);
        stage.setScene(scene);
        stage.setTitle("Counting Program");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

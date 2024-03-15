import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CanvasExample extends Application {

    @Override
    public void start(Stage stage) {
        // create a canvas
        Canvas canvas = new Canvas(300, 200);

        // get the graphics context
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // set the fill color
        gc.setFill(Color.RED);

        // draw a rectangle
        gc.fillRect(50, 50, 200, 100);

        // create the root layout
        StackPane root = new StackPane(canvas);

        // create the scene and show the stage
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Draw Rectangle Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

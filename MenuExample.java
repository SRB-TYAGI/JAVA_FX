import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();

        MenuBar menuBar = new MenuBar();

        Menu menuFile = new Menu("File");

        Menu menuNew = new Menu("New");
        MenuItem menuItemProject = new MenuItem("Project");
        MenuItem menuItemFile = new MenuItem("File");
        menuNew.getItems().addAll(menuItemProject, menuItemFile);

        Menu menuOpen = new Menu("Open");
        MenuItem menuItemFolder = new MenuItem("Folder");
        MenuItem menuItemFile2 = new MenuItem("File");
        menuOpen.getItems().addAll(menuItemFolder, menuItemFile2);

        menuFile.getItems().addAll(menuNew, menuOpen);

        menuBar.getMenus().add(menuFile);

        root.setTop(menuBar);


        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Menu Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

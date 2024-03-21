import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentAttendanceTrackingSystem extends Application {

    private ObservableList<String> classes = FXCollections.observableArrayList("Class A", "Class B", "Class C");
    private ObservableList<String> studentsClassA = FXCollections.observableArrayList("John", "Mary", "Peter");
    private ObservableList<String> studentsClassB = FXCollections.observableArrayList("Alice", "Bob", "Charlie");
    private ObservableList<String> studentsClassC = FXCollections.observableArrayList("David", "Eva", "Frank");

    @Override
    public void start(Stage primaryStage) {

        // Create a grid pane
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        // Create controls
        Label lblClass = new Label("Class:");
        ComboBox<String> cmbClass = new ComboBox<>(classes);
        Label lblStudent = new Label("Student:");
        ComboBox<String> cmbStudent = new ComboBox<>();
        Label lblDate = new Label("Date:");
        TextField txtDate = new TextField();
        Button btnMarkAttendance = new Button("Mark Attendance");

        // Add controls to grid
        grid.add(lblClass, 0, 0);
        grid.add(cmbClass, 1, 0);
        grid.add(lblStudent, 0, 1);
        grid.add(cmbStudent, 1, 1);
        grid.add(lblDate, 0, 2);
        grid.add(txtDate, 1, 2);
        grid.add(btnMarkAttendance, 1, 3);

        // Event handler for class selection
        cmbClass.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (cmbClass.getValue() == null) {
                    cmbStudent.getItems().clear();
                } else if (cmbClass.getValue().equals("Class A")) {
                    cmbStudent.setItems(studentsClassA);
                } else if (cmbClass.getValue().equals("Class B")) {
                    cmbStudent.setItems(studentsClassB);
                } else if (cmbClass.getValue().equals("Class C")) {
                    cmbStudent.setItems(studentsClassC);
                }
            }
        });

        // Event handler for attendance marking
        btnMarkAttendance.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String selectedClass = cmbClass.getValue();
                String selectedStudent = cmbStudent.getValue();
                String date = txtDate.getText();
                System.out.println(selectedStudent + " in " + selectedClass + " marked as present on " + date);
            }
        });

        // Set the scene
        Scene scene = new Scene(grid, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
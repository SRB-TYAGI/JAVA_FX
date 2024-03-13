// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.TextField;
// import javafx.scene.layout.GridPane;
// import javafx.stage.Stage;

// public class Calculator extends Application {
//     private TextField textField;

//     @Override
//     public void start(Stage stage) {
//         // Create a GridPane for the calculator layout
//         GridPane gridPane = new GridPane();
//         gridPane.setAlignment(Pos.CENTER);
//         gridPane.setHgap(10);
//         gridPane.setVgap(10);
//         gridPane.setPadding(new Insets(10, 10, 10, 10));

//         // Create the text field for displaying the result
//         textField = new TextField();
//         textField.setAlignment(Pos.CENTER_RIGHT);
//         textField.setEditable(false);
//         textField.setPrefSize(200, 30);
//         gridPane.add(textField, 0, 0, 4, 1);

//         // Create buttons for digits and operations
//         Button btn0 = new Button("0");
//         Button btn1 = new Button("1");
//         Button btn2 = new Button("2");
//         Button btn3 = new Button("3");
//         Button btn4 = new Button("4");
//         Button btn5 = new Button("5");
//         Button btn6 = new Button("6");
//         Button btn7 = new Button("7");
//         Button btn8 = new Button("8");
//         Button btn9 = new Button("9");
//         Button btnAdd = new Button("+");
//         Button btnSubtract = new Button("-");
//         Button btnMultiply = new Button("*");
//         Button btnDivide = new Button("/");
//         Button btnModulus = new Button("%");

//         // Add the buttons to the gridPane
//         gridPane.add(btn7, 0, 1);
//         gridPane.add(btn8, 1, 1);
//         gridPane.add(btn9, 2, 1);
//         gridPane.add(btnDivide, 3, 1);
//         gridPane.add(btn4, 0, 2);
//         gridPane.add(btn5, 1, 2);
//         gridPane.add(btn6, 2, 2);
//         gridPane.add(btnMultiply, 3, 2);
//         gridPane.add(btn1, 0, 3);
//         gridPane.add(btn2, 1, 3);
//         gridPane.add(btn3, 2, 3);
//         gridPane.add(btnSubtract, 3, 3);
//         gridPane.add(btn0, 0, 4);
//         gridPane.add(btnModulus, 1, 4);
//         gridPane.add(new Button(), 2, 4);
//         gridPane.add(btnAdd, 3, 4);

//         // Set action handlers for the buttons
//         btn0.setOnAction(new NumberButtonHandler("0"));
//         btn1.setOnAction(new NumberButtonHandler("1"));
//         btn2.setOnAction(new NumberButtonHandler("2"));
//         btn3.setOnAction(new NumberButtonHandler("3"));
//         btn4.setOnAction(new NumberButtonHandler("4"));
//         btn5.setOnAction(new NumberButtonHandler("5"));
//         btn6.setOnAction(new NumberButtonHandler("6"));
//         btn7.setOnAction(new NumberButtonHandler("7"));
//         btn8.setOnAction(new NumberButtonHandler("8"));
//         btn9.setOnAction(new NumberButtonHandler("9"));
//         btnAdd.setOnAction(new OperationButtonHandler("+"));
//         btnSubtract.setOnAction(new OperationButtonHandler("-"));
//         btnMultiply.setOnAction(new OperationButtonHandler("*"));
//         btnDivide.setOnAction(new OperationButtonHandler("/"));
//         btnModulus.setOnAction(new OperationButtonHandler("%"));

//         // Create a scene and add the gridPane to it
//         Scene scene = new Scene(gridPane, 220, 250);

//         // Set the scene on the stage and show the stage
//         stage.setScene(scene);
//         stage.setTitle("Calculator");
//         stage.show();
//     }

//     // Handler for number buttons
//     private class NumberButtonHandler implements EventHandler<ActionEvent> {
//         private String digit;

//         public NumberButtonHandler(String digit) {
//             this.digit = digit;
//         }

//         @Override
//         public void handle(ActionEvent actionEvent) {
//             textField.setText(textField.getText() + digit);
//         }
//     }

//     // Handler for operation buttons
//     private class OperationButtonHandler implements EventHandler<ActionEvent> {
//         private String operator;

//         public OperationButtonHandler(String operator) {
//             this.operator = operator;
//         }

//         @Override
//         public void handle(ActionEvent actionEvent) {
//             try {
//                 double leftOperand = Double.parseDouble(textField.getText());
//                 textField.clear();
//                 switch (operator) {
//                     case "+":
//                         textField.setText(String.valueOf(leftOperand + Double.parseDouble(textField.getText())));
//                         break;
//                     case "-":
//                         textField.setText(String.valueOf(leftOperand - Double.parseDouble(textField.getText())));
//                         break;
//                     case "*":
//                         textField.setText(String.valueOf(leftOperand * Double.parseDouble(textField.getText())));
//                         break;
//                     case "/":
//                         double rightOperand = Double.parseDouble(textField.getText());
//                         if (rightOperand == 0) {
//                             throw new ArithmeticException("Divide by zero error");
//                         }
//                         textField.setText(String.valueOf(leftOperand / rightOperand));
//                         break;
//                     case "%":
//                         textField.setText(String.valueOf(leftOperand % Double.parseDouble(textField.getText())));
//                         break;
//                 }
//             } catch (NumberFormatException ex) {
//                 textField.setText("Error: Invalid input");
//             } catch (ArithmeticException ex) {
//                 textField.setText("Error: Divide by zero");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }

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

public class Calculator extends Application {

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
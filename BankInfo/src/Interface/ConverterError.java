package Interface;/**
 * Created by Admin on 23.06.2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ConverterError {

    public static void start1(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(20));

        Scene scene = new Scene(gridPane, 200, 150);

        Label label = new Label("Початкова і кінцева\n валюта збігаються");
        label.setFont(Font.font("Colibri", 16));
        gridPane.add(label, 0, 0);

        Button button = new Button("ok");
        button.setMinWidth(100);
        gridPane.add(button, 0, 1);

        primaryStage.setTitle("Помилка");
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });

    }

}

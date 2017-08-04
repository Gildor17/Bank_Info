package Interface;/**
 * Created by Admin on 19.06.2017.
 */

import BankInfo.*;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LogInWindow extends Application {

    @Override
    public void start(Stage primaryStage) {

        AddLoan.addAvailableLoans();
        AddLoan.addCurrentLoans();
        AddUsers.addUsers();

        BankInfo.currentLoans = AddUsers.getUsers().get(0).getCurrentLoans();
        BankInfo.availableLoans = AddUsers.getUsers().get(0).getAvailableLoans();

        GridPane grid1 = new GridPane();
        grid1.setAlignment(Pos.CENTER);
        grid1.setVgap(10);
        grid1.setHgap(10);
        grid1.setPadding(new Insets(15));

        Scene scene1 = new Scene(grid1, 350, 200);

        Text topText = new Text("Введіть дані для входу");
        topText.setFont(Font.font("Colibri", 18));
        grid1.add(topText, 0, 0, 2,1);

        Label labelUser = new Label("Логін");
        labelUser.setFont(Font.font("Colibri", 16));
        grid1.add(labelUser, 0, 1);

        TextField labelUserInput = new TextField();
        grid1.add(labelUserInput, 1, 1);

        Label labelPassword = new Label("Пароль");
        labelPassword.setFont(Font.font("Colibri", 16));
        grid1.add(labelPassword, 0, 2);

        PasswordField labelPasswordInput = new PasswordField();
        grid1.add(labelPasswordInput, 1, 2);

        Button button1 = new Button("Вхід");
        grid1.add(button1, 1, 3);

        primaryStage.setTitle("Вікно входу");
        primaryStage.setScene(scene1);
        primaryStage.show();

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                boolean check = false;

                for (int i = 0; i < AddUsers.getUsers().size(); i++) {
                    if (AddUsers.getUsers().get(i).getLogin().equals(labelUserInput.getText())&&AddUsers.getUsers().get(i).getPassword().equals(labelPasswordInput.getText())) {
                        BankInfo.currentLoans = AddUsers.getUsers().get(i).getCurrentLoans();
                        BankInfo.availableLoans = AddUsers.getUsers().get(i).getAvailableLoans();
                        BankInfo.userNumber = i;
                        check = true;
                    }
                }

                if (check==true) {
                    BankInfo.start(primaryStage);
                } else {
                    Stage secondaryStage = new Stage();
                    LoginError.start1(secondaryStage);
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}

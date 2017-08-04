package Interface;/**
 * Created by Gildor on 21.06.2017.
 */

import BankInfo.*;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BankInfo {

    public static final ObservableList currentLoansBox = FXCollections.observableArrayList();
    public static final ObservableList availableLoansBox = FXCollections.observableArrayList();

    public static int userNumber;

    public static ArrayList currentLoans;
    public static ArrayList availableLoans;

    public static void start (Stage primaryStage) {

//        availableLoansBox.addAll("Легкий", "Екстра 1", "Екстра 2", "Оптимальний");
//        currentLoansBox.addAll("Легкий");

//        for (int i = 0; i < AddUsers.getUsers().size(); i++) {
//            currentLoansBox.add(currentLoans.get(i).);
//        }

        for (int i = 0; i < AddUsers.getUsers().get(userNumber).getCurrentLoans().size(); i++) {
            currentLoansBox.add(AddUsers.getUsers().get(userNumber).getCurrentLoans().get(i).getName());
        }

        for (int i = 0; i < AddUsers.getUsers().get(userNumber).getAvailableLoans().size(); i++) {
            availableLoansBox.add(AddUsers.getUsers().get(userNumber).getAvailableLoans().get(i).getName());
        }


        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(20));

        Scene scene = new Scene(gridPane, 900, 350);

        Button converterButton = new Button("Конвертер валют");
        gridPane.add(converterButton, 0, 5, 2, 1);

        Label currentLoan = new Label("список поточних позик");
        gridPane.add(currentLoan, 0,0);

        ComboBox spisokCurrentLoan = new ComboBox(currentLoansBox);
        spisokCurrentLoan.setMinWidth(120);
        gridPane.add(spisokCurrentLoan, 1, 0);

        Button showInfoCurrentLoan = new Button("Вивести інформацію");
        gridPane.add(showInfoCurrentLoan, 1, 1);

        Label availableLoans = new Label("список доступних позик");
        gridPane.add(availableLoans, 0, 2);

        ComboBox spisokAvailableLoans = new ComboBox(availableLoansBox);
        spisokAvailableLoans.setMinWidth(120);
        gridPane.add(spisokAvailableLoans, 1, 2);

        Button showInfoAvailableLoan = new Button("Вивести інформацію");
        gridPane.add(showInfoAvailableLoan, 1, 3);

/** Left Block End **/

        Separator separator1 = new Separator(Orientation.VERTICAL);
        GridPane.setConstraints(separator1, 2, 0);
        GridPane.setRowSpan(separator1, 8);
        gridPane.getChildren().add(separator1);

/** Current Loans block Start **/

        Text currentLoansInfo = new Text("Інформація про\nпоточні позики");
        currentLoansInfo.setFont(Font.font("Calibri", 16));
        gridPane.add(currentLoansInfo, 3, 0, 2, 1);

        Label curLoanSumLeft = new Label("сума боргу");
        gridPane.add(curLoanSumLeft, 3, 1);

        TextField curLoanSumLeftField = new TextField();
        curLoanSumLeftField.setMaxSize(60, 20);
        curLoanSumLeftField.setEditable(false);
        gridPane.add(curLoanSumLeftField, 4, 1);

        Label curLoanMonthsLeft = new Label("місяців залишилося");
        gridPane.add(curLoanMonthsLeft, 3, 2);

        TextField curLoanMonthsLeftField = new TextField();
        curLoanMonthsLeftField.setMaxSize(60, 20);
        curLoanMonthsLeftField.setEditable(false);
        gridPane.add(curLoanMonthsLeftField, 4, 2);

//        Label curLoanPercent = new Label("поточний %");
//        gridPane.add(curLoanPercent, 3, 3);
//
//        TextField curLoanPercentField = new TextField("7");
//        curLoanPercentField.setMaxSize(60, 20);
////        curLoanPercentField.setEditable(false);
//        gridPane.add(curLoanPercentField, 4, 3);

        Label curLoanPercent = new Label("сума до сплати у\nпоточному місяці");
        gridPane.add(curLoanPercent, 3, 3);

        TextField curLoanPercentField = new TextField();
        curLoanPercentField.setMaxSize(60, 20);
        curLoanPercentField.setEditable(false);
        gridPane.add(curLoanPercentField, 4, 3);

        Label penaltyPercent = new Label("% від початкової суми до\nсплати при невиплаті\nщомісячної суми");
        gridPane.add(penaltyPercent, 3, 4, 1, 2);

        TextField penaltyPercentField = new TextField();
        penaltyPercentField.setMaxSize(60, 20);
        penaltyPercentField.setEditable(false);
        gridPane.add(penaltyPercentField, 4, 4, 1, 2);

        Label payDate = new Label("дата щомісячного\nпогашення");
        gridPane.add(payDate, 3, 6);

        TextField payDateField = new TextField();
        payDateField.setMaxSize(60, 20);
        penaltyPercentField.setEditable(false);
        gridPane.add(payDateField, 4, 6);



/** Current Loans block End **/

        Separator separator2 = new Separator(Orientation.VERTICAL);
        GridPane.setConstraints(separator2, 5, 0);
        GridPane.setRowSpan(separator2, 7);
        gridPane.getChildren().add(separator2);

/** Available Loans block Start **/

        Text availableLoansInfo = new Text("Доступні для\nоформлення позики");
        availableLoansInfo.setFont(Font.font("Calibri", 16));
        gridPane.add(availableLoansInfo, 6, 0, 4, 1);

        Text monthsInfo = new Text("кількість місяців");
        gridPane.add(monthsInfo, 6, 1, 4, 1);

        Label minMonths = new Label("мін");
        gridPane.add(minMonths, 6, 2);

        TextField minMonthsField = new TextField();
        minMonthsField.setEditable(false);
        minMonthsField.setMaxSize(80, 20);
        gridPane.add(minMonthsField, 7, 2);

        Label maxMonths = new Label("макс");
        gridPane.add(maxMonths, 8, 2);

        TextField maxMonthsField = new TextField();
        maxMonthsField.setEditable(false);
        maxMonthsField.setMaxSize(80, 20);
        gridPane.add(maxMonthsField, 9, 2);

//-----------------------------------------------------------------------------

        Text valuesInfo = new Text("допустимі суми");
        gridPane.add(valuesInfo, 6, 3, 4, 1);

        Label minValue = new Label("мін");
        gridPane.add(minValue, 6, 4);

        TextField minValueField = new TextField();
        minValueField.setEditable(false);
        minValueField.setMaxSize(80, 20);
        gridPane.add(minValueField, 7, 4);

        Label maxValue = new Label("макс");
        gridPane.add(maxValue, 8, 4);

        TextField maxValueField = new TextField();
        maxValueField.setEditable(false);
        maxValueField.setMaxSize(80, 20);
        gridPane.add(maxValueField, 9, 4);

        Text PercentInfo = new Text("відсотки");
        gridPane.add(PercentInfo, 6, 5, 4, 1);

        Label initialPercent = new Label("початкова відсоткова\nставка");
        gridPane.add(initialPercent, 6, 6, 2 , 1);

        TextField initialPercentField = new TextField ();
        initialPercentField.setMaxSize(50, 20);
        initialPercentField.setEditable(false);
        gridPane.add(initialPercentField, 9, 6);

        Label PercentPMonthIncrease = new Label("ріст % за кожен додатковий місяць\nвід мінімального значення");
        gridPane.add(PercentPMonthIncrease, 6, 7, 3, 1);

        TextField percentPMonthIncreaseField = new TextField();
        percentPMonthIncreaseField.setMaxSize(50, 20);
        percentPMonthIncreaseField.setEditable(false);
        gridPane.add(percentPMonthIncreaseField, 9, 7);

/** Available Loans block End **/

        primaryStage.setTitle("Основна частина");
        primaryStage.setScene(scene);
        primaryStage.show();

        converterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage secondaryStage = new Stage();
                ConverterInterface.start(secondaryStage);
            }
        });

        showInfoCurrentLoan.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < AddUsers.getUsers().get(userNumber).getCurrentLoans().size(); i++) {
                    if (spisokCurrentLoan.getValue().equals(AddUsers.getUsers().get(userNumber).getCurrentLoans().get(i).getName())) {
                        curLoanSumLeftField.setText(Integer.toString(AddUsers.getUsers().get(userNumber).getCurrentLoans().get(i).getLoanValueLeft()));
                        curLoanMonthsLeftField.setText(Integer.toString(AddUsers.getUsers().get(userNumber).getCurrentLoans().get(i).getLoanMonthLeft()));
                        curLoanPercentField.setText(Integer.toString(AddUsers.getUsers().get(userNumber).getCurrentLoans().get(i).getLoanMonthlyPayValue()));
                        payDateField.setText(Integer.toString(AddUsers.getUsers().get(userNumber).getCurrentLoans().get(i).getLoanPayDate()));
                        penaltyPercentField.setText(Double.toString(AddUsers.getUsers().get(userNumber).getCurrentLoans().get(i).getPercentPenaltyBet()));
                    }
                }
            }
        });

        showInfoAvailableLoan.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < AddUsers.getUsers().get(userNumber).getAvailableLoans().size(); i++) {
                    if (spisokAvailableLoans.getValue().equals(AddUsers.getUsers().get(userNumber).getAvailableLoans().get(i).getName())) {
                        minMonthsField.setText(Integer.toString(AddUsers.getUsers().get(userNumber).getAvailableLoans().get(i).getLoanMinMonthLenght()));
                        maxMonthsField.setText(Integer.toString(AddUsers.getUsers().get(userNumber).getAvailableLoans().get(i).getLoanMaxMonthLenght()));
                        minValueField.setText(Integer.toString(AddUsers.getUsers().get(userNumber).getAvailableLoans().get(i).getLoanMinValue()));
                        maxValueField.setText(Integer.toString(AddUsers.getUsers().get(userNumber).getAvailableLoans().get(i).getLoanMaxValue()));
                        initialPercentField.setText(Double.toString(AddUsers.getUsers().get(userNumber).getAvailableLoans().get(i).getPercentBet()));
                        percentPMonthIncreaseField.setText(Double.toString(AddUsers.getUsers().get(userNumber).getAvailableLoans().get(i).getPercentBetPMonth()));
                    }
                }
            }
        });

    }

}

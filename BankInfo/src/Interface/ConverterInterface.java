package Interface;
/**
 * Created by Admin on 19.06.2017.
 */

import Converter.Currencies.addCurrencys;
import Converter.Currencies.Currencies;

import com.sun.javafx.scene.layout.region.Margins;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.ArrayList;
import java.util.logging.Handler;

public class ConverterInterface{

    public static final ObservableList curr = FXCollections.observableArrayList();
    public static ArrayList<Currencies> currencies = addCurrencys.createArray();

    public static void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(20));

        Scene scene = new Scene(gridPane, 400, 250);

        for (int i = 0; i < currencies.size(); i++) {
            curr.add(currencies.get(i).getName());
        }

        Label startCurrency = new Label("початкова валюта");
//        startCurrency.setFont(Font.font("Colibri", 16));
        gridPane.add(startCurrency, 0, 0);

        ComboBox startCurrencyChoise = new ComboBox(curr);


        TextField startCurrencyIndex = new TextField();
        startCurrencyIndex.setMaxWidth(100);
        TextField finalCurrencyIndex = new TextField();
        finalCurrencyIndex.setMaxWidth(100);


//        test1 = startCurrencyChoise;
//        startCurrencyIndex = testT1;


        gridPane.add(startCurrencyChoise, 1, 0);

        Label course = new Label("курс");
        gridPane.add(course, 2, 0, 2, 1);
        Label course1 = new Label("курс");
        gridPane.add(course1, 2, 1, 2, 1);

        gridPane.add(startCurrencyIndex, 4, 0);
        gridPane.add(finalCurrencyIndex, 4, 1);

        Label secondCurrency = new Label("кінцева валюта");
        gridPane.add(secondCurrency, 0, 1);

        ComboBox secondCurrencyChoise = new ComboBox(curr);
        gridPane.add(secondCurrencyChoise, 1, 1);

        Label currencyCount = new Label("кількість");
        gridPane.add(currencyCount, 0, 2);

        TextField currencyCountInput = new TextField();
        gridPane.add(currencyCountInput, 1, 2, 2, 1);

        Button convert = new Button("конвертувати");
//        convert.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                startCurrencyIndex.setText("Progress");
//            }
//        } );

        gridPane.add(convert, 1, 3);

        Label rezultLabel = new Label("результат");
        gridPane.add(rezultLabel, 0, 4);

        TextField rezultField = new TextField();
        gridPane.add(rezultField, 1, 4, 2, 1);

        primaryStage.setTitle("Конвертатор валют");
        primaryStage.setScene(scene);
        primaryStage.show();

/**************************************************/

        startCurrencyChoise.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < currencies.size(); i++) {
                    if (startCurrencyChoise.getValue().equals(currencies.get(i).getName())) {
                        startCurrencyIndex.setText(Double.toString(currencies.get(i).getMultiplier()));
                    }
                }
            }
        });

        secondCurrencyChoise.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < currencies.size(); i++) {
                    if (secondCurrencyChoise.getValue().equals(currencies.get(i).getName())) {
                        finalCurrencyIndex.setText(Double.toString(currencies.get(i).getMultiplier()));
                    }
                }
                if (secondCurrencyChoise.getValue().equals(startCurrencyChoise.getValue())) {
                    Stage secondaryStage = new Stage();
                    ConverterError.start1(secondaryStage);
                }
            }
        });

        currencyCountInput.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    currencyCountInput.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        convert.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int value = Integer.parseInt(currencyCountInput.getText());
//                String firstV = startCurrencyChoise.getValue();
                rezultField.setText(Double.toString(Converter.curConversion.convesion(currencies, startCurrencyChoise.getValue(), secondCurrencyChoise.getValue(), value)));
            }
        });
    }

}
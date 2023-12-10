package com.example.modul7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainMahasiswa extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView<Mahasiswa> tableMahasiswa = new TableView<>();

        TableColumn<Mahasiswa, String> column1 = new TableColumn<>("NIM");
        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> column2 =new TableColumn<>("Nama");
        column2.setCellValueFactory(
                new PropertyValueFactory<>("Nama"));

        tableMahasiswa.getColumns().addAll(column1, column2);

        tableMahasiswa.getItems().add(
                new Mahasiswa(1, "Fithra", "2210817210005"));
        tableMahasiswa.getItems().add(
                new Mahasiswa(2, "Zulfa", "2210817210026"));
        tableMahasiswa.getItems().add(
                new Mahasiswa(3, "Farly", "2210817210006"));
        tableMahasiswa.getItems().add(
                new Mahasiswa(4, "Abdis", "2210817110005"));
        tableMahasiswa.getItems().add(
                new Mahasiswa(5, "Helena", "2210817220020"));
        tableMahasiswa.getItems().add(
                new Mahasiswa(6, "Mario", "2210817310009"));
        tableMahasiswa.getItems().add(
                new Mahasiswa(7, "Melisa", "2210817220004"));
        tableMahasiswa.getItems().add(
                new Mahasiswa(8, "Akmal", "2210817210023"));
        tableMahasiswa.getItems().add(
                new Mahasiswa(9, "Hafiz", "2210817210003"));
        tableMahasiswa.getItems().add(
                new Mahasiswa(10, "Adi", "2210817210017"));

        VBox vbox = new VBox(tableMahasiswa);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
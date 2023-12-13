package praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("Nama");
        kolom1.setCellValueFactory(new PropertyValueFactory<>("nim"));
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getItems().add(new Mahasiswa(1,"11111","Ricky"));
        tabel.getItems().add(new Mahasiswa(1,"22222","Andreas"));
        tabel.getItems().add(new Mahasiswa(1,"33333","Jennifer"));
        tabel.getItems().add(new Mahasiswa(1,"44444","Pitaloka"));
        tabel.getItems().add(new Mahasiswa(1,"55555","Rico"));
        tabel.getItems().add(new Mahasiswa(1,"66666","Ceryn"));
        tabel.getItems().add(new Mahasiswa(1,"77777","Riyo"));
        tabel.getItems().add(new Mahasiswa(1,"88888","Aurora"));
        tabel.getItems().add(new Mahasiswa(1,"99999","Morgan"));
        tabel.getItems().add(new Mahasiswa(1,"10101","Jason"));
        
        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }       
}
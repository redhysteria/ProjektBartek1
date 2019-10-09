package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

//asdasf
//taki Valum
//siedzi tu
//na drzewie
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Morksil robi cczendzes
        //Tworzenie panelu

        //Tworzenie buttonów
        Button projekty = new Button();
        projekty.setText("Projekty");
        Button daneDoZbierania = new Button();
        projekty.setText("Wybierz dane do zbierania");
        Button raporty = new Button();
        projekty.setText("Raporty");
        Button licencja = new Button();
        projekty.setText("Licencja");
        Button pomoc = new Button();
        projekty.setText("Pomoc");

        StackPane root = new StackPane();

        //Utworzenie siatki pionowej
        VBox siatkaPionowa = new VBox(5);
        //siatkaPionowa.setPadding(5);

        //Utworzenie siatki poziomej
        HBox siatkaPozioma = new HBox();

        //wpisanie siatki poziomej w pionową
        siatkaPionowa.getChildren().add(siatkaPozioma);




        //Przypięcie buttonów do panelu
        siatkaPozioma.getChildren().add(projekty);
        siatkaPozioma.getChildren().add(daneDoZbierania);
        siatkaPozioma.getChildren().add(raporty);
        siatkaPozioma.getChildren().add(licencja);
        siatkaPozioma.getChildren().add(pomoc);



        primaryStage.setTitle("Magnetyt");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

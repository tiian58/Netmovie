package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class HomeView extends Application {

    public void start(Stage stage) throws Exception {
        stage.setTitle("Netmovie");
        Button btnAddMovie = new Button("Add Movie");
        Button btnViewMovies = new Button("View Movies");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(300, 200);

        gridPane.add(btnAddMovie,0, 0);
        gridPane.add(btnViewMovies,0,1);

        Scene scene = new Scene(gridPane, 400, 200);  //Scene
        stage.setScene(scene);
        stage.show();
    }

    public void addMovie(){

    }
}

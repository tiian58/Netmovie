package View;

import Model.Movie;
import Util.Parser;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.ArrayList;
import java.util.List;


public class HomeView extends Application {
    private Button btnAddMovie;
    private Button btnViewMovies;
    private GridPane gridPane;
    private Button btnSearch;
    private TextField txtSearch;
    private Parser parser = new Parser();
    private List<Movie> movies;


    public void start(Stage stage) throws Exception {
        component();
        movies = readMovies("Movies.json");
        stage.setTitle("Netmovie");
        Scene scene = new Scene(gridPane, 500, 200);  //Scene
        stage.setScene(scene);
        stage.show();
        addActions();
    }

    public void component(){
        btnAddMovie = new Button("Add Movie");
        btnViewMovies = new Button("View Movies");
        btnSearch = new Button("Search Movie");
        txtSearch = new TextField();
        gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        gridPane.add(btnAddMovie,0, 1);
        gridPane.add(btnViewMovies,1,1);
        gridPane.add(btnSearch,3,1);
        gridPane.add(txtSearch,2,1);

    }

    public void addActions(){
        btnAddMovie.setOnAction(new EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Add Movie");
            }
        });
        btnViewMovies.setOnAction(new EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("View Movie");
            }
        });
    }

    public List<Movie> readMovies(String path){
        try{
            return parser.readFile(path, new TypeReference<List<Movie>>() {});
        }catch (Exception e){
            System.out.println("Error Reading " + path);
            return new ArrayList<>();
        }
    }
}

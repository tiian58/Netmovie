package Model;

import java.util.List;

public class Director {
    private String name;
    private int age;
    private List<Movie> movies;

    public Director(String name){
        this.name = name;
    }

    //Getter
    public String getName(){
        return name;
    }

    //Method
    public void makeMovie(String name, int last, String genres){
        movies.add(new Movie(name,last,genres));
    }
}

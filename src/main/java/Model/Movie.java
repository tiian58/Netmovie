package Model;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String name;
    private List<Actor> actors = new ArrayList<Actor>();
    private int last;
    private double calification = 0;
    private String genres;

    public Movie(String name, int last, String genres){
        this.name = name;
        this.last = last;
        this.genres = genres;
    }

    //Getter
    public String getName() {
        return name;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public int getLast() {
        return last;
    }

    public double getCalification() {
        return calification;
    }

    public String getGenres() {
        return genres;
    }

    //Method
    public void addRating(int rating){
        if(0 < rating && rating < 10){
            calification = (calification + rating) / 2;
        }
    }

    public void contractActor(Actor actor){
        actors.add(actor);
    }


}

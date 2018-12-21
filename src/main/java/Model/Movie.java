package Model;

import java.util.List;

public class Movie {

    private String name;
    private List<Director> directors;
    private List<Actor> actors;
    private int last;
    private double calification = 0;

    private String genres;

    public Movie(String name, String genres){
        this.name = name;
        this.last = last;
    }

    public String getName() {
        return name;
    }

    public List<Director> getDirectors() {
        return directors;
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

    public void addRating(int rating){
        if(0 < rating && rating < 10){
            calification = (calification + rating) / 2;
        }
    }


}

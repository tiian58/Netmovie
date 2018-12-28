import Model.Movie;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMovie{

    private Movie harryPotter;
    @Before
    public void createMovie(){
        harryPotter = new Movie("Harry Potter", 110,"Adventure");
    }

    @Test
    public void getName(){
        assertEquals("Harry Potter", harryPotter.getName());
    }
}
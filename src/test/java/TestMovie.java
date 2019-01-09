import Model.Actor;
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

    @Test
    public void contractActor(){
        Actor radcliffe = new Actor("Daniel Radcliffe");
        harryPotter.contractActor(radcliffe);
        assertEquals(1, harryPotter.getActors().size());
    }
}
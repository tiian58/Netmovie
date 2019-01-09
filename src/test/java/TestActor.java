import Model.Actor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestActor {

    private Actor johnnyDepp;
    @Before
    public void createActor(){
        johnnyDepp = new Actor("Johnny Depp");
    }

    @Test
    public void getName(){
        assertEquals("Johnny Depp", johnnyDepp.getName());
    }
}

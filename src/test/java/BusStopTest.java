import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person1;
    private Person person2;

    @Before
    public void before(){
        busStop = new BusStop("Castle");
        person1 = new Person("Annika");
        person2 = new Person("Claire");
    }

    @Test
    public void hasName(){
        assertEquals("Castle", busStop.getName());
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.lengthOfQueue());
    }

    @Test
    public void canAddToQueue(){
        busStop.addToQueue(person1);
        assertEquals(1, busStop.lengthOfQueue());
    }

    @Test
    public void canRemoveFromQueue(){
        busStop.addToQueue(person1);
        busStop.removeFromQueue(person1);
        assertEquals(0, busStop.lengthOfQueue());
    }

}

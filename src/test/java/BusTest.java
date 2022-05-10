import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;


    @Before
    public void before(){
        bus = new Bus("Edinburgh", 3);
        person1 = new Person("Annika");
        person2 = new Person("Claire");
        person3 = new Person("Elliot");
        person4 = new Person("Pixel");
    }

    @Test
    public void hasDestination(){
        assertEquals("Edinburgh", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void startEmptyBus(){
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person1);
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void cannotAddPassenger(){
        bus.addPassenger((person1));
        bus.addPassenger((person2));
        bus.addPassenger((person3));
        bus.addPassenger((person4));
        assertEquals(3, bus.numberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger((person1));
        assertEquals(1, bus.numberOfPassengers());
        bus.removePassenger(person1);
        assertEquals(0, bus.numberOfPassengers());
    }
}

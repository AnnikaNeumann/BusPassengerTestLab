import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int numberOfPassengers() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if (passengers.size() < capacity) {
            passengers.add(person);
        }
    }
//.remove method needs index to remove certain person from arraylist and to get correct element
    public void removePassenger(Person person){
        int index  = passengers.indexOf(person);
         passengers.remove(index);
        }

        public void pickUp(BusStop busStop, Person person){
        busStop.removeFromQueue(person);
        passengers.add(person);

        }
    }

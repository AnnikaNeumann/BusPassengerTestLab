import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public int lengthOfQueue(){
        return queue.size();
    }

    public void addToQueue(Person person) {
        queue.add(person);
    }

    public Person removeFromQueue(Person person){
        int index = queue.indexOf(person);
        return queue.remove(index);
    }



}

import java.util.ArrayList;
import java.util.List;

public class Subject {
    protected List<Observer> observers = new ArrayList<>();
    protected int state;
    public void add(Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }
    public void setState(int value) {
        this.state = value;

    }
    private void takeAction() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}

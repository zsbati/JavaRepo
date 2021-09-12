import java.util.LinkedList;
import java.util.List;

public class Subject {

    List<Observer> observers = new LinkedList<>();
    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }


}

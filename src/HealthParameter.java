// Concrete Observable
import java.util.ArrayList;
import java.util.List;
class HealthParameter implements Observable {
    private String parameterName;
    private double value;
    private List<Observer> observers = new ArrayList<>();

    public HealthParameter(String parameterName) {
        this.parameterName = parameterName;
    }

    public void setValue(double value) {
        this.value = value;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(parameterName, value);
        }
    }
}


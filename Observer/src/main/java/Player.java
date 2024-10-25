import java.util.ArrayList;

public class Player implements Observable {
    public ArrayList<Observer> observerArrayList = new ArrayList<>();

    private int score;

    @Override
    public void addObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerArrayList) {
            observer.update(this.getScore());
        }
    }

    public void setScore(int score) {
        this.score = score;
        notifyObservers();
    }

    public int getScore() {
        return score;
    }
}

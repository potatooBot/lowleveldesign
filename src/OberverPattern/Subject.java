package OberverPattern;

public interface Subject {
  public  void register(Observer observer);
    void unregister(Observer observer);

    void notifyAllObserver();
    Object getUpdate();

    void postMessage(String message);
}

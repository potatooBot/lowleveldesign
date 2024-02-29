package OberverPattern;

public interface Observer {
    void update();
    void update(String message);


    void setSubjct(Subject subject);
}

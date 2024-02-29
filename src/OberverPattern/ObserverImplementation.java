package OberverPattern;

public class ObserverImplementation implements Observer{
String observerName;
Subject subjectSubscribed;



public ObserverImplementation(String observerName){
    this.observerName=observerName;
}

    @Override
    public void update() {
        String newMessage=(String) subjectSubscribed.getUpdate();
        if(newMessage==null){
            System.out.println(observerName+" NO NEW MESSAGE");
        }
        else {
            System.out.println(observerName+" Message is "+newMessage);
        }
    }

    public void update(String newMessage) {
        if (newMessage == null) {
            System.out.println(observerName + " No new message received!!!");
        } else {
            System.out.println(observerName + " New message received: " + newMessage);
        }
    }

    @Override
    public void setSubjct(Subject subject) {
        this.subjectSubscribed=subject;
    }
}

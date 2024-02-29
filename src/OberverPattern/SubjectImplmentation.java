package OberverPattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectImplmentation implements Subject{
    List<Observer> observerList=null;
    String message;


    public SubjectImplmentation(){
        this.observerList=new ArrayList<>();
    }

    public void register(Observer observer){
        if(observer==null){
            throw new NullPointerException();
        }
        else {
            observerList.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        if(observerList.size()==0){
            throw new RuntimeException();
        }
        else
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        if(observerList!=null &&observerList.isEmpty()==false){
            for (int i = 0; i <observerList.size() ; i++) {
                observerList.get(i).update(message);
            }
        }
        else {
            System.out.println("No Observer");
        }
    }

    public Object getUpdate(){
        return message;
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Message is "+message);
        this.message=message;
        notifyAllObserver();
    }
}


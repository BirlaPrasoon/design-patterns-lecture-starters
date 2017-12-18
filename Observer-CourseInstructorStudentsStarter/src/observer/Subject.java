package observer;

import model.LectureModule;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();


    //EFFECTS: adds the given observer on to the list.
    //MODIFIES: this
    public void addObserver(Observer obs){
        if(!observerList.contains(obs)){
        this.observerList.add(obs);
        }
    }

    //EFFECTS: calls the update method for each of its observers
    public void notifyObservers(LectureModule lectureModule){
        for(Observer obs:observerList){
            // Notice lecture module is passed by the calling lecture module.
            obs.update(lectureModule);
        }
    }
}

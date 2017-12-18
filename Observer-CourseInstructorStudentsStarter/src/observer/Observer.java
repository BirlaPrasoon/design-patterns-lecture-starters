package observer;

import model.LectureModule;

public interface Observer {

    //EFFECTS: informs the Observer about what has been updated
             //here its lecture module.
    public void update(LectureModule lectureModule);

}

package api;

import internal.Event;

import java.awt.*;

public abstract class EventAbstract  extends AWTEvent implements Event {


    public EventAbstract(Object source, int id) {
        super(source, id);
    }
}

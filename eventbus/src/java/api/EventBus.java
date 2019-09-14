package api;

import internal.EventHandler;
import java.awt.*;
import java.util.Random;

/**
 *
 */
public class EventBus extends EventQueue {

    public static final EventBus INSTANCE = new EventBus();

    private final long id;
    private final EventHandler eventHandler;

    EventBus() {
        this.id = new Random().nextLong();
        this.eventHandler = new EventHandler();
    }

    @Override
    public void postEvent(AWTEvent event) {
        super.postEvent(event);
    }

    @Override
    protected void dispatchEvent(AWTEvent event) {
        if(event instanceof EventAbstract){
            boolean handled = eventHandler.handleEvent((EventAbstract) event);
            //if we processed the event break the eventloop
            if(handled){
                return;
            }
        }
        super.dispatchEvent(event);
    }
}

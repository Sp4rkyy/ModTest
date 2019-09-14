package internal;

import api.EventAbstract;
import api.EventHandlerI;

import java.util.ServiceLoader;

public class EventHandler {

    private ServiceLoader<EventHandlerI> serviceLoader;

    public EventHandler() {
        serviceLoader = ServiceLoader.load(EventHandlerI.class);
    }

    public boolean handleEvent(EventAbstract event) {

        boolean handled = false;
        for (EventHandlerI eventHandler : serviceLoader) {
            if (eventHandler.supportsEventType(event)) {
                eventHandler.handleEvent(event);
                handled = true;
            }
        }
        return handled;
    }

}

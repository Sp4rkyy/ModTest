package generator;

import api.EventAbstract;
import api.EventHandlerI;

public class NameHandler implements EventHandlerI<NamedEvent> {

    @Override
    public boolean supportsEventType(EventAbstract eventAbstract) {
        return eventAbstract instanceof NamedEvent;
    }

    @Override
    public void handleEvent(EventAbstract event) {
        if (supportsEventType(event)) {
            System.out.println("NameHandler handels Event: " + event.getEventType() + " " + event.getID());
        }
    }
}

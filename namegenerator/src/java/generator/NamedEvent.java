package generator;

import api.EventAbstract;
import api.EventBus;

import java.util.Random;
import java.util.UUID;

public class NamedEvent extends EventAbstract {

    private NamedEvent(Object source, int id) {
        super(source, id);
    }

    public static NamedEvent createNamedEvent(Object source, int id) {
        return new NamedEvent(source, id);
    }

    @Override
    public String getEventType() {
        return this.getClass().getSimpleName();
    }
}

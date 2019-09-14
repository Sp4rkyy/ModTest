package api;

public interface EventHandlerI<EventType extends EventAbstract> {

    boolean supportsEventType(EventAbstract eventAbstract);

    void handleEvent(EventAbstract event);
}

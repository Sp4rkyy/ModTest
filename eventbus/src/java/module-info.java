module ModTest.eventbus {
    uses internal.EventHandler;
    uses api.EventHandlerI;

    exports api;
    requires java.desktop;
}
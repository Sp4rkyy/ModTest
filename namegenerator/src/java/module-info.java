import api.EventHandlerI;
import generator.NameHandler;

module ModTest.namegenerator {
    requires ModTest.eventbus;
    exports generator;

    provides EventHandlerI with NameHandler;
}
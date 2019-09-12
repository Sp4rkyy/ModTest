module someexthandler{
    exports tdl.sometest.handlerinterface;
    provides tdl.sometest.handlerinterface.ObjectHandlerModule with tdl.sometest.ext.SomeModule;
}
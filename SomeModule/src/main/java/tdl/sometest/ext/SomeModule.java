package tdl.sometest.ext;

import tdl.sometest.SomeObject;
import tdl.sometest.handlerinterface.ObjectHandlerModule;

public class SomeModule implements ObjectHandlerModule {
    @Override
    public void processObject(SomeObject someObject) {
        System.out.println(someObject.getName());
    }
}

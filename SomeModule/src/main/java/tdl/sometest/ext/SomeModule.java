package tdl.sometest.ext;

import tdl.sometest.export.SomeObject;
import tdl.sometest.export.ObjectHandlerModule;

public class SomeModule implements ObjectHandlerModule {
    @Override
    public void processObject(SomeObject someObject) {
        System.out.println(someObject.getName());
    }
}

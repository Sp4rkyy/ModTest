package tdl.sometest;

import tdl.sometest.handlerinterface.ObjectHandlerModule;

import java.util.ServiceLoader;

public class SomeObject_handler{

    private static ServiceLoader<ObjectHandlerModule> serviceLoader;

    public SomeObject_handler(){
        if(serviceLoader == null){
            serviceLoader = ServiceLoader.load(ObjectHandlerModule.class);
        }
    }


    public void handleObject(SomeObject someObject) {
        /*
        Iterator<ObjectHandlerModule> iterator = serviceLoader.iterator();
        while(iterator.hasNext()){
            iterator.next();
        }
        */
        for (ObjectHandlerModule objectHandlerModule : serviceLoader) {
            objectHandlerModule.processObject(someObject);
        }
    }
}

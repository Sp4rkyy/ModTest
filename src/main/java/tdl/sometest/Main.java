package tdl.sometest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args){

        List<SomeObject> moreobjects = new ArrayList<SomeObject>();
        SomeObject s1 = new SomeObject("A");
        SomeObject s2 = new SomeObject("B");
        SomeObject s3 = new SomeObject("C");
        SomeObject s4 = new SomeObject("D");
        moreobjects.add(s1);
        moreobjects.add(s2);
        moreobjects.add(s3);
        moreobjects.add(s4);

        for(SomeObject someObject : moreobjects){
            // do something
            new SomeObject_handler().handleObject(someObject);
        }
    }

}

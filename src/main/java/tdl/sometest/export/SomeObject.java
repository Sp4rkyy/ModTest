package tdl.sometest.export;

public class SomeObject {

    private static int instances = 0;
    private int id;
    private String name;

    SomeObject(String name){
        instances++;
        this.id = instances;
        this.name = name;
    }

    public String getName(){ return this.name; }
    public int getId(){ return this.id; }
}

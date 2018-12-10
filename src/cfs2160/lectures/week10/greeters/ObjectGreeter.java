package cfs2160.lectures.week10.greeters;

public class ObjectGreeter {

    public ObjectGreeter () {}

    public void sayHelloWorld () {
        System.out.println ("Hello, World");
    }

    public static void main (String[] args) {

        ObjectGreeter og = new ObjectGreeter ();
        og.sayHelloWorld ();

    }
}

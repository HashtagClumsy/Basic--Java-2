class Example {
    static int x;

    Example() {
        x++;
        System.out.println("Constructor: x = " + x);
    }

    static int getCount() {
        System.out.println("getCount: x = " + x);
        return x++;
    }
}

public class Demo {
    public static void main(String[] args) {
       // Example e1=new Example();
        //Example e2= new Example();
       // Example e3= new Example();

        //System.out.println("obj1.getCount(): " + Example.getCount());
        //System.out.println("obj2.getCount(): " + Example.getCount());
        //System.out.println("obj3.getCount(): " + Example.getCount());
        
        System.out.println("Total instances created: " + Example.getCount());
    }
    
}

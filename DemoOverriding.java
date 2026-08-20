class Vehicle{
    void start(){
        System.out.println("Vehicle Starts:");
    }
}
class car extends Vehicle{
    void start(){
        super.start();
        System.out.println("Car starts");
    }
}
public class DemoOverriding{
    public static void main(String args[]){
        Vehicle v = new car();
        v.start();
    }
}

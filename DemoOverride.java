class Vehicle{
    void start(){
        System.out.println("Vehicle Starts");
    }
}
class Car extends Vehicle{
    void start(){
        super.start();
        System.out.println("Car starts");
    }
}
public class DemoOverride{
    public static void main(String args[]){
        Vehicle v = new Car();
        v.start();
    }
}

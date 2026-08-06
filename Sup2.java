class Vehicle{
    String name = "Audi";
}
class Car extends Vehicle{
    String name="BMW";
    void display(){
        System.out.println("Vehicle name is : " + super.name);
        System.out.println("car name is : " +name);
    }
}
class Sup2{
    public static void main(String args[]){
        Car c = new Car();
        c.display();
    }
}
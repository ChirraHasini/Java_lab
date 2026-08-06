class Car{
    Car(){
        System.out.println("Inside Car Constructor");
    }
}
class Bus extends Car{
    Bus(){
        super();
        System.out.println("Inside Bus Constructor");
    }
}
class Supcons{
    public static void main(String args[]){
        Bus b = new Bus();
    }
}


interface A{
    public static final int a= 10;
    void display();
}
class B implements A{
    public void  display(){
        System.out.println("Hello");
    }
}
class InterfaceDemo{
    public static void main(String args[]){
        B obj = new B();
        obj.display();
    }
}
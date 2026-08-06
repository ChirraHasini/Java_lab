interface X{
    void test();
}
interface A{
    void display();
}
class B implements A,X {
    public void display(){
        System.out.println("Hello");
    }
    public void test(){
        System.out.println("I am from interface X");
    }
}
class InterfaceDemo{
    public static void main(String args[]){
        B obj = new B();
        
    }
}
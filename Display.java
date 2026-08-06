abstract class Sample{
    abstract void Numbers();
}
class Student extends Sample{
    void Numbers(){
        int a = 10;
        int b = 20;
        System.out.println("The values of a :" +a);
        System.out.println("The values of b :" +b);
    }
}
public class Display{
    public static void main(String args[]){
        Student obj =new Student();
        obj.Numbers();
    }
}
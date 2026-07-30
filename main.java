class Super
{
    void show()
    {
        System.out.println("I'm from Super class");
    }
}
class sub extends Super
{
    void display()
    {
        System.out.println("I'm from sub class");
    }
}
class Intermediate extends sub{
    void show1()
    {
        System.out.println("I'm from Intermediate class");
    }
}
class main{
    public static void main(String args[])
    {
        Intermediate obj1 = new Intermediate();
        obj1.show();
        obj1.display();
        obj1.show1();
    }
}

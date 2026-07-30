class Super
{
    void show()
    {
        System.out.println("I'm in CSM A");
    }
}
class sub extends Super{
    void display()
    {
        System.out.println("Java class");
    }
}
class Inherit
{
    public static void main(String args[]){
     sub obj1 = new sub();
     obj1.show();
     obj1.display();
}
}
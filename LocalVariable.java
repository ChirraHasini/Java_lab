class LocalVariable
{
int num1 =100;
public void show()
{
System.out.println("from show method");
System.out.println("The val of num1:"+num1);
num1 += 100;
}
public void display()
{
System.out.println("From display method");
System.out.println("The val of num1:"+num1);
}
public static void main(String args[])
{
LocalVariable obj1=new LocalVariable();
obj1.show();
obj1.display();
}
}

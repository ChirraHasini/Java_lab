class Test
{
Test(int n1,int n2)
{
System.out.println("The Value of a is :"+n1);
System.out.println("The value of b is :"+n2);
}
}
class Construct
{
public static void main(String args[])
{
int a= 10;
int b= 20;
Test t1 = new Test(a,b);
}
}

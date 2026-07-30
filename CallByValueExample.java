public class CallByValueExample
{
public static void main(String arg[])
{
int num = 10;
System.out.println("Before Calling method :"+num);
ModifyValue(num);
System.out.println("After Calling method :"+num);
}
public static void ModifyValue(int value)
{
value = 20;
System.out.println("Inside method :"+value);
}
}

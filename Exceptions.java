class Exceptions{
    public static void main(String args[]){
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println("The value is:"+c);
        }
        catch(NullPointerException e){
            System.out.println("NullPointer Exception...");
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should be zero");
        }
    }
}

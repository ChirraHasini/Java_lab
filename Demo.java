class Hospital{
    Hospital(String hospitalName){
    System.out.println("Hospital :" + hospitalName);
    }
}
class Doctor extends Hospital{
    Doctor(){
        super("Apollo Hospital");
    }
}
public class Demo{
    public static void main(String args[]){
          Doctor obj = new Doctor();
    }
}
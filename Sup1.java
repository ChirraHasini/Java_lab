class Student{
    String name = "Anu";
}
class Teacher extends Student{
    String name = "Bhanu";
    void display(){
        System.out.println("Teacher name: " +name);
        System.out.println("Student name: " +super.name);
    }
}
class Sup1
{
    public static void main(String args[]){
        Teacher t = new Teacher();
        t.display();
    }
}

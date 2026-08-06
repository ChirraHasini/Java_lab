class Student{
    void study(){
        System.out.println("We are Studying");
    }
}
class Teacher extends Student{
    void study(){
        super.study();
        System.out.println("Teachers are delivering lectures");
    }
}
class Override1{
    
    public static void main(String args[]){
        Teacher t = new Teacher();
        t.study();
    }
}

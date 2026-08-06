class Student{
    void Study(){
        System.out.println("We are Studying");
    }
}
class Teacher extends Student{
    void Study(){
        System.out.println("Teachers are delivering lectures");
    }
}
class Override{
    public static void main(String args[]){
        Teacher t = new Teacher();
        t.Study();
        
    }
}

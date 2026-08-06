class Animal{
    String name;
    void show(){
        System.out.println("Animal Name is"+name);
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Mother Dog Barking");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("BabyDog weeping");
    }
}
class TestInheritance{
    public static void main(String args[]){
        BabyDog b = new BabyDog();
        b.name = "MotherDog";
        b.show();
        b.bark();
        b.weep();
    }
}
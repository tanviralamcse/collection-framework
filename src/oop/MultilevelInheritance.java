package oop;

class BigAnimal{
    void eat(){System.out.println("eating...");}
}
class BigDog extends BigAnimal{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends BigDog{
    void weep(){System.out.println("weeping...");}
}
class MultilevelInheritance{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }}
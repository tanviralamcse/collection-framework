package oop;


class SmallAnimal{
    void eat(){
        System.out.println("eating...");
    }
}
class SmallDog extends SmallAnimal{
    void bark(){
        System.out.println("barking...");
    }
}
class Cat extends SmallAnimal{
    void meow(){System.out.println("meowing...");}
}
class HierarchicalInheritance{
    public static void main(String args[]){
        Cat c=new Cat();
        SmallDog d = new SmallDog();
        System.out.println("I am CAT and I can : ");
        c.meow();
        c.eat();
        System.out.println("I am Small Dog and I can : ");
        d.bark();
        d.eat();
    }
}
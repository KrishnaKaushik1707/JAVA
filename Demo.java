class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal{
    void drink(){
        System.out.println("cat is drinking");
    }
}

public class Demo{
    public static void main(String [] args)
{
    Cat c = new Cat();
    c.eat();
    c.drink();
}}

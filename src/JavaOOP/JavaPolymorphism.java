package JavaOOP;


// tinh da hinh cua java
//think of a superclass called Animal that has a method called animalSound().
// Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And
// they also have their own implementation of an animal sound

class Animal {
    protected String name;
    Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Pig extends  Animal {
    Pig(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends  Animal{
    Dog(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("The Dog says: goooo gooooo");
    }
    public  void  getAge(){
        System.out.println(2000);
    }
}


public class JavaPolymorphism {
    public static void main(String[] args) {
        new Pig("Pig").animalSound();
        new Dog("Dog").animalSound();

        Dog  dog = new Dog("Dog");
        System.out.println(dog.getName());
    }
}

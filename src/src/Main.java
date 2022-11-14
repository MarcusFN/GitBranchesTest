package src;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.print("the dog siger: ");dog.makeSound();
        System.out.print("the Cat siger: ");cat.makeSound();
        System.out.println("Cats eat: "+cat.eat("smelly fish"));
        System.out.println("Dogs eat: "+dog.eat("bad bitches"));
    }

}

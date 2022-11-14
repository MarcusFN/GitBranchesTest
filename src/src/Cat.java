package src;

public class Cat extends Animal {

    public void makeSound() {
        System.out.println("meow");
    }

    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood){
            System.out.println("happy dog");
        } else System.out.println("unhappy dog");
    }
}

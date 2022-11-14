package src;

public class Dog extends Animal {

    public void makeSound() {
        System.out.println("Wu");
    }

    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood){
            System.out.println("happy Cat");
        } else System.out.println("unhappy Cat");
    }
}

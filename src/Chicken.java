public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "chicken: cluck -cluck!";
    }

    @Override
    public String howToEat() {
        return "chien len!";
    }
}

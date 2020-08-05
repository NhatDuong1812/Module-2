package Week1.animal;

public  class Chicken extends Animal {
    @Override
    public String makeSound() {
        return "Chicken: cluk cluk!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}

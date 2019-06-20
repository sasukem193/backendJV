package interfaceabstract.lab1;

public class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "Cluck- Cluck";
    }

    @Override
    public String howtoeat() {
        return "fried";
    }
}

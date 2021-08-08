package homework1;

public class Dog extends Pet{

    public Dog(String nameAnimal, int age, double weight, double height) {
        super(nameAnimal, age, weight, height);
    }

    void voice(){
        System.out.println("Я пес - Гаууу-Гаууу");
    }
}

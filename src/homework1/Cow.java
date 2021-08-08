package homework1;

public class Cow extends Pet{

    public Cow(String nameAnimal, int age, double weight, double height) {
        super(nameAnimal, age, weight, height);
    }

    void voice(){
        System.out.println("Я корова- Мууу-Мууу");
    }


}

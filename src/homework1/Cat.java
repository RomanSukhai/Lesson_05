package homework1;

public class Cat extends Pet{

    public Cat(String nameAnimal, int age, double weight, double height) {
        super(nameAnimal, age, weight, height);
    }
    void voice(){
        System.out.println("Я кіт- Мяууу-Мяууу");
    }
}

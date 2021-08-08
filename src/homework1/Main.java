package homework1;

public class Main {
    public static void main(String[] args) {
        Cow co  = new Cow("Stella",14,200,333);
        Dog dog = new Dog("John",21,50,30);
        Cat ca  = new Cat("Vasul",10,20,10);

        System.out.println(co);
        System.out.println(dog);
        System.out.println(ca);
        System.out.println(" ");

        co.voice();
        dog.voice();
        ca.voice();
    }
}

package spring_introduction;

public class DogTest {

    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();

        pet = new Cat();
        pet.say();
    }

}

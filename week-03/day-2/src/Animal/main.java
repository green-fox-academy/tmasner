package Animal;

public class main {
    public static void main(String[] args) {

        //start of testing
        Animal tiger = new Animal();
        Animal lion = new Animal();

        System.out.println(tiger.hunger);
        System.out.println(lion.thirst);

        tiger.eat();
        lion.drink();

        System.out.println(tiger.hunger);
        System.out.println(lion.thirst);

        tiger.play();
        lion.play();

        System.out.println(tiger.hunger);
        System.out.println(lion.thirst);
        // end of testing
    }
}

package Cloneable;

public class Main {
    public static void main(String[] args) {
        Student john = new Student("John Doe", 20 , "male", "BME");
        john.introduce();
        Student cloned = john.clone(john);
        cloned.introduce();

        john.introduce();
    }
}

package main.java.Animals;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }


    @Override
    public String breed() {
        return "pushing miniature versions out";
    }

    @Override
    public String cry() {
        return "Gimmme milk!!!";
    }
}

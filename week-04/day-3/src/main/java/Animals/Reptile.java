package main.java.Animals;

public class Reptile extends Animal {
    public Reptile(String name) {
        super(name);
    }


    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public String cry() {
        return "Ssssleap";
    }
}

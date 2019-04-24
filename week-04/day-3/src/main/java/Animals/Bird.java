package main.java.Animals;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed(){
     return "laying eggs";
    }

    @Override
    public String cry(){
        return "Feed me me me me, no me!";
    }
}

package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar(){
        numberOfStrings = 4;
        name = "BassGuitar";
    }

    public BassGuitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
        name = "BassGuitar";
    }

    @Override
    public void sound(){
        System.out.println("Duum-duum-duum");
    }
}

package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        instrumentName="Violin";
        numberOfStrings=4;
    }

    public Violin(Integer strings) {
        instrumentName="Violin";
        numberOfStrings=strings;
    }

    public String sound() {
        return " that goes Screech";
    }

}

package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        instrumentName="Bass Guitar";
        numberOfStrings=4;
    }

    public BassGuitar(Integer strings) {
        instrumentName="Bass Guitar";
        numberOfStrings=strings;
    }

    public String sound() {
        return " that goes Duum-duum-duum";
    }

}

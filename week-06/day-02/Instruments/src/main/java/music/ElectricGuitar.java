package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        instrumentName="Electric Guitar";
        numberOfStrings=6;
    }

    public ElectricGuitar(Integer strings) {
        instrumentName="Electric Guitar";
        numberOfStrings=strings;
    }

    public String sound() {
        return " that goes Twang";
    }

}

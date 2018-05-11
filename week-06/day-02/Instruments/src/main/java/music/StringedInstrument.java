package main.java.music;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    public String sound() {
        return "";
    }

    public void play() {
        System.out.println(instrumentName + ", a " + numberOfStrings + "-stringed instrument" + sound());
    }
}

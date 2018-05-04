public class Plant {
    public String color;
    public double waterLevel;
    public double waterRatio=1;

    public Plant(String color) {
        this.color=color;
        this.waterLevel=0.0;
    }

    public void watering(int waterAmount) {
        waterLevel+=waterAmount*waterRatio;
    }
}

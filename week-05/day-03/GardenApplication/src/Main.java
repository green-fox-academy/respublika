public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower("yellow");
        Flower flower2 = new Flower("blue");
        Tree tree1 = new Tree("orange");
        Tree tree2 = new Tree("purple");

        Garden garden = new Garden();
        garden.addFlower(flower1);
        garden.addFlower(flower2);
        garden.addTree(tree1);
        garden.addTree(tree2);

        garden.showGarden();

        garden.wateringGarden(40);

        garden.wateringGarden(70);
    }
}

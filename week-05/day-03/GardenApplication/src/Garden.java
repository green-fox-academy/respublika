import java.util.ArrayList;

public class Garden {
    public ArrayList<Flower> flowers;
    public ArrayList<Tree> trees;

    public Garden() {
        this.flowers = new ArrayList<>();
        this.trees = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    public void addTree(Tree tree) {
        this.trees.add(tree);
    }

    public void showGarden() {
        for (Flower flower: flowers) {
            if (flower.waterLevel<5) {
                System.out.println("The " + flower.color + " Flower needs water");
            } else {
                System.out.println("The " + flower.color + " Flower doesn't need water");
            }
        }

        for (Tree tree: trees) {
            if (tree.waterLevel<10) {
                System.out.println("The " + tree.color + " Tree needs water");
            } else {
                System.out.println("The " + tree.color + " Tree doesn't need water");
            }
        }
    }

    public void wateringGarden(int waterAmount) {
        int countToWater=0;
        for (Flower flower: flowers) {
            if (flower.waterLevel<5) {countToWater++;}
        }
        for (Tree tree: trees) {
            if (tree.waterLevel<10) {countToWater++;}
        }

        if (countToWater>0) {
            for (Flower flower : flowers) {
                flower.watering(waterAmount / countToWater);
            }
            for (Tree tree : trees) {
                tree.watering(waterAmount / countToWater);
            }
        }
        System.out.println("Watering with: " + waterAmount);
        showGarden();
    }
}

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie=new Sharpie("Green", 30);

        System.out.println(sharpie.color);
        System.out.println(sharpie.width);
        System.out.println(sharpie.inkAmount);
        sharpie.use(15);
        System.out.println(sharpie.inkAmount);
    }
}


// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class Cuboid {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=10;
        int SurfaceArea=(2*a*b)+(2*a*c)+(2*b*c);
        int Volume=a*b*c;
        System.out.println("Surface Area: "+SurfaceArea);
        System.out.println("Volume: "+Volume);
    }
}

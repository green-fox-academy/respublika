public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(creatFibonacci(2));
    }

    public static double creatFibonacci(int element) {
        double result=1;
        double numPrev=0;
        if (element==0) {
            result=0;
        } else {
            for (int i = 1; i <= element-1; i++) {
                double temp=result;
                result=result+numPrev;
                numPrev=temp;
            }
        }
        return result;
    }
}

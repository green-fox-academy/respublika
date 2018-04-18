// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer


public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int number){
        int summed=0;
        for (int i = 0; i <= number; i++) {
            summed+=i;
        }
        return summed;
    }
}

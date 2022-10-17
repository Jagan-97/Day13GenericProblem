public class GenericMain {
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x;

        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String args[]){
        //Test case 1.1-Given Max Number at 1st Position return the Same Number
        System.out.printf("Maximum of %d,%d and %d is %d\n\n", 5,4,3,maximum(5,4,3));
        //Test case 1.2-Given Max Number at 2nd Position return the Same Number
        System.out.printf("Maximum of %d,%d and %d is %d\n\n", 3,5,4,maximum(3,5,4));
        //Test case 1.3-Given Max Number at 3rd Position return the Same Number
        System.out.printf("Maximum of %d,%d and %d is %d\n\n", 3,4,5,maximum(3,4,5))
    }
}

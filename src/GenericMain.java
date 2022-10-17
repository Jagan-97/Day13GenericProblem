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
        System.out.printf("Maximum of %d,%d and %d is %d\n\n", 3,4,5,maximum(3,4,5));
        //Given 3 Float Number
        //Test case 1.1-Given Max Number at 1st Position return the Same Number
        System.out.printf("Maximum of %.1f,%.1f and %.1f is %.1f\n\n", 8.8,7.7,6.6,maximum(8.8,7.7,6.6));
        //Test case 1.2-Given Max Number at 2nd Position return the Same Number
        System.out.printf("Maximum of %.1f,%.1f and %.1f is %.1f\n\n", 7.7,8.8,6.6,maximum(7.7,8.8,6.6));
        //Test case 1.3-Given Max Number at 3rd Position return the Same Number
        System.out.printf("Maximum of %.1f,%.1f and %.1f is %.1f\n\n", 6.6,7.7,8.8,maximum(6.6,7.7,8.8));
        //Given 3 String Number
        //Test case 1.1-Given Max Number at 1st Position return the Same Number
        System.out.printf("Maximum of %s,%s and %s is %s\n", "Apple","Peach","Banana",maximum("Apple","Peach","Banana"));
        //Test case 1.2-Given Max Number at 2nd Position return the Same Number
        System.out.printf("Maximum of %s,%s and %s is %s\n", "Peach","Apple","Banana",maximum("Peach","Apple","Banana"));
        //Test case 1.3-Given Max Number at 3rd Position return the Same Number
        System.out.printf("Maximum of %s,%s and %s is %s\n", "Peach","Banana","Apple",maximum("Peach","Banana","Apple"));

    }
}

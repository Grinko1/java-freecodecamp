package base.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"a", "b", "c"};
        Double[] doubArray = {5.5, 3.4,6.6, 1.2};
//         displayArray(intArray);
//         displayArray(strArray);
//         displayArray(doubArray);
        getFirst(intArray);
        getFirst(strArray);
        getFirst(doubArray);
    }

    public static <T> void displayArray(T[] array) {
        for (T x : array){
            System.out.println(x+" ");
        }
        System.out.println();

    }
    public  static <T> T getFirst(T[] array){
        System.out.println(array[0]);
        return array[0];
    }
}

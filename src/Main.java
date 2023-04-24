import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] arrTwo = new int[5];
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = i;
        }
        int [][] arrD = new int[][]{{1,2},{3,4}};
        arrD = new int[][]{arr,arrTwo};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arrD));
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
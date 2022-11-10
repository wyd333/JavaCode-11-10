import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {1,2,4,6,8,10};
        System.out.println(Arrays.toString(array));

        int[] ret = grow(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret));
    }
    public static int[] grow(int[] array) {
        int[] tmpArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = 2 * array[i];
        }
        return tmpArray;
    }
}

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,4,6,8,10};
        System.out.println(Arrays.toString(array));

        int[] ret = grow(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret));

        int[] array3 = new int[10];
        Arrays.fill(array3,-1);
        System.out.println(Arrays.toString(array3));

        System.out.println(Arrays.equals(array, array3));

    }
    public static int[] grow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }
}

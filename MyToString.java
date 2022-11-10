public class MyToString {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        String ret = myToString(array);
        System.out.println(ret);
    }
    public static String myToString(int[] array) {
        String ret = "[";

        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
}

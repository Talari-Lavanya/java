package Arrays;

public class ArrayContains {
    public boolean containsValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayContains obj = new ArrayContains();
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Contains 30: " + obj.containsValue(arr, 30));
    }
}

package Arrays;

public class Index {
    public int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        Index obj = new Index();
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Index: " + obj.findIndex(arr, 30));
    }
}

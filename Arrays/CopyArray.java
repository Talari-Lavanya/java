package Arrays;

public class CopyArray {
    public int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        CopyArray obj = new CopyArray();
        int[] arr = {10, 20, 30, 40, 50};
        int[] result = obj.copyArray(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

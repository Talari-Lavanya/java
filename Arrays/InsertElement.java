package Arrays;

public class InsertElement {
    public int[] insertAtPosition(int[] arr, int value, int position) {
        int[] newArr = new int[arr.length + 1];
        
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        
        newArr[position] = value;
        
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        
        return newArr;
    }

    public static void main(String[] args) {
        InsertElement obj = new InsertElement();
        int[] arr = {10, 20, 30, 40, 50};
        int[] result = obj.insertAtPosition(arr, 25, 2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

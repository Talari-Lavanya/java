package Arrays;

public class RemoveElement {
    public int[] removeElement(int[] arr, int value) {
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        int[] arr = {10, 20, 30, 40, 50};
        int[] result = obj.removeElement(arr, 30);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

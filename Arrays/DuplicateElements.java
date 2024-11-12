package Arrays;

public class DuplicateElements {
    

        public int[] removeDuplicates(int[] arr) {
            int[] temp = new int[arr.length]; // Temporary array to store unique elements
            int index = 0;
    
            for (int i = 0; i < arr.length; i++) {
                boolean isDuplicate = false;
    
                // Check if arr[i] is already in the temp array
                for (int j = 0; j < index; j++) {
                    if (arr[i] == temp[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
    
                // If arr[i] is not a duplicate, add it to temp array
                if (!isDuplicate) {
                    temp[index++] = arr[i];
                }
            }
    
            // Create a new array of the correct size to hold the unique elements
            int[] uniqueArray = new int[index];
            for (int i = 0; i < index; i++) {
                uniqueArray[i] = temp[i];
            }
    
            return uniqueArray;
        }
    
        public static void main(String[] args) {
            RemoveDuplicates obj = new RemoveDuplicates();
            int[] arr = {1, 2, 2, 3, 4, 4, 5};
    
            int[] result = obj.removeDuplicates(arr);
            
            System.out.print("Array after removing duplicates: ");
            for (int value : result) {
                System.out.print(value + " ");
            }
        }
    }
        


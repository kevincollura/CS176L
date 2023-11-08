package Week9;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10, 5, 3, 4, 3, 5, 6};
        int[] arr2 = {6, 10, 5, 4, 9, 120, 4, 6, 10};

        int firstRepeatingIndex1 = findFirstRepeatingElementIndex(arr1);
        int firstRepeatingIndex2 = findFirstRepeatingElementIndex(arr2);

        System.out.println("First repeating element in array 1: " + (firstRepeatingIndex1 != -1 ? arr1[firstRepeatingIndex1] : "No repeating element"));
        System.out.println("First repeating element in array 2: " + (firstRepeatingIndex2 != -1 ? arr2[firstRepeatingIndex2] : "No repeating element"));
    }

    public static int findFirstRepeatingElementIndex(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }

        return -1; 
	}

}

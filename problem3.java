package Week9;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, 2, -1, 3, 0};
        int notRepeat = findNonRepeatingElement(arr);

        if (notRepeat != Integer.MIN_VALUE) {
            System.out.println("First number that does not repeat is: " + notRepeat);
        } else {
            System.out.println("No non-repeating element found");
        }
    }

    public static int findNonRepeatingElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return arr[i];
            }
        }

        return Integer.MIN_VALUE; 
	}

}

package Week9;
// Kevin Collura
public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
        reverseArray(arr);

        System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {

            int temp = arr[i];
            
            arr[i] = arr[length - 1 - i];
            
            arr[length - 1 - i] = temp;
        }
    }
	

}

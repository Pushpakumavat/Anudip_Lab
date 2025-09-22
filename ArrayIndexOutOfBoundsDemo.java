package Demo;

public class ArrayIndexOutOfBoundsDemo {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};  // array of size 5

        System.out.println("Array elements:");

        try {
            // Loop goes one step beyond the last index
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Element at index " + i + " : " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Array index out of bounds");
        }
    }
}


package Testquestions;
import java.util.Scanner;

public class Array {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] arr = new int[10];

	        // Input 10 elements into the array
	        System.out.println("Enter 10 elements:");
	        for (int i = 0; i < 10; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Determine the size of even and odd arrays
	        int evenCount = 0;
	        int oddCount = 0;
	        for (int i = 0; i < 10; i++) {
	            if (arr[i] % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        // Create even and odd arrays
	        int[] evenArray = new int[evenCount];
	        int[] oddArray = new int[oddCount];

	       
	        int evenIndex = 0;
	        int oddIndex = 0;
	        for (int i = 0; i < 10; i++) {
	            if (arr[i] % 2 == 0) {
	                evenArray[evenIndex++] = arr[i];
	            } else {
	                oddArray[oddIndex++] = arr[i];
	            }
	        }

	       
	        System.out.print("Even elements: ");
	        for (int i = 0; i < evenCount; i++) {
	            System.out.print(evenArray[i] + " ");
	        }
	        System.out.println();

	        System.out.print("Odd elements: ");
	        for (int i = 0; i < oddCount; i++) {
	            System.out.print(oddArray[i] + " ");
	        }
	    }
	}



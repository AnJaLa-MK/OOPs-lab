import java.util.Scanner;


public class searchelement {

   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Anjala Michael\n22mca007\nOOPS LAB\n20MCA132\nDate:26-04-2023");

        System.out.print("Enter the size of the array: ");

        int n = input.nextInt();

        int[] arr = new int[n];

      
  System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {

          arr[i] = input.nextInt();

	}

      
  System.out.print("Enter the element to search: ");
	int key = input.nextInt();

      
  boolean found = false;
	
	for (int i = 0; i < n; i++) {

         
         if (arr[i] == key) {

            		found = true;

		        System.out.println("Element found at position " + (i+1));
		        break;

		  }

      	}

      	if (!found) {

         System.out.println("Element not found in the array.");

	}

   }

}


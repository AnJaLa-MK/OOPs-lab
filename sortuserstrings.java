import java.util.Arrays;

import java.util.Scanner;


public class sortuserstrings {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Anjala Michael\n22mca007\nOOPS LAB\n20MCA132\nDate:26-04-2023");

      System.out.print("Enter the number of strings you want to sort: ");

      int n = input.nextInt();

      String[] names = new String[n];


      System.out.println("Enter the strings to be sorted:");

      for (int i = 0; i < n; i++) {

         names[i] = input.next();

      }


      Arrays.sort(names);


      System.out.println("Sorted Names: ");

      for (String name : names) {

         System.out.println(name);

      }
   
}

}


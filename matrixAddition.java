import java.util.Scanner;
public class matrixAddition{
	public static void main(String[] args){
	System.out.println("Name : Anjala Michael");
		System.out.println("Reg No : SJC22MCA-2007 ");
		System.out.println("Course : OOPS Lab ");
		System.out.println("Course code : 20MCA132 ");
		System.out.println("Date : 28/03/2023");
		int p, q, m, n,choice,d;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of rows and columns in first matrix : ");
		p = s.nextInt();
		q = s.nextInt();
		System.out.print("Enter number of rows and columns in second matrix : ");
		m = s.nextInt();
		n = s.nextInt();
		int a[][] = new int[p][q];
		int b[][] = new int[m][n];
		int c[][] = new int[m][n];
		System.out.println("Enter all the elements of first matrix : ");

		for (int i = 0; i < p; i++){
			for (int j = 0; j < q; j++){
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter all the elements of second matrix : ");
		for (int i = 0; i < m; i++){
 			for (int j = 0; j < n; j++){
				b[i][j] = s.nextInt();
			}
		}
	
		System.out.println("First Matrix : ");
		for (int i = 0; i < p; i++){
			for (int j = 0; j < q; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("Second Matrix : ");
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}	
			if( p == m && q == n){
				for (int k = 0; k < p; k++){
					for (int l = 0; l < q; l++){
						c[k][l] = a[k][l] + b[k][l];
					}
				}
				System.out.println("Matrix after addition : ");
				for (int k = 0; k < p; k++){
					for (int l = 0; l < q; l++){
						System.out.print(c[k][l]+" ");
					}
					System.out.println("");
				}
			}
			else{
				System.out.println("Addition would not be possible");
			}
		}
	}


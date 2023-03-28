import java.util.Scanner;
public class SymmetricMatrix{
	public static void main(String[] args){
		System.out.println("Name : Anjala Michael");
		System.out.println("Reg No : SJC22MCA-2007 ");
		System.out.println("Course : OOPS Lab ");
		System.out.println("Course code : 20MCA132 ");
		System.out.println("Date : 28/03/2023");
		int p,q,m,n,flag=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of rows and columns in the matrix : ");
		p = s.nextInt();
		q = s.nextInt();
		
		int a[][] = new int[p][q];
		//int b[][] = new int[m][n];
		
		System.out.println("Enter all the elements of the matrix : ");

		for (int i = 0; i < p; i++){
			for (int j = 0; j < q; j++){
				a[i][j] = s.nextInt();
			}
		}
		
		System.out.println("The given  Matrix is : ");
		for (int i = 0; i < p; i++){
			for (int j = 0; j < q; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		if(p!=q){
			System.out.println("The given matrix is not square matrix...so we can't check the symmetry of the matrix!!!");
		}
		else{
			for(int i=0;i<p;i++){
				for(int j=0;j<q;j++){
					if(a[i][j]==a[j][i]){
						flag=1;
					}
				}
			}
	
			if(flag==1){
				System.out.println("The given matrix is a symmetric matrix");
			}
			else{
				System.out.println("The given matrix is not a symmetric matrix ");
			}
		
		}
	}
}		

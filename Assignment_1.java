package in.ineuron.main;

public class Assignment_1 {

	public static void main(String[] args) {
		
		//Q1.1.Write a program(WAP) to print INEURON using pattern programming logic.
		
//		//I
//		int n=5;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==0  || i==n-1 || j==(n-1)/2) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			//N
//			for(int j=0;j<n;j++) {
//				System.out.print(" ");
//				if(j==0 || j==n-1 || i==j) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			//E
//			for(int j=0;j<n;j++) {
//				System.out.print(" ");
//				if(i==0 || j==0 || i==(n-1)/2 || i==n-1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			//U
//			for(int j=0;j<n;j++) {
//				System.out.print("  ");
//				if((j==0 && i!=n-1) || (j==(n-1)/2 && i<=(3*n)/4) || (i==n-1 && j<(n-1)/2 && j>0)  )  {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			//R
//			for(int j=0;j<n;j++) {
//				if(i==0 && j<(3*n)/4 || j==0|| (i==(n-1)/2 && j<(3*n)/4)  || (j==(3*n)/4 && i<(3*n)/4 && i>0 && i!=(n-1)/2) || i-j==(n-1)/2)  {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			//O
//			for(int j=0;j<n;j++) {
//				System.out.print(" ");
//				if((i==0 && j<n-1 && j>0) || (j==0 && i>0 && i<n-1) || (i==n-1 && j>0 && j<n-1 ) || (j==n-1 && i>0 && i<n-1) )  {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			for(int j=0;j<n;j++) {
//				System.out.print(" ");
//				if(j==0 || j==n-1 || i==j)  {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		Q2.Write a program to print
//			1 1 1 1
//			2 2 2 2
//			3 3 3 3
//			4 4 4 4
//
//		int n=5;
//		for(int i=1;i<n;i++) {
//			for(int j=1;j<n;j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println(" ");
//		}
		
		
//		Q3.
//		int n=11;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==0 && j<(n-1)/2 || j==0 && i<=(n-1)/2  || i+j<=(n-1)/2
//						|| j-i>=(n-1)/2 ||  j==n-1 && i<(n-1)/2 || i==n-1 || j==0 || j==n-1
//						) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		Q4.
//		int n=14;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i-j>=(n-1)/2 || i+j>=n-1+(n-1)/2 
//						
//						 
//						
//						) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
		
		
		//Q5.
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
					
				}
				
			}
		
			System.out.println();
		}
	}

}

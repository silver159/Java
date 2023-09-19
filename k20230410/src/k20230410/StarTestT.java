package k20230410;

public class StarTestT {

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		
//		i = 0, j = 0
//		i = 1, j = 0, 1
//		i = 2, j = 0, 1, 2
//		i = 3, j = 0, 1, 2, 3
//		i = 4, j = 0, 1, 2, 3, 4
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
//				System.out.printf("i = %d, j = %d\n", i, j);
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		
//		*****
//		****
//		***
//		**
//		*
		
//		i = 0, j = 0, 1, 2, 3, 4
//		i = 1, j = 0, 1, 2, 3
//		i = 2, j = 0, 1, 2
//		i = 3, j = 0, 1
//		i = 4, j = 0
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for (int i=0; i<5; i++) {
//			공백
			for (int j=0; j<=3-i; j++) {
				System.out.print(" ");
			}
//			별
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i-1; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		
	
//		*       *
//		**     **
//		***   ***
//		**** ****
//		*********
	
		for (int i=0; i<5; i++) {
//			별
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
//			공백
			for (int j=0; j<7-i*2; j++) {
				System.out.print(" ");
			}
//			별
			for (int j=0; j<=i; j++) {
				if (j == 4) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
}








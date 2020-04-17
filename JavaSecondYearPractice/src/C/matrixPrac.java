package C;

import java.util.Scanner;

public class matrixPrac {

	public static void main(String[] args) {
		int mat[][] = new int[3][3]; 
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i ++) {
			for( int j = 0; j < 3; j ++) {
				mat[i][j] = input.nextInt();
			}
		}
//		printer(mat);
		boolean ass = true;
		boolean dec = true;
		for(int i = 0; i < 3; i ++) {
			for(int j = 1; j < 3; j ++) {
//				System.out.println(mat[j][i] +"->"+mat[j-1][i]);
				if(mat[j][i] > mat[j-1][i]) {
					ass = ass && true;
					dec = dec && false;
				}
				else if(mat[j][i] < mat[j-1][i]) {
					dec = dec && true;
					ass = ass && false;
				}
				else {
					ass = false;
					dec = false;
				}
			}
			if(ass) {
				System.out.print("A ");
			}
			else if(dec) {
				System.out.print("D ");
			}
			else {
				System.out.print("N ");
			}
				
		}
		
		
	}

}

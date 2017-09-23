package ZuoYe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Êý×ÖÐý×ª·½Õó
 * @author lenovo
 *
 */

public class NumberMatrix {

	public static void main(String[] args) {
		int n = 0, i = 0, j = 0;
		int t;
		int num = 1;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[][] arr = new int[n][n];
		
//		arr[i][j] = num;
//		while(num < n * n + 1){
//			while(i < n && arr[i+1][j] == 0){
//				arr[i+1][j] = num++;
//				i++;
//			}
//			i--;
//			while(j < n & arr[i][j+1] == 0){
//				arr[i][j++] = num++;
//			}
//			j--;
//			while(i > -1 & arr[i-1][j] == 0){
//				arr[i--][j] = num++;
//			}
//			i++;
//			while(arr[i][j-1] == 0){
//				arr[i][j--] = num++;
//			}
//			j++;
//			
//		}
		
		for(t = 0; t <= n; t++){
			for(i = t, j = t ; i < n - t ; i++){
				arr[i][j] = num++;
			}
			for(i = i - 1, j = j + 1; j < n - t; j++){
				arr[i][j] = num++;
			}
			for(j = j - 1, i = i - 1; i >= t; i--){
				arr[i][j] = num++;
			}
			for(i = i + 1, j = j - 1; j > t; j--){
				arr[i][j] = num++;
			}
		}
		
		for(int h = 0; h < n; h++){
			for(int l = 0; l < n; l++){
				System.out.print(arr[h][l] + "  ");
			}
			System.out.println();
		}

	}

}

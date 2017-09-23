package ZuoYe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 一个数按照二倍的顺序递增
 * @author lenovo
 *
 */

public class DiZeng {
	public static void fun(int num, int tag, int cnt){
		if(num > 5000)
			System.out.println(num);
		System.out.println(num);
		if(tag == 1 && num < 5000){
			fun(num * 2, 1, cnt + 1);
		}
		else{
			if(cnt == 0)	return;
			fun(num / 2,0, cnt - 1);
		}
	}

	public static void main(String[] args) {
		int num = 0;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		fun(num,1, 0);
		
//		ArrayList arr = new ArrayList();
//		while(num <= 10000){
//			arr.add(num);
//			num *= 2;
//		}
//		for (Object object : arr) {
//			System.out.println(object);
//		}
//		for(int i = arr.size() - 1; i > -1; i--){
//			System.out.println(arr.get(i));
//		}

			

	}

}

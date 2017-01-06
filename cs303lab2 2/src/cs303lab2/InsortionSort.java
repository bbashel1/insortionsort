package cs303lab2;

import java.util.Arrays;

public class InsortionSort {
	public static void insortionsort(int[] A){
		System.out.println(Arrays.toString(A));
			int length = A.length;
			for  (int j = 1; j < length; j++){
				int k = A[j];
				int i = j -1;
				while ((i >= 0) && (A[i] > k)){
					A[i+1] = A[i];
					i = i -1;
					A[i+1] = k;
				}
		}
	System.out.println(Arrays.toString(A));
	}
}

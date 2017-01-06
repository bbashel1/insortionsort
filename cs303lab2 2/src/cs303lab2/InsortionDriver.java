package cs303lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsortionDriver {
	private static long startTime = System.currentTimeMillis();
	public static void main(String[] args){
		double total = 0;
		int[] array = new int[5000000];
		try{
			Scanner scan = new Scanner (new File("input_5000000.txt"));
			//InsortionSort.insortionsort(scan);
			System.out.println(scan);
				int x = 0;
				while(scan.hasNext()){
				array[x++] = scan.nextInt();
				}
				scan.close();
				array[0]=500;
				InsortionSort.insortionsort(array);
				//System.out.println(array);
				long endTime = System.currentTimeMillis();
				System.out.println("it took " + (endTime - startTime) + " milliseconds");
		
				
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}

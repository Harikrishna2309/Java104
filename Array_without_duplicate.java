//Given an array of numbers. Print the numbers without duplication.
package Java104;
import java.util.*;

public class Array_without_duplicate {
	public static void printArray(int[]arr, int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Size of Array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Input Array");
		printArray(arr, size);
//---------------------BY SET---------------------------------
		HashSet <Integer> set = new HashSet<>();
		for(int i: arr) {
			set.add(i);
		}
		System.out.println("duplicate removed array by set ");
		System.out.println(set.toString());
		
//----------------------BY LOOP -----------------------------
		int dup_count=0;
		for(int i=0;i<size-1-dup_count;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					dup_count++;
					for(int k=j;k<size-1;k++) {
						arr[k]=arr[k+1];
					}

				}
			}
		}		
//---------------------------------------------------git check
		System.out.println("duplicate removed Array by loop");
		printArray(arr,(size-dup_count));
		

	}

}

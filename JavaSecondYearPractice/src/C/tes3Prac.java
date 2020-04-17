package C;

import java.util.*;

public class tes3Prac {
	
	
	
	public static void main(String[] args ) {
//		Random rand = new Random();
//		int x = rand.nextInt(10);
//		int [] myArr = new int[x];
//		for(int i = 0; i < x; i ++ ) {
//			myArr[i] = rand.nextInt(50);
//			System.out.print(myArr[i] +", ");
//		}
//		System.out.println("\n");
		
		int[] myArr = {1,2,5,5,6,8,4,3,10};
		System.out.println(mostFrequent(myArr, myArr.length));
		
	}
	static int mostFrequent(int arr[], int n) 
    { 
          
        // Sort the array 
        Arrays.sort(arr); 
          
        // find the max frequency using linear 
        // traversal 
        int max_count = 1, res = arr[0]; 
        int curr_count = 1; 
          
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
      
        // If last element is most frequent 
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[n - 1]; 
        } 
      
        return res; 
    } 
}	

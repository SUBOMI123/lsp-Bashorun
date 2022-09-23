package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;

public class Combinations {

	// Method to find the sets with given sum
    public void calculate_combinations(ArrayList<ArrayList<Integer>> answer, 
        int input[], 
        ArrayList<Integer> tmp, 
        int sum, 
        int start) {
    	
  

		// if curr_target < 0 then the sum of
		// the current set
		// in tmp is greater than target
		if(start > input.length || sum < 0)
			return ;

		// if(curr_target == 0) means that the sum of this set is equal to target
		if(sum == 0) {
        	answer.add(new ArrayList<Integer>(tmp));
			return;
		} else {
			for (int i = start; i<input.length; i++) {
                // Add the value to the temporary answer
				tmp.add(i);

                // Decrease the curr_target by substracting added value
				calculate_combinations(answer, input, tmp, sum - input[i], i+1);

                // Backtrack and remove the temporary added value from answer
				tmp.remove(tmp.size()-1);
			}
		}
    }
    
    // Prints the indexes in each set on a new line
    public void printSets(ArrayList<ArrayList<Integer>> answer) {

        int n = answer.size();
        
        if(n == 0) {
        	System.out.println("[]");
        	return;
        }
        

        // Loop to print the subsequences
		for(int i = 0; i<n; i++){

            int m = answer.get(i).size();
            System.out.print("[");

			for(int j = 0; j<m ; j++){
                System.out.print(answer.get(i).get(j));
                
                if(j != m-1)
				    System.out.print(", ");
			}
			System.out.println("]");
		}
    }
}

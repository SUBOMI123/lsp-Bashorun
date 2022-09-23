package org.howard.edu.lsp.assignment3;


import java.util.ArrayList;
import java.util.Arrays; 

public class Driver {
    // Driver method
    public static void main(String[] args) {

        // Create combination object
        Combinations comb = new Combinations();
        // Stores the answer
        ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();

        // Declare array 1
        int arr1[] = {5, 5, 15, 10};
        int target1 = 15;    // Assign target sum
    
        // Find the sets and store them in the answer
        comb.calculate_combinations(answer, arr1, new ArrayList<Integer>(), target1, 0);
        // Print the answers
        System.out.println("Input: "+ Arrays.toString(arr1)+" Sum: "+ target1);
        System.out.println("Combinations: ");
        comb.printSets(answer);

        // Declare array 2
        int arr2[] = {1, 2, 3, 4, 5, 6};
        int target2 = 6;    // Assign target sum
        answer.clear();     // Clear answer

        // Find the sets and store them in the answer
        comb.calculate_combinations(answer, arr2, new ArrayList<Integer>(), target2, 0);
        // Print the answers
        System.out.println("Input: "+ Arrays.toString(arr2)+" Sum: "+ target2);
        System.out.println("Combinations: ");
        comb.printSets(answer);
        
     // Declare array 3
        int arr3[] = {};
        int target3 = 15;    // Assign target sum
        answer.clear();     // Clear answer

        // Find the sets and store them in the answer
        comb.calculate_combinations(answer, arr3, new ArrayList<Integer>(), target3, 0);
        // Print the answers
        System.out.println("Input: "+ Arrays.toString(arr3)+" Sum: "+ target3);
        System.out.println("Combinations: ");
        comb.printSets(answer);
        
     // Declare array 4
        int arr4[] = {2,2,2};
        int target4 = 5;    // Assign sum
        answer.clear();     // Clear answer

        // Find the sets and store them in the answer
        comb.calculate_combinations(answer, arr4, new ArrayList<Integer>(), target4, 0);
        // Print the answers
        System.out.println("Input: "+ Arrays.toString(arr4)+" Sum: "+ target4);
        System.out.println("Combinations: ");
        comb.printSets(answer);
    }
}

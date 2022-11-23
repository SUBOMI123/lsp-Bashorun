package org.howard.edu.lsp.assignment7;

import java.util.Collections;
import java.util.List;

class ClassAverageLow implements AverageStrategy {

    @Override
    /**
	   * This returns the average from a list of grades, if the grade size is greeter than 2 it drops the two lowest and then find the average else it just finds the avergae
	   * @param grades
	   * @return average of the grades or average of the grades after dropping two lowest
	   * @throws EmptyListException "list is empty"
	   */
    public int compute(List<Integer> grades) throws EmptyListException {
            if(grades.size() == 0) {
                    throw new EmptyListException();
            }
            
            int counter = 0;
            int sum = 0;
            int res = 0;
            int n = grades.size();
            Collections.sort(grades);
            if(n == 1 || n == 2) {
            	for(int i = 0; i <n; i++) {
            		sum += grades.get(i);
            	}
            res = sum/n;

            }else {
            	for(int i=2; i<n; i++) {
                    sum += grades.get(i);
                    counter++;
            	}
            res = sum/counter;
            }
            
            return res;
    }
    
}

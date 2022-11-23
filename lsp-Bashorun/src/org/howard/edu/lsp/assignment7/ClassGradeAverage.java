package org.howard.edu.lsp.assignment7;

import java.util.Collections;
import java.util.List;
/**
 * 
 * @author sucrepapitoo
 *
 */
class ClassGradeAverage implements AverageStrategy {
    @Override
    /**
	   * This returns the average grades from a list of integer number
	   * @param grades, takes in a list of integer grades
	   * @return average of the grades 
	   * @throws EmptyListException "list is empty"
	   */
    public int compute(List<Integer> grades) throws EmptyListException {
            if(grades == null || grades.size() < 1) {
                    throw new EmptyListException();
            }
            int sum = 0;
            int res = 0;
            int n = grades.size();
            Collections.sort(grades);
            for(int i=0; i<n; i++) {
                    sum += grades.get(i);
            }
            res = sum/n;
            return res;
    }
}
    

    

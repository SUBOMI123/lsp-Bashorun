package org.howard.edu.lsp.assignment7;

import java.util.List;

public class AverageContext {
	private AverageStrategy strategy;
	  public void setAverageStrategy(AverageStrategy strategy){
	    this.strategy = strategy;

	  }
	  /**
	   * This returns the average from a list of grades in regards to the strategies passed into it
	   * @param grades
	   * @return average of the grades
	   * @throws EmptyListException
	   */
	  public int computeAverage(List<Integer> grades) throws EmptyListException{
	  
			return strategy.compute(grades);
		
		
	  }
}

package org.howard.edu.lsp.assignment7;

import java.util.List;

public class AverageContext {
	private AverageStrategy strategy;
	  public void setAverageStrategy(AverageStrategy strategy){
	    this.strategy = strategy;
	  }

	  public void computeAverage(List<Integer> grades){
	    strategy.compute(grades);
	  }
}

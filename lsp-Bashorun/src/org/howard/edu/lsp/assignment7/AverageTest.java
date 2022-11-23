package org.howard.edu.lsp.assignment7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class AverageTest {
	@Test
    public void testClassGradeAverage() {
        AverageContext grade = new AverageContext();
        grade.setAverageStrategy(new ClassGradeAverage());
        try {
                assertEquals(2, grade.computeAverage(Arrays.asList(1, 2, 3)));
        } catch (EmptyListException e) {
                fail();
        }
    }


    @Test
    public void testClassAverageLow() {
    	AverageContext grade = new AverageContext();
        grade.setAverageStrategy(new ClassAverageLow());
        try {
                assertEquals(3, grade.computeAverage(Arrays.asList(1, 2, 3)));
        } catch (EmptyListException e) {
                fail();
        }
    }
    @Test
    public void testClassAverageLow2() {
    	AverageContext grade = new AverageContext();
        grade.setAverageStrategy(new ClassAverageLow());
        try {
        	assertEquals(2, grade.computeAverage(Arrays.asList(1,3)));
        } catch (EmptyListException e) {
        	fail();
        }
    }


    @Test
    public void testClassGradeAverageException() {
    	AverageContext grade = new AverageContext();
        grade.setAverageStrategy(new ClassGradeAverage());
            try {
                    grade.computeAverage(Arrays.asList());
                    fail();
            } catch (EmptyListException e) {
            }
    }


    @Test
    public void testClassAverageLowException() {
    	AverageContext grade = new AverageContext();
        grade.setAverageStrategy(new ClassAverageLow());
            try {
                    grade.computeAverage(Arrays.asList());
                    fail();
            } catch (EmptyListException e) {
            }
    }
    
    

}

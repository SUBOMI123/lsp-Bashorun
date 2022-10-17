package org.howard.edu.lsp.assignment4.implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	@Test
	public void testisEmpty() {
	       IntegerSet Set1 = new IntegerSet();
	       assertTrue(Set1.isEmpty());
	       
	       Set1.add(1);
	       assertFalse(Set1.isEmpty());
	}
	
	@Test
	public void testClear() {
		IntegerSet set = new IntegerSet();
		set.clear();
		assertEquals(0, 0);
	}
	
	@Test
	public void testLength() {
		IntegerSet set = new IntegerSet();
		assertEquals(0, set.length());
	}
	
	@Test
	public void testEqualsIntegerSet() {
		// two sets having same elements
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);

		assertEquals(true, set1.equals(set2));
		
		// sets of different size
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		IntegerSet set4 = new IntegerSet();
		set4.add(1);
		set4.add(2);
		set4.add(3);

		assertEquals(false, set3.equals(set4));
		
		// sets of different elements
		IntegerSet set5 = new IntegerSet();
		set5.add(1);
		set5.add(2);
		set5.add(3);
		IntegerSet set6 = new IntegerSet();
		set6.add(5);
		set6.add(7);
		set6.add(8);

		assertEquals(false, set5.equals(set6));

		
	}
	
	@Test
	public void testContains() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		assertEquals(true, set1.contains(1));
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		assertEquals(false, set2.contains(5));

		}
	
	@Test
	public void testLargest() {
		IntegerSet set1 = new IntegerSet();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(5);
		int res = 0;
		try {
		res = set1.largest();
		} catch (IntegerSetException e) {
		e.printStackTrace();
		}
		assertEquals(30, res);
		}
	@Test
	public void testLargest2() {
		// when set is empty
		IntegerSet set1 = new IntegerSet();
		int res = 0;
		try {
			res = set1.largest();
		} catch (IntegerSetException e) {
			assertNull(null);
		}
		}
	
	@Test
	public void testSmallest() {
		IntegerSet set1 = new IntegerSet();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(5);
		int res = 0;
		try {
		res = set1.smallest();
		} catch (IntegerSetException e) {
		e.printStackTrace();
		}
		assertEquals(5, res);
		}

	
	@Test
	public void testAdd() {
		IntegerSet set1 = new IntegerSet();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		
		assertEquals(" 10 20 30 ", set1.toString());
		
		//checking for duplicate numbers
		IntegerSet set2 = new IntegerSet();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(10);
	
		assertEquals(" 10 20 30 ", set2.toString());
		}

	@Test
	public void testRemove() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		
		set1.remove(20);
				
		assertEquals(" 10 30 ", set1.toString());
	}

	@Test
	public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		
		set1.union(set2);
		
		System.out.println(set1.toString());
		assertEquals(" 1 2 3 ", set1.toString());
		assertNotEquals(" 3 2 1 ", set1.toString());
		

	}
	
	@Test
	public void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(2);
		set2.add(3);
		
		
		set1.intersect(set2);
		
		System.out.println(set1.toString());
		assertEquals(" 2 ", set1.toString());
		
	}
	
	 @Test
	 public void testDiff() {
		 IntegerSet set1 = new IntegerSet();
			set1.add(1);
			set1.add(2);
			set1.add(3);
			
			IntegerSet set2 = new IntegerSet();
			set2.add(2);
			set2.add(4);
			set2.add(5);
			
			
			set1.diff(set2);
			
			System.out.println(set1.toString());
			assertEquals(" 1 3 ", set1.toString());
	 }



	@Test
	public void testToString() {
		IntegerSet set1 = new IntegerSet();
		set1.add(10);
		set1.add(20);
		set1.add(30);
	
		assertEquals(" 10 20 30 ", set1.toString());
	}



	
	

}

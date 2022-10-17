package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author sucrepapitoo
 *
 */
public class IntegerSet {
 private ArrayList<Integer> set = new ArrayList<Integer>();
 
 /**
  * Default Constructor
  */
 public IntegerSet() {}
 
 /**
  * 
  * @return the set
  */
 public ArrayList<Integer> getSet() {
     return this.set;
 }
 
 /**
  * Clears the internal representation of the set
  */
 public void clear() {
     this.set.clear();
 }
 
 
 /**
  * @return the length of set
  */
 public int length() {
     return this.set.size();
 }
 
 /**
  * This methods true if 2 sets are equal, false otherwise
  * @param b, the value being checked if sets are equal or not
  * @return true if 2 sets are equal, false otherwise
  */
 
 public boolean equals(IntegerSet b) {
     return this.set.equals(b.getSet());
 }
 
 /**
  * @param value, the item being checked if its in the set
  * @return true if the set contains the value, false otherwise
  */
 public boolean contains(int value) {
     return this.set.contains(value);
 }
 
 /**
  * @return true if the set is empty, false otherwise
  */
 boolean isEmpty() {
     return this.length() == 0;
 }
 
 /**
  * @return the largest item in the set
  * @throws IntegerSetException if set is empty
  */
 public int largest() throws IntegerSetException {
	  if (set.size() == 0) {
	    throw new IntegerSetException("Set is empty!");
	  }
	  else{
	    return Collections.max(set);
	  }
	
	}; 
 
 /**
  * @return the smallest item in the set
  * @throws IntegerSetException if set is empty
  */
 
 public int smallest() throws IntegerSetException{
	  if (set.size() == 0)
	  {
	    throw new IntegerSetException("Set is empty!");
	  }
	  else
	  {
	    return Collections.min(set);
	    
	  }
	}
 
 /**
  * @param item, the item to be added to the set
  * Adds an item to the set or does nothing if it's already there
  */
 public void add(int item) {
     if (!this.contains(item)) {
         this.set.add(item);
     }
 }
 
 /**
  * Removes an item from the set or does nothing if it's not there
  * @param item, the item to be removed from the set
  * @throws IntegerSetException
  */
 public void remove(int item) throws IntegerSetException {
     if (this.isEmpty()) {
         throw new IntegerSetException("Set is empty!");
     }
     
     if (this.contains(item)) {
    	 int index = this.set.indexOf(item);
         this.set.remove(index);
         
     }
     
 }
 
 /**
  * Set union
  * @param intSetb, one of the set
  */
 public void union(IntegerSet intSetb) {
     for (int item : intSetb.getSet()) {
         this.add(item);
     }
 }
 
 /**
  * Set intersection
  * @param intSetb, one of the set
  */
 public void intersect(IntegerSet intSetb) {
     this.set.retainAll(intSetb.getSet());
 }
 
 /**
  * Set difference
  * @param intSetb, one of the set
  */
 public void diff(IntegerSet intSetb) {
     for (int item : intSetb.getSet()) {
         if (this.contains(item)) {
        	 int index = this.set.indexOf(item);
             this.set.remove(index);
         }
     }
 }
 
 /**
  *  String representation of the set
  */
 public String toString() {
     String returnStr = " ";
     
     for (int item : this.getSet()) {
         returnStr += String.format("%d ", item);
     }
     
     return returnStr;
 }


}
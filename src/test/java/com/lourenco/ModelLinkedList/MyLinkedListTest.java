package com.lourenco.ModelLinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * Class to test {@link App}
 */
 
public class MyLinkedListTest {
 
	MyLinkedList myList = new MyLinkedList();
	
	@Rule
	public ErrorCollector error = new ErrorCollector();

	@Test
	public void ListEmpty(){
		
		error.checkThat(myList.Build().size(), is(0)); 
	}

	
	@Test
	public void ListNewData(){
		
		myList.Add(11);
		myList.Add(12);
		myList.Add(13);
		myList.Add(14);
 
		error.checkThat(myList.Build().size(), is(3)); 
	}
 	
	@Test
	public void getElement(){ 
 
		error.checkThat(myList.GetElement(3), is(13)); 
	}
   

	@Test
	public void removeElement(){ 
		
		error.checkThat(myList.Remove(12), is(true)); 
	}
	
}

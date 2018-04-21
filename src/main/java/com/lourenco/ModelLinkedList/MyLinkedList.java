package com.lourenco.ModelLinkedList;

import java.util.LinkedList;
 

/**
 * Class to control List elements 
 * 
 * @author conceicaoLourenco
 * 
 */
public class MyLinkedList 
{
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	public void Add(Integer elem) {
		 System.out.println("\n Add elem "+ elem +" in list ");
		 list.add(elem);
	 }
	 
	 public boolean Remove(Integer elem) {
 
		 System.out.println(" \n Achou  : " + elem +" - "+ list.indexOf(elem));
		 
		 if(list.indexOf(elem) == -1) {
			 System.out.println("\n The elem "+ elem +" not found in list");
			 return false;
		 } else {
			 System.out.println("\n Remove elem "+ elem +" of list");
			 list.remove(elem);
			 return true;
		 }
	 }
	 
	 
	 public Integer GetElement(Integer index) {
		 
		 if(!list.isEmpty() && (list.get(index) != -1)) {
			 System.out.println("\n Get elem of index "+ index +"  in list ");
			 return list.get(index);
		 } else {
			 System.out.println("\n Not exist Element in index "+ index +" this list "); 
			 return 0;
		 }
	 }
	 
	 
	 public  LinkedList<Integer> Build() {
		 if(!list.isEmpty()) {
			System.out.println("\n Get All Elements of list ");
		 } else {
			 System.out.println("\n The list is Empty ! "); 
		 }
		 return list;
	 }
	 
    public static void main( String[] args ) {
    	
    	MyLinkedList list = new MyLinkedList();
    	list.Add(12);
    	list.Add(13);
    	
    	for(Integer elem : list.Build()) {
			 System.out.println(" [ " + elem +" ] ");
		 }
    	
    	 
    	list.Remove(14);
		  
		 
		 for(Integer elem : list.Build()) {
			 System.out.println(" [ " + elem +" ] ");
		 }
    }
}

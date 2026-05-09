package com.java.TranningSession.Linklist;

public class Main {
	
	public static void main(String[] args)
	{
		SimplyLinklist list = new SimplyLinklist();
		list.InsertAtBeginning(10);
		list.InsertAtEnd(200);
		list.InsertAtEnd(300);
		list.InsertAtEnd(400);
		
		list.DisplayList();
		list.Reverse();
		list.DisplayList();
		
	
		
	}

}

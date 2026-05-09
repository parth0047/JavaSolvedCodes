

package com.java.TranningSession.Linklist;

//Creating A Singly Link List List Operations
public class SimplyLinklist 
{
	
	private Node Head;//This Is Head Node Pointer Which will Points to The First 
	
	public void InsertAtBeginning(int Data)
	{
		Node NewNode = new  Node(Data);
		NewNode.next = Head;
		Head = NewNode;
	}
	//-------------------------------------------
	
	
	public void InsertAtEnd(int Data)
	{
		Node NewNode = new Node(Data);
		if(Head == null)
		{
			Head = NewNode;
			return;
		}
		Node DummyNode = Head;
		while(DummyNode.next != null)
		{
			DummyNode = DummyNode.next;
		}
		//Once DummyNode Reached to End
		DummyNode.next =NewNode;
	}
	//-----------------------------------------------------
	
	
	public void DisplayList()
	{
		if(Head == null)
		{
			System.out.println("LinkList is Empty.");
			return;
		}
		Node DummyNode = Head;
		while(DummyNode != null)
		{
			System.out.print(DummyNode.data	+ "-->");
			DummyNode=DummyNode.next;
		}
		System.out.println("NULL");
	}
	//----------------------------------------------------
	
	
	public void InsertAtIndex(int data , int position)
	{
		int count = 1;
		Node list = Head;
		Node NewNode = new Node(data);
		if(Head == null)
		{
			System.out.println("LinkList is Empty.");
			return;
		}
		else if(position < 1)
		{
			System.out.println("Entered position is less than 1");
			return;
		}
		
		while(list.next != null)
		{
			if(position == count+1)
			{
				break;
			}
			list=list.next;
			++count;
		}
		NewNode.next = list.next;
		list.next = NewNode;
			
	}
	//delete by value
	public void Delval(int data)
	{
		Node list = Head;
		if(Head.data == data) {
			Head = Head.next;
			return;
		}
		while(list.next.data != data)
		{
			list=list.next;
		}
		
		list.next = list.next.next;
		
	}
	public void Reverse()
	{
		Node previous = null;
		Node curr = Head;
		Node temp;
		
		while(curr != null)
		{
			temp= curr.next;
			curr.next = previous;
			previous = curr;
			curr = temp;
			
		}
		Head = previous;
	}
}

	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


package Basic;

import java.util.Scanner;

class Node{
	int data;   // Holds the value of the node
    Node next;  // Points to the next node in the list
	
	Node(int data){	// Constructor to create a new node

		this.data = data;
		this.next = null ;	// Initially, this node does not point to any other node
	}
}

class StackLinkedList{
	private  Node top = null;
	
	public void push(int val) {
		Node newNode = new Node(val);
		newNode.next= top;		// Initially, this node does not point to any other node
		System.out.println(newNode.next);
		top = newNode;	// Initially, this node does not point to any other node
		System.out.println(top);
		System.out.println("Node element sucessfully " +val);
	}
	
	public void pop() {
		if(top == null) {
			System.out.println("Stack is Empty ");
		}else {
			System.out.println("Element deleted sucessfully, Deleted element: "+ top.data);
			top = top.next; 	// Initially, this node does not point to any other node
		}
	}
	
	public void displayStack() {
		if(top == null) {
			System.out.println("Stack is Empty ");
		}else {
			Node temp = top;
			System.out.println("Stack Elements are: ");
			while(top!= null) {
				System.out.println(temp.data + "  ");
				temp = temp.next; //Move to the next node
			}
			System.out.println("Stack is Empty");
		}
	}
}
public class StackUsingLinkedList {

	public static void main(String[] args) {
		
		StackLinkedList stack = new StackLinkedList(); // Create a new stack
		Scanner sc = new Scanner(System.in);  // Create a scanner for user input
		         
		int choice, value;  // Variables for user choice and input value

		System.out.println(":: Stack using Linked List in Java ::");

		while (true) {  
			System.out.println("\n.......MENU.......");
		    System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
		    System.out.print("Enter your choice: ");
		    choice = sc.nextInt();  
		            
		    	switch (choice) {
		        	case 1:  
		                    System.out.print("Enter the value to insert: ");
		                    value = sc.nextInt();  // Get the value to push
		                    stack.push(value);  
		                    break;
		            case 2:  
		                    stack.pop();  
		                    break;
		            case 3:  
		                    stack.displayStack();  
		                    break;
		            case 4:  // User wants to exit the program
		                    System.out.println("Exiting program...");
		                    sc.close(); 
		                    System.exit(0);  // Exit the program
		            default:  // Invalid choice
		                    System.out.println("Wrong selection! Please try again.");
		            }
		        }
	}

}

package com.slash.druva;

/**
 * Druva Question - Linked List Loop Detection
 * 
 * Using Floyd's Cycle-Finding Algorithm
 * 
 * @author Slash
 * 
 * @see https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
 *
 */
public class LinkedListLoopDetection {

	Node head;

	// Linked list node
	class Node {
		int data;
		Node next;

		// Node class - Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {

		LinkedListLoopDetection lList = new LinkedListLoopDetection();

		lList.push(20);
		lList.push(4);
		lList.push(15);
		lList.push(10);
		
		lList.printLinkedList(lList.head);

		System.out.println("\nHead data: " + lList.head.data);
		
		// Create loop for testing
		lList.head.next.next.next.next = lList.head;
		
		lList.detectLoop();
	}

	// Push data in Linked List
	public void push(int newData) {
		// 1. Allocate node and put in data
		Node newNode = new Node(newData);
		// 2. Make next of newNode as head
		newNode.next = head;
		// 3. Move the head to point to NewNode
		head = newNode;
	}

	// Detect Loop
	public int detectLoop() {

		Node slowPointer = head;
		Node fastPointer = head;

		while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;

			if (slowPointer == fastPointer) {
				System.out.println("Loop detected!" + slowPointer.data + " " + fastPointer.data);
				return 1;
			}
		}
		System.out.println("Loop not detected!");
		return 0;
	}

	// Print Linked List
	public void printLinkedList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}

package test1;

import java.util.Scanner;

public class Queue {
	private char[] queueArr;
	private int maxSize;
	private int rear;
	private int front;
	private int nItems;

	public Queue(int s) {
		maxSize = s;
		queueArr = new char[maxSize];
		rear = -1;
		front = 0;
		nItems = 0;

	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (rear == (maxSize - 1));
	}

	// insert
	public void insert(char i) {

		if (nItems == maxSize) {
			System.out.println("Queue is full");

		} else {

			if (rear == maxSize - 1)
				rear = -1;

			queueArr[++rear] = i;
			nItems++;

		}

	}

	// remove
	public char remove() {

		if (nItems == 0) {

			System.out.print("Queue is empty");
			return '.';

		} else {
			nItems--;

			char temp = queueArr[front++];

			if (front == maxSize)
				front = 0;

			return temp;

		}
	}

}
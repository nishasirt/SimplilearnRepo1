package com.learn.datastructure;

import java.util.Scanner;

public class QueueDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of qu");
		int s = sc.nextInt();

		int[] q = new int[s];

		int front = -1, rear = -1;

		System.out.println("operation q");

		while (true) {

			System.out.println("select 1.enque  2. dequeue  3. display  4. exit");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
              //overflow con
				
				if(rear==s-1)
				{
				System.out.println("Q is full");	
					
					
				}
				
				else{
					
					System.out.println("enter a element");
					
					int key=sc.nextInt();
					rear++;
					q[rear]=key;
					front=0;
					
					
				}
				break;
			case 2:
				
				if(front==-1&&rear==-1||(front>rear))
				{
					
					System.out.println("q i empty");
				}
				else{
					
					front=front+1;
					
					
				}
				

				break;
			case 3:
				if(front==-1&&rear==-1||(front>rear))
				{
					
					System.out.println("q i empty");
				}
				
				else {
					for (int i = front; i <= rear; i++) {
						System.out.println(q[i]);
					}
				}
				break;
			case 4:
                 System.exit(0);
				break;

			default:
				System.out.println("check ur choice");
				break;
			}
		}
	}
}

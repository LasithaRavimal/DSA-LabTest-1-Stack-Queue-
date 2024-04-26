//Lasitha_Ravimal-2Y2Sem-DSA-Lab_Test1

package test1;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int arrSize = 5;

		Queue queueArr = new Queue(arrSize);
		Stack stackArr = new Stack(arrSize);

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arrSize; i++) {

			System.out.print("Enter charater : ");
			char c = sc.next().charAt(0);
			queueArr.insert(c);
		}

		for (int i = 0; i < arrSize; i++) {
			
//			System.out.println(queueArr.remove());
			stackArr.push(queueArr.remove());
			
		}
		for (int i = 0; i < arrSize; i++) {
			
//			System.out.println(stackArr.pop());
			queueArr.insert(stackArr.pop());

		}
		for (int i = 0; i < arrSize; i++) {

			System.out.println(queueArr.remove());

		}

	}

}

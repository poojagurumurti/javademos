package serialization;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
//		ScannerDemo1();
		ScannerDemo2();
	}
	private static void ScannerDemo2() {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(char to exit): ");
		while(sc.hasNextInt()) {
			int num =sc.nextInt();
			sum+=num;
			System.out.println("Enter a number(char to exit): ");
		}
		System.out.println("sum:"+sum);
		}

	private static void ScannerDemo1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter students id:");
		int id = sc.nextInt();
		System.out.println("Enter the student name");
		String name =sc.next();
		System.out.println("Enter Student score");
		double score = sc.nextDouble();
		System.out.println("Student Details:");
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Score :"+score);
	}

}

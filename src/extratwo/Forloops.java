
package extratwo;

import java.util.Random;

import javax.swing.JOptionPane;

public class Forloops {
public static void main(String[] args) {
	//SINGLE LOOPS
//1
	//for(int i=0;i<=100;i++) {
	//System.out.println(i);
	//}
	
//2	
	//for(int i=100;i>=0;i--) {
		//System.out.println(i);
	//}
	
//3
	//for(int i=2;i<102;i+=2) {
		//System.out.println(i);
	//}
	
//4
	//for(int i=1;i<100;i+=2) {
		//System.out.println(i);
	//}

//5	
	//for(int i=1;i<501;i++) {
		//if(i%2==0) {
	//	System.out.println(i+" is even.");
		//}
	//	else {
		//	System.out.println(i+" is odd.");
		//}
	//}
	
//6
	//for(int i=0;i<=777;i+=7) {
		//System.out.println(i);
	//}
	
//7	
		
	//for(int i=2004;i<2019;i++) {
	//int j= i-2004;
		//System.out.println("In "+i+", I was "+j+".");
	//}
	
	
	//NESTED FOR-LOOPS
	
//1	
	//for(int i=0;i<3;i++) {
		//for(int j=0;j<3;j++) {
			//System.out.print(i);
			//System.out.println(" "+j);
		//}
//	}
	
//2	
//	int k=1;
//	
//	for(int i=1;i<4;i++) {
//		String wha="";
//		for(int j=1;j<4;j++) {
//		wha+=Integer.toString(k)+" ";
//		k=k+1;
//	}
//		System.out.println(wha);
//	}
	
	
////3	
//	int m=1;
//	
//	for(int i=1; i<11;i++) {
//		String bogus="";
//		for(int j=1;j<11;j++) {
//			bogus+=Integer.toString(m)+" ";
//			m=m+1;
//		}
//		System.out.println(bogus);
//	}
	
	
	//4

//		for(int i=1;i<7;i++) {
//
//			for(int j=0; j<i; j++) {
//			System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
	
	//Bonus?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!
	
//	for(int i=0;i<101;i++) {
//		int j= 100-i;
//			System.out.println(j);
//			}
	
	
	
	
	
	
	// Practice exam Questions
	// (1
	
	//String favo= JOptionPane.showInputDialog("What is your favorite day of the week?");
	//if(favo.equals("monday")) {
		//JOptionPane.showMessageDialog(null,"You're lying!");
	//}
	//	JOptionPane.showMessageDialog(null,"You're lying!");
	//}
	
	
	// (2
	
	//String numnum = JOptionPane.showInputDialog("Give me a number");
	//int x = Integer.parseInt(numnum) ;
	//int y= x+x+x+x+x+x+x+x+x+x+1;
	//for(int i=x; i<y;i+=x) {
	//	System.out.println(i);
	//}
	
	
	//(3
	
	 // Random randy = new Random();
	 //int q=randy.nextInt((160)-47); 
	//System.out.println(q);
	
	
	//(4
	
	//String fall= JOptionPane.showInputDialog("How many inches of rain have fallen?");
	//int fill= Integer.parseInt(fall);
	//if(fill<=2) {
	//	JOptionPane.showMessageDialog(null,"Watch out for fires.");
	//}
	//else if(fill>2 && fill<10) {
	//	JOptionPane.showMessageDialog(null,"The plants are happy.");
	//}
	//else {
	//	JOptionPane.showMessageDialog(null,"You better buy a boat.");
	//}
	
	
	//(5
	
	//for(int i=1;i<101;i++) {
		//if(i%7==0) {
		//	System.out.println(i);
		//}
	//}
	
	
	//(6
	
//int x=Multiply(6,2);
	//System.out.println(x);
//}
//private static int Multiply(int x, int y) {
//int m=x*y;
	//return m;	
	
}	
}

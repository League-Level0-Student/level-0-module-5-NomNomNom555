package extratwo;

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
	int k=1;
	
	for(int i=1;i<4;i++) {
		String wha="";
		for(int j=1;j<4;j++) {
		wha+=Integer.toString(k)+" ";
		k=k+1;
	}
		System.out.println(wha);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}

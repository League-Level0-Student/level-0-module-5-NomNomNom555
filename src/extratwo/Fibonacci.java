package extratwo;

public class Fibonacci {
public static void main(String[] args) {

	int fone= 0;
	int ftwo= 1;
	int answer  ;
	System.out.println(fone);
	System.out.println(ftwo);
	for(int i=0;i<11;i++) {
		answer= fone+ftwo;
		System.out.println(answer);
		fone=ftwo;
		ftwo=answer;
	}
	

	
}
}

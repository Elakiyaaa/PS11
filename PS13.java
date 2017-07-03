package PS11;

import java.util.Scanner;

public class PS13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int temp=0,d=0;
		while(a!=0){
		temp=a%10;
		d=(d*10)+temp;
		a=a/10;
		}
		System.out.println(d);
	}

}

package PS11;

import java.util.Scanner;

public class HS31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int prt=1,prt1=1;
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
	if(a[i]>=0){
		prt=prt*a[i];
		}
	}
System.out.println("PRODUCT OF POSITIVE NUMBERS "+prt);
	for(int i=0;i<n;i++){
	if(a[i]<0){
prt1=prt1*a[i];
		
	}
}
	System.out.println("PRODUCT OF NEGATIVE NUMBERS"+prt1);
	if(prt>prt1){
		System.out.println("POSITIVE NUMBERS ARE MAXIMUM");
	}
	else{
		System.out.println("NEGATIVE NUMBERS ARE MAXIMUM");
		
	}
	}
}
	



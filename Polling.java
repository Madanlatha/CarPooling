package carPolling;

import java.util.Scanner;

public class Polling {
	public static void polling(int ar[][],int n,int m,int cap,int pass) {
		int count=0;
		if(pass==cap) {
			for(int i=0;i<n;i++) {
				if(ar[i][1]<ar[i][2]) {
					count++;
				}
			}
			if (count == n) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
		else {
			System.out.println(false);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int pass=0;

		int ar[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ar[i][j]=sc.nextInt();
				
			}
			pass+=ar[i][0];
		}
		int capacity=sc.nextInt();
		polling(ar,n,m,capacity,pass);
	}

}

package hw;
/*
 * Topic:輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。
 * Date: 2016/11/14
 * Author: 103021043 何宙運
 */
import java.util.*;
public class hw03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入C(M,N) ~~~  M!/[N!(M-N)!]");
		System.out.print("M:");
		int a =scn.nextInt();
		System.out.print("N:");
		int b =scn.nextInt();
		F(a,b);
		}
	private static void F(int a,int b){
	 int t=1; 
	 int y=1;
	 int z=1;
	 int c=a-b;
		for(int i=1;i<=a;i++){
			t*=i;
        		}  
		for(int j=1;j<=b;j++){
			y*=j;
	     	}  
		for(int k=1;k<=c;k++){
			z*=k;
		  }  
		System.out.print("輸出"+t/(y*z));
	  }	
	}

package com.ljc.question1;

import java.util.ArrayList;

public class JavaQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> result=new ArrayList<Integer>();
		result=getPrime(1, 20);
		for(Integer tmp:result){
			System.out.println(tmp);
		}
		System.out.println(result.size());
	}
	/**
	 * 1,1,2,3,5,8,13,21...
	 * @param n
	 * @return
	 */
	public static int fun(int n) {
		if(n==1||n==2)
			return 1;
		else 
			return fun(n-1)+fun(n-2);
	}
	/**
	 * 两个数之间所有的素数
	 * @param beginNum
	 * @param endNum
	 * @return ArrayList
	 */
	public static ArrayList<Integer> getPrime(int beginNum,int endNum){
		ArrayList<Integer> result=new ArrayList<Integer>();
		if(beginNum<5){
			result.add(1);
			result.add(2);
			result.add(3);
		}
		for(int j=beginNum;j<=endNum;j++){
			for (int i = 2; i<=Math.sqrt(j); i++) {
				if(j%i==0|| j==1)
					break;
				else{
				if(i>=(int)Math.sqrt(j))
					result.add(j);
				}
			}
		
		
	}
		return result;
}
}


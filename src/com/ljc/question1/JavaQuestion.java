package com.ljc.question1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class JavaQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(10));
	}
	
	public static int fun(int n) {
		if(n==1||n==2)
			return 1;
		else 
			return fun(n-1)+fun(n-2);
		}
	}


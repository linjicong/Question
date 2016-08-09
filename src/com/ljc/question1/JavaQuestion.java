package com.ljc.question1;

import java.util.ArrayList;

public class JavaQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> result=new ArrayList<Integer>();
		result=compNumber(1000);
		for(Integer tmp:result){
			System.out.println(tmp);
		}
		System.out.println(result.size());*/
		//count("dasdsf 我的撒旦145665 ");
		question(100,10);
	}
	/**
	 * 1
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
	 * 2
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

	/**
	 * 3
	 * 求水仙花数
	 * @param beginNum
	 * @param endNum
	 * @return
	 */
	public static ArrayList<Integer> getNarcissistic(int beginNum,int endNum) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		if(beginNum<100||beginNum>999||endNum<100||endNum>999||beginNum>endNum) 
			System.out.println("参数错误");
		for(int j=beginNum;j<=endNum;j++){
			int one=j%10;
			int ten=(j%100)/10;
			int hundred=j/100;
			if(j==one*one*one+ten*ten*ten+hundred*hundred*hundred)
				result.add(j);
		}
		return result;
	}

	/**
	 * 4
	 * 分解质因数
	 * @param n
	 */
	public static void decompose(int n){
		System.out.print(n+"=");
		for (int i=2;i<n+1;i++){
			while (n%i==0&&n!=i){
				n/=i;
				System.out.print(i+"*");
			}
			if(n==i){
				System.out.print(i);
				break;
			}
		}
	}

	/**
	 * 5
	 * 计算分数
	 * @param n
	 */
	public static void grade(int n){
		if(n>100||n<0)
			System.out.println("输入无效");
		else{
			String str=(n>=90)? "分，属于A等":((n>60)? "分，属于B等":"分，属于C等");
			System.out.println(n+str);
		}
	}

	/**
	 * 6
	 * 计算最大公约数，最小公倍数
	 * 辗转相除法
	 * @param n
	 */
	public static void max_min(int m,int n){
		int temp=1;
		int yshu=1;
		int bshu=m*n;
		if(n<m){
			temp=n;
			n=m;
			m=temp;
		}
		while(m!=0){
			temp=n%m;
			n=m;
			m=temp;
		}
		yshu=n;
		bshu/=n;
		System.out.println("最大公约数="+yshu);
		System.out.println("最大公倍数="+bshu);
	}

	/**
	 * 7
	 * 统计出其中英文字母、空格、数字和其它字符的个数
	 * @param str
	 */
	public static void count(String str){
		String E1="[\u4e00-\u9fa5]";
		String E2="[a-zA-Z]";
		String E3="[0-9]";
		String E4="[\\s]";
		int countChinese = 0;
		int countLetter = 0;
		int countNumber = 0;
		int countSpace = 0;
		int countOther = 0;
		char[] array_Char = str.toCharArray();//将字符串转化为字符数组
		String[] array_String = new String[array_Char.length];//汉字只能作为字符串处理
		for(int i=0;i<array_Char.length;i++)
			array_String[i] = String.valueOf(array_Char[i]);
		//遍历字符串数组中的元素
		for(String s:array_String){
			if(s.matches(E1))
				countChinese++;
			else if(s.matches(E2))
				countLetter++;
			else if(s.matches(E3))
				countNumber++;
			else if(s.matches(E4))
				countSpace++;
			else
				countOther++;
		}
		System.out.println("输入的汉字个数："+countChinese);
		System.out.println("输入的字母个数："+countLetter);
		System.out.println("输入的数字个数："+countNumber);
		System.out.println("输入的空格个数："+countSpace);
		System.out.println("输入的其它字符个数："+countOther);

	}

	/**
	 * 8
	 * 计算完数
	 * @param n
	 */
	public static ArrayList compNumber(int n){
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int i=1;i<n+1;i++){
			int sum=0;
			for(int j=1;j<i/2+1;j++){
				if(i%j==0){
					sum+=j;
					if(sum==i){
						result.add(i);
					}
				}
			}
		}
		return result;
	}

	public static void question(int height,int times){
		int sum=0;
		for(int i=0;i<times;i++){
			sum+=height;
			height/=2;
		}
		System.out.println(sum);
	}

}


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
		//count("dasdsf �ҵ�����145665 ");
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
	 * ������֮�����е�����
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
	 * ��ˮ�ɻ���
	 * @param beginNum
	 * @param endNum
	 * @return
	 */
	public static ArrayList<Integer> getNarcissistic(int beginNum,int endNum) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		if(beginNum<100||beginNum>999||endNum<100||endNum>999||beginNum>endNum) 
			System.out.println("��������");
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
	 * �ֽ�������
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
	 * �������
	 * @param n
	 */
	public static void grade(int n){
		if(n>100||n<0)
			System.out.println("������Ч");
		else{
			String str=(n>=90)? "�֣�����A��":((n>60)? "�֣�����B��":"�֣�����C��");
			System.out.println(n+str);
		}
	}

	/**
	 * 6
	 * �������Լ������С������
	 * շת�����
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
		System.out.println("���Լ��="+yshu);
		System.out.println("��󹫱���="+bshu);
	}

	/**
	 * 7
	 * ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���
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
		char[] array_Char = str.toCharArray();//���ַ���ת��Ϊ�ַ�����
		String[] array_String = new String[array_Char.length];//����ֻ����Ϊ�ַ�������
		for(int i=0;i<array_Char.length;i++)
			array_String[i] = String.valueOf(array_Char[i]);
		//�����ַ��������е�Ԫ��
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
		System.out.println("����ĺ��ָ�����"+countChinese);
		System.out.println("�������ĸ������"+countLetter);
		System.out.println("��������ָ�����"+countNumber);
		System.out.println("����Ŀո������"+countSpace);
		System.out.println("����������ַ�������"+countOther);

	}

	/**
	 * 8
	 * ��������
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


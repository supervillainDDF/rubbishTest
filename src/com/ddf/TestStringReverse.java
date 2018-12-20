package com.ddf;
/*
 * 将一个字符串进行反转。将字符串指定部分进行反转，比如讲“abcdefg”反转成“abfedcg.”
 */
public class TestStringReverse {
	public static void main(String[] args) {
		String str="abcdefghijk";
		//String str1=reverseString(str,2,5);
		String str2=reverseString1(str,2,5);
		System.out.println(str2);
		//System.out.println(str2);
	}
	//方法一：
//	public static String reverseString(String str,int start,int end) {
//		char[]c=str.toCharArray();
//		return reverseArray(c,start,end);
//	}
//	public static String reverseArray(char[]c,int start,int end) {
//		for(int i=start,j=end;i<j;i++,j--) {
//			char temp=c[i];
//			c[i]=c[j];
//			c[j]=temp;
//		}
//		//字符数组转换成字符串。
//
//		return new String(c);
//	}
//
//
	//方法二：
	//将一个字符串进行反转。将字符串中指定的部分进行反转。(考虑使用StringBuffer将此算法优化)
	public static String reverseString1(String str,int start,int end) {
		String str2=str.substring(0, start);
		for(int i=end;i>=start;i--) {
			char c=str.charAt(i);
			str2+=c;
		}
		//str2+=str.substring(end,str.length()-1);
		str2+=str.substring(end+1);
		return str2;
	}
}

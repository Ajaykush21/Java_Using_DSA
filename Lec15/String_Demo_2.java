package Lec15;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		String str1="Bye";
		String s= str+str1;// String s= str.concat(str1);
		String s1=str+"by";
		String s2="by"+str;
		String s3="hello"+"hello";//yahi ek case pool me banega
		String s4="hello"+"hello";
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s3==s4);
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		
		
		


	}

}

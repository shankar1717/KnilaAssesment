package Assesment;

import static org.testng.Assert.assertEquals;

public class Expressions {

	public static void main(String[] args) {

		//Given an expression string exp, write a program to examine whether the pairs 
		//and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.
		//Input: exp = “[()]{}{[()()]()}”  Output: Balanced
		//Input: exp = “[(])”  Output: Not Balanced
		
		//scanner sc=new scanner(System.in);
		
		String input="[()]{}{[()()]()}";
		//String input1="[(])";
		//char[] c=input.toCharArray();
		int len=input.length();
		int top=-1;
		
		for(char bracket:input.toCharArray()) {
		
		if(top<len-1) {
			len[++top]=bracket;
		}else {
		//System.out.println("Not Balaced");	
		
		if((bracket==')') && top>=0 && len[top--]!='(') ||
		
		 ((bracket=='}') && top>=0 && len[top--]!='{') ||
		 
		 ((bracket==']')  && top>=0 && len[top--]!='[' ){
			
		}

		
		
		{
			
		}
		
			
		
		
		
		
		
		
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c.length; j++) {
//				if(c[i]==c[j]) {
//					System.out.println("Balanced");
//				}else {
//					System.out.println("Not Balanced");
//					
//				}
//				
			}
			
		}
		
		//assert.assertEquals(false, null);
		
		

	}

}

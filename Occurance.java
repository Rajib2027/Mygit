package com.te.javabasics.string;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string="testyantra";
char c ='t';
int count=0;
for(int i=0;i<string.length();i++) {
	if (string.charAt(i) ==c)
		count++;
}
System.out.println(count);

}
}

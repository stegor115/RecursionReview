//Stephen Gordon
public class Main {
	public static void main (String args[]){
		System.out.println("Greatest Common Divisor");
		System.out.println(greatCommonDivide(14,30));
		System.out.println("------------------------------------------");
		System.out.println("Factorial");
		System.out.println(factorial(13));
		System.out.println("------------------------------------------");
		System.out.println("Multiply");
		System.out.println(multiply(132,11));
		System.out.println("------------------------------------------");
		System.out.println("Reverse String");
		System.out.println(reverseString("this is a test"));
		System.out.println("------------------------------------------");
		System.out.println("Elfish Test");
		System.out.println("catchphrase is elfish: " + Elfish("catchphrase")); // Recursion not needed?
		System.out.println("------------------------------------------");
		
	} //end method
	public static int greatCommonDivide(int a, int b){
		if(a == 0 || b == 0){
			return a+b;
		} //end if
		return greatCommonDivide(b,a%b); //b is in a spot, a%b is in b spot
	}//end method
	
	public static int factorial(int n){
		if(n == 0){
			return 1; //Once n hits 1, it returns 1 to recursive call, multiplying n by 1 for answer.
		} else{
			return n * factorial(n-1);
		} //end if else
	} //end method
	
	public static int multiply(int a, int b){
		if( b == 1 ){
			return a;
		} else{
			return a + multiply(a,b-1);
		} //end if else
	} //end method
	
	public static String reverseString(String str){
		if(str.length() == 0){
			return ""; //If string has nothing
		} //end if
		//System.out.println("Debug :" + str);
		return str.substring(str.length()-1) + reverseString(str.substring(0,str.length()-1));
	} // end method
	
	public static boolean Elfish(String s){
		return Elfish(s, 0 , false, false, false);
	}
	
	public static boolean Elfish(String s, int i , boolean e, boolean l, boolean f){
		if(i >= s.length() || (e && l && f)){
			return (e && l && f);
		} //end if
		
		//Lack of case statement makes me sad
		if(Character.toLowerCase(s.charAt(i)) == 'e'){
			e = true;
		} //end if
		
		if(Character.toLowerCase(s.charAt(i)) == 'l'){
			l = true;
		} //end if
		
		if(Character.toLowerCase(s.charAt(i)) == 'f'){
			f = true;
		} //end if
		
		return Elfish(s, ++i, e, l, f);
	} //end method
	
	//Original elfish code below
//	public static boolean elfishWord(String str){ // Recursion not needed? No loops either.
//		//Original code below
//		str = str.toLowerCase(); //Deals with capital letters
//		if(str.contains("e") && str.contains("l") && str.contains("f")){ //This works, what's wrong with it?
//			return true;
//		} else{
//			return false;
//		} //end if else
//	} // end method
} //end class

package java8.mod.romanDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Map<Character,Integer> numberMap=new HashMap();
	static
	{
		numberMap.put('I',1);
		numberMap.put('V',5);
		numberMap.put('X',10);
		numberMap.put('L',50);
		numberMap.put('C',100);
		numberMap.put('D',500);
		numberMap.put('M',1000);
	}
	public static int convertRomanToDecimal(String romanNumber)
	{
		int decimalNumber=0;
		romanNumber=romanNumber.toUpperCase();
		  for(int i=0;i<romanNumber.length();i++)
		  {
		 	 char ch=romanNumber.charAt(i);
		 	 int x=numberMap.get(ch);
		 	 if(i==0)
		 		 decimalNumber=decimalNumber+x;
		 	  
		 	 if(i<(romanNumber.length()-1))
		 	    { 
		 		 int j=i+1;
		 	     char sh=romanNumber.charAt(j);
		 	     int y=numberMap.get(sh);
		 	     if(x>=y)
		 		   decimalNumber=decimalNumber+y;
		 	     else if (x<y)
		 	       decimalNumber=decimalNumber+y-x-x;
		 	    }
		  }// end of for loop
      return decimalNumber;
	}


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Roman number:");
		String romanNumber=scanner.nextLine();
		System.out.println(convertRomanToDecimal(romanNumber));
	}
}

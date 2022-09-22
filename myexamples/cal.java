package myexamples;
import java.util.*;
public class cal {
            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = ("+,*,-,/,%");
        System.out.println(s);
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the operation");
        String c = sc.nextLine();
        System.out.println("enter the first no");
        int a = sc.nextInt();
        System.out.println("enter the 2nd no");
        int b = sc.nextInt();
        switch (c)
        {
        
        	case "+" :
        	    System.out.println("the addition of " +a+ " & " +b+ " is "+(a+b) );
        	    break;
        	case "-" :
        		System.out.println("the substraction of " +a+ " & " +b+ " is "+(a-b) );
        	    break;
        	case "*" :
        		System.out.println("the multipication of " +a+ " & " +b+ " is "+(a*b) );
        	    break;
        	case "/" :
        		System.out.println("the dividion of " +a+ " & " +b+ " is "+(a/b) );
        	    break;
        	case "%" :
        		System.out.println("the moduletion of " +a+ " & " +b+ " is "+(a%b) );
        	    break;
        }
        		
	}

}

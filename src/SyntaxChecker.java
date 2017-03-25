import java.util.Scanner;
import java.util.regex.*;

public class SyntaxChecker
{
	public static void main(String[] args){
	       //Mohammed Altaher
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	              try{
	         String pattern = in.nextLine();
	             Pattern r = Pattern.compile(pattern);
	               System.out.println("Valid");
	              }
	      catch(Exception e){
	         
	          System.out.println("Invalid");
	      
	         
	         }
	       testCases--;
	      }
	   }
}

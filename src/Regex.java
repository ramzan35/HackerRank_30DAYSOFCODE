import java.util.regex.*;

public class Regex {

	public static void main(String[]args){
		
	String longString = "Software design principles represent a CAf set of guidelines that helps us to avoid having a bad design. "
			+ "The design principles ramzandieze35@gmail.com are associated to Robert 151 Martin who gathered them in Agile Software Development: Principles, Patterns, "
			+ "and Practices. According to Robert Martin there 51425 are 3 important characteristics of a bad design that should be avoided";

	String strangeString = "1Z aaa ********* ** **** {{ {{{ { {{{{{{{";
	
	//Word that is 2 to 20 characters in length -> [A-Za-z]{2,20} or  \\w{2,20}
	//	regexChecker("\\s[A-Za-z]{2,20}\\s",longString);
	
	//Zip code 5 digits long
	//regexChecker("\\s\\d{5}\\s",longString);
	
	//Two character that start with C or A
	//A[KLRZ]|C[AOT]
	//regexChecker("A[KLRZ]|C[AOT]",longString);
	
	//email checker ramzandieze35@gmail.com
	regexChecker("[A-Za-z0-9./%-]+@[A-Za-z0-9./%-]+\\.[A-Za-z]{2,4}",longString);
	}

	public static void regexChecker(String theRegex,String str2check){
		
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2check);
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() != 0){
				System.out.println(regexMatcher.group().trim());
			}
		}
	}
}

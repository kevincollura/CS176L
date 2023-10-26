package Week8;

public class whiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String inputString = "Computer Science Monmouth University";

	      
	String stringWithout = remove (inputString);

	        
	System.out.println("String without spaces: " + stringWithout);
	   }

	public static String remove (String input) {
	        
		  StringBuilder result = new StringBuilder();

	       
	for (int i = 0; i < input.length(); i++) {
	  char currentChar = input.charAt(i);

	           
	if (!Character.isWhitespace(currentChar)) {
	                
	result.append(currentChar);
	            }
	        }

	       
	 return result.toString();		
	}

}

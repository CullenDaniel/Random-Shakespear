package codingMonkeys;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				int numberOfLoops =0;
				ArrayList<String> maybeWord;
				maybeWord = new ArrayList<String>();
				Scanner user = new Scanner(System.in);  // Reading from System.in
				System.out.println("Enter a 5 letter word");
				String input = user.next(); 
				maybeWord.add("MAYBE");
				maybeWord.add("WE'LL");
				maybeWord.add("GET");
				maybeWord.add("A");
				maybeWord.add("REAL");
				maybeWord.add("WORD");
				
				int i =0;
				//System.out.println(maybeWord);
				
				String baseChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				StringBuilder wordForm = new StringBuilder();
				Random rng = new Random();
				
				int[] nums = new int[5];
				
				
			for (int j= 0; j < 5; j++){	
					for ( i = 0; wordForm.length() < 5; i++) {
			           // int index = (int) (rng.nextDouble() * baseChar.length());
						double foo;
						foo = rng.nextDouble();
						//System.out.println(foo);
						int index = (int) (foo * baseChar.length());
			            wordForm.append(baseChar.charAt(index));
			            
				}
					maybeWord.add(new String (wordForm));
					wordForm = new StringBuilder();
					//if (maybeWord.toString().contains("t")) {
					//	System.out.println("test");
					//}
					//add a loop and check each element of the ArrayList individually.
					//i if(maybeWord.get(i).contains....
					
					}
				//System.out.println(Math.random());
				//System.out.println(rng);
		        //String randomCharacters = wordForm.toString();
		       // System.out.println(wordForm); 
				
				
			
				//maybeWord.add(rng.next(wordForm));
				System.out.println(maybeWord); 
				
				int a =0;
				for (a=0; a <=maybeWord.size(); a++){
				if (maybeWord.get(a).contains(input)){
					System.out.println("Test");
					System.out.println(numberOfLoops);
				}
				
				else {
					numberOfLoops++;
					for (int k= 0; k < 5; k++){	
						for ( i = 0; wordForm.length() < 5; i++) {
							double foo;
							foo = rng.nextDouble();
							int index = (int) (foo * baseChar.length());
				            wordForm.append(baseChar.charAt(index));
				            
					}
						maybeWord.add(new String (wordForm));
						wordForm = new StringBuilder();
					}
					System.out.println(maybeWord);
				}
				
			}
		


	}

}

package arrays2;

public class StrUtils {
	
	// projekt heute
	
	int countChars(String s){
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++){
			
			if(Character.isLetter(s.charAt(i)))
			count++;
			
		}
		
		return count;
	}


}

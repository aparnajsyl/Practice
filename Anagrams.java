
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
    	/*HashMap<Character, Integer> aMap = new HashMap<Character, Integer>();
    	HashMap<Character, Integer> bMap = new HashMap<Character, Integer>();
    	char[] aArray = a.toLowerCase().toCharArray();
    	char[] bArray = b.toLowerCase().toCharArray();
    	
    	for(int i=0; i<aArray.length-1;i++) {
    		int charCount = 0;
    		char compareCharacter = aArray[i];
	    	for(char ch: aArray) {
	    		if(ch == compareCharacter) {
	    			charCount++;
	    		} 		
	    	}
	    	aMap.put(compareCharacter, charCount);
	    	compareCharacter = aArray[i+1];
    	}
    	
    	for(int i=0; i<bArray.length-1;i++) {
    		int charCount = 0;
    		char compareCharacter = bArray[i];
	    	for(char ch: bArray) {
	    		if(ch == compareCharacter) {
	    			charCount++;
	    		} 		
	    	}
	    	bMap.put(compareCharacter, charCount);
	    	compareCharacter = bArray[i+1];
    	}
    	
    	if (aMap.equals(bMap)) {
    		return true;
    	}else {
    		return false;
    	}  */
    	
    	 String A=a.toLowerCase();
         String B=b.toLowerCase();
          boolean f = false;
         char[] c = A.toCharArray();
         Arrays.sort(c);
         char[] d = B.toCharArray();
         Arrays.sort(d);
         String a1 = new String (c);
         String b1 = new String (d);
         if (a1.equals(b1)) {
             f=true;
         }
         return f;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
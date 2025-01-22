package practice.solving;

public class Problem_7 {

	class Solution {

	    public String solution(String myString) {
	        myString = myString.toLowerCase();
	        myString = myString.replace('a', 'A');

	        return myString;
	    }
	}
	//===========================================================
	// 2차시도 
	class Solution1 {
	    public String solution(String myString) {
	        String answer = myString.toLowerCase();
	        answer.replace("a", "A");
	        return answer;
	    }
	}
	
	//===========================================================
	// 3차시도 
	
	class Solution2 {
	    public String solution(String myString) {
	        myString = myString.toLowerCase();
	        String answer = myString.replace('a', 'A');
	        return answer;
	    }
	}

	


	
	
	
	
	
	
}

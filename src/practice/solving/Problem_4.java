package practice.solving;

public class Problem_4 {
	  public String solution(String my_string, String alp) {
	        String [] answer = my_string.split("");
	        String result = "";
	        for(String ans : answer){
	            if(alp.equals(ans)) {
	                result += ans.toUpperCase();
	            }else{
	                result += ans;
	            }
	        } 
	        return result;
	    }
}

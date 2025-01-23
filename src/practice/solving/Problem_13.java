package practice.solving;

public class Problem_13 {

	//===============정답코드==========
	class Solution {
	    public int solution(int[] num_list) {
	        int answer = 0;

	        int even = 0;
	        int odd = 0;

	        for(int num : num_list) {
	            if(num % 2 == 0) {
	                even *= 10;
	                even += num;
	            } else {
	                odd *= 10;
	                odd += num;
	            }
	        }
	        answer = even + odd;

	        return answer;
	    }
	
	
	
	
	//================1차 실패
	
	class Solution2 {
	    public int solution(int[] num_list) {
	        String even = "";
	        String odd = "";
	        
	        for(int num : num_list){
	            if(num % 2 == 0){
	                even += Integer.toString(num);
	            }else{
	                odd += Integer.toString(num);
	            }
	        }
	        return Integer.parseInt(even) + Integer.parseInt(odd);
	    }
	}

	}}	


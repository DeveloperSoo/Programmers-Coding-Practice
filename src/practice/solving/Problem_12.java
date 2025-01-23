package practice.solving;

public class Problem_12 {
	// ===============성공 코드========
	
	class Solution {
	    public int[] solution(int[] arr) {
	        int [] answer = new int[arr.length];
	        for(int i = 0; i < arr.length ; i++){
	            if(arr[i] >= 50 && arr[i] % 2 == 0){
	                answer[i] = (arr[i] / 2);
	            }else if(arr[i] < 50 && arr[i] % 2 != 0){
	                answer[i] = (arr[i] * 2);
	            }else {
	                answer[i] = arr[i];
	            }
	        }
	     return answer;
	    }
	}
	
	
	
	
	// =========================== 1차 시도
	
	class Solution2 {
	    public int[] solution(int[] arr) {
	        int [] answer = new int[arr.length];
	        for(int i = 0; i < arr.length ; i++){
	            if(arr[i] >= 50 && arr[i]%2==0){
	                answer[i] = arr[i] /2;
	            }else if(arr[i] < 50 && arr[i]%2!=0){
	                answer[i] = arr[i] * 2;
	            }
	        }
	     return answer;
	    }
	}
}

package practice.solving;

import java.util.*;

public class Problem_18 {
	class Solution {
	    public String solution(String[] str_list, String ex) {
	        StringBuffer stb = new StringBuffer();
	        
	        for(String str : str_list){
	            if(!str.contains(ex)){
	                stb.append(str);
	            }
	        }   
	        return stb.toString();
	    }
	}
}

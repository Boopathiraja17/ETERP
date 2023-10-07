package org.sam;

public class PermutationExample {
	    public static void main(String[] args) {
	        String input = "abcd";
	        permute(input);
	    }
	    
	    public static void permute(String input){
	        permute("", input);
	    }
	    
	    private static void permute(String prefix, String remaining){
	        int n = remaining.length();

	        if(n == 0){
	            System.out.println(prefix);
	        }
	        else {
	            for(int i = 0; i < n; i++){
	                String newPrefix = prefix + remaining.charAt(i);
	                String newRemaining = remaining.substring(0, i) + remaining.substring(i+1);
	                permute(newPrefix, newRemaining);
	            }
	        }
	    }
}

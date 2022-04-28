package problem_Statement5_2;

public class SplitString {
public static void main(String[] args) {
			
		String txt= (" 23  +  45  -  (  343  /  12  ) ");
		String[] w=txt.split("\\b \\t \\n \\f \\r \\\" \\' \\");
		
		for(String w1:w){  
			System.out.println(w1); 
			//System.out.println(" ");
		}
	}

	}

package test;

public class test12 {  
	    public static void main (String[] args) {
	        
	        String str= "Venkatesh", nstr="";
	        char ch;
	        
	      System.out.print("Original word: ");
	      System.out.println("Venkatesh");
	        
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i);
	        nstr= ch+nstr; 
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
	}

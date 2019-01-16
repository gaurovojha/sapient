package com.sapient.gs;

public class MissingCharactersInPangram {

	public MissingCharactersInPangram() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {    
		String st = "abcaavdz";
	    String s="abcdefghi  mnopqrstuvwxy";
	    System.out.println(s.indexOf('a'));
	    
	    
	    
	    s=s.replaceAll(" +", "");
	    System.out.println(s);

	    System.out.println(s);
	    s=s.toLowerCase();
	    System.out.println(s);
	    StringBuilder sb=new StringBuilder();
	    for ( char c='a'; c<='z' ; c++){      
	      if(s.indexOf(c)<0) sb.append(c);            
	    }    
	    System.out.println(sb.toString());
	  }
}

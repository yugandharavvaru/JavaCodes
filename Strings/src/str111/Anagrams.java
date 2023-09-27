package str111;

import java.util.Arrays;

public class Anagrams {


    static void isAnagram(String str1,String str2)
    {
    	 String s=str1.replaceAll("\\s","");
    	String ss=str2.replaceAll("s\\s","");
    	boolean status=true;
    	if(s.length()!=ss.length())
    	{
    		status=false;
    	}
    	else
    	{
    		char []Array1=s.toLowerCase().toCharArray();
    		char []Array2=ss.toLowerCase().toCharArray();
    		Arrays.sort(Array1);
    		Arrays.sort(Array2);
    		status=Arrays.equals(Array1, Array2);
    		
    		if(status)
    		{
    			System.out.println(s+"  "+ss+" are anagrams" );
    		}
    		else
    		{
    			System.out.println(s+" "  + "and "  +ss+"are not anagrams");
    		}
    	}

    }
    		
	public static void main(String[] args) {
      
	   isAnagram("peek","keep");
	   isAnagram("tea","eat");
	}

}

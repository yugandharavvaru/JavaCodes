package str111;
import java.util.Scanner;
public class Countvowels {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
         String s=sc.next();
         char word []=s.toCharArray();
         int vcount=0;
         int ccount=0;
         
         for(int i=0;i<word.length;i++)
         {
        	 if(word[i]=='a' || word[i]=='e' || word[i]=='i' || word[i]=='o' || word[i]=='u')   
         {
        		 vcount++;
        		 
         }
        	 else
        	 {
        		 ccount++;
        	 }
         }
         System.out.println("the vowels are :" +vcount);
         System.out.println("the vowels are :" +ccount);
         System.out.println(word.length);
        	 
	}

}

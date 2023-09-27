package str111;

public class Eachword {

	public static void main(String[] args) {
	
		String str="thecapital word";
		String word[]=str.split(" ");
		for(int i=0;i<word.length;i++)
		{
			String fletter=word[i].substring(0,1);
			String rword=word[i].substring(1);
			fletter=fletter.toUpperCase();
			
			String remainingword=fletter+rword;
			word[i]=remainingword;
			System.out.print(word[i]+" ");
			
		}

	}

}

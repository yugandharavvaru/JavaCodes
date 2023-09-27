package str111;

public class StringPalindrome {

	public static void main(String[] args) {

		String str="madam";
		System.out.println(str);
		boolean temp=true;
		str=str.toLowerCase();
		for(int i=str.length();i<=0;i--)
		{
			if(str.charAt(i) != str.charAt(str.length()-i))
			{
				temp =false;
				break;
			}
		}
		if(temp) {
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println(" not a palindrome");
		}
	}

}

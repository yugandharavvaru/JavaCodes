package str111;

public class Strings1 {

	public static void main(String[] args) {
	       
		String str=new String ("yugan");
		String str1=new String("avvaru");
		String str2=new String("yugan");
		System.out.println(str==str1);
		System.out.println(str==str2);//false.... bcoz of separate creation of object.
	}

}
